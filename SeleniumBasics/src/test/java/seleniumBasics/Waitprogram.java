package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));//implicit wait
		
		WebElement username=driver.findElement(By.id("loginform-username"));
		username.sendKeys("carol");
		
		WebElement password=driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		
		WebElement click=driver.findElement(By.xpath("//button[@type='submit']"));
		click.click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(10000));//explicit wait
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Clients']")));
		
		
		WebElement client=driver.findElement(By.xpath("//a[text()='Clients']"));
		client.click();
		
		
		
	}

}
