package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
        
		WebElement inputform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputform.click();
		
		WebElement formsubmit=driver.findElement(By.xpath("//a[@href='form-submit.php']"));
		formsubmit.click();
		
		WebElement firstname=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		firstname.sendKeys("Anshana");
		
		WebElement lastname=driver.findElement(By.xpath("//input[@id='validationCustom02']"));
		lastname.sendKeys("Backer");
		
		WebElement username=driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
		username.sendKeys("Ansha");
		
		WebElement city=driver.findElement(By.xpath("//input[@id='validationCustom03']"));
		city.sendKeys("Trivandrum");
		
		WebElement state=driver.findElement(By.xpath("(//input[@class='form-control'])[5]"));
		state.sendKeys("Kerala");
		
		WebElement zip=driver.findElement(By.xpath("(//input[@type='text'])[6]"));
		zip.sendKeys("2345");
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='invalidCheck']"));
		checkbox.click();
		
		WebElement submitbutton=driver.findElement(By.xpath("//button[text()='Submit form']"));
		submitbutton.submit();
		
		WebElement message=driver.findElement(By.xpath("//div[@class='my-2']"));
		String msg=message.getText();	
		System.out.println(msg);
		
		driver.quit();
		}

}
