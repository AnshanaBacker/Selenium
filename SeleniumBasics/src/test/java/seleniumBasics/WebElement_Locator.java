package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		WebElement messagetextbox=driver.findElement(By.id("single-input-field"));	//locate and declare
		
		messagetextbox.clear();
		messagetextbox.sendKeys("Anshana");
		
		WebElement showmessagebutton=driver.findElement(By.id("button-one"));
		showmessagebutton.click();
		
		//WebElement messagetextbox1=driver.findElement(By.cssSelector("input.single-input-field"));//using css selectir by id
		//WebElement messagetextbox1=driver.findElement(By.cssSelector("input#single-input-field"));//new way using css selector id
		
		WebElement yourmessage=driver.findElement(By.id("message-one"));
		
		String text=yourmessage.getText();
		System.out.println(text);
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		
		WebElement checkboxone=driver.findElement(By.id("check-box-one"));
		checkboxone.click();
		Boolean check=checkboxone.isSelected();
		System.out.println(check);
		
		
	}

}
