package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.hyrtutorials.com/p/window-handles-practice.html ");
		driver.manage().window().maximize();
		
		String parentWindowHandle=driver.getWindowHandle();
		System.out.println("Parent Window Handle is"+parentWindowHandle);
		
		WebElement image=driver.findElement(By.id("newWindowBtn"));
		image.click();
		
		Set<String> handleAllWindowOperations=driver.getWindowHandles();
		for(String handle:handleAllWindowOperations) 
		{
			if(!handle.equalsIgnoreCase(parentWindowHandle))
			{
				driver.switchTo().window(handle);
				driver.manage().window().maximize();
				
				WebElement firstnameBox=driver.findElement(By.id("firstName"));
				firstnameBox.sendKeys("Anshana");
				
				WebElement lastnameBox=driver.findElement(By.id("lastName"));
				lastnameBox.sendKeys("Backer");
				
				WebElement genderCheckbox=driver.findElement(By.id("femalerb"));
				genderCheckbox.click();
				
				WebElement languageknown=driver.findElement(By.id("englishchbx"));
				languageknown.click();
				
				WebElement languageknown1=driver.findElement(By.id("hindichbx"));
				languageknown1.click();
				
				WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
				email.sendKeys("anshana@gmail.com");
				
				WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
				password.sendKeys("ansha");
				
				WebElement registerbutton=driver.findElement(By.id("registerbtn"));
				registerbutton.click();
				
				WebElement text=driver.findElement(By.xpath("//label[@id='msg']"));
			    String msg=text.getText(); 
			    System.out.println(msg);
				  
			}
		}
		
		       driver.switchTo().window(parentWindowHandle);
		       
		       WebElement mainWindowText=driver.findElement(By.xpath("//h1[@itemprop='name']"));
		       String text=mainWindowText.getText();
		       System.out.println(text);
		       
		       driver.quit();
		
		
		
		
		
		
	}

}
