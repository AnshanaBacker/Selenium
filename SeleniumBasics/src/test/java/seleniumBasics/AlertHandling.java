package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		driver.manage().window().maximize();
		
		WebElement clickme=driver.findElement(By.xpath("(//button[text()='Click me!'])[2]"));
		clickme.click();
		
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		WebElement clickpromptbox=driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
		clickpromptbox.click();
		driver.switchTo().alert().sendKeys("Anshana");
		
		
		driver.switchTo().alert().accept();
		
	}

}
