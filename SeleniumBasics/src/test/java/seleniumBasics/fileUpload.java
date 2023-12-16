package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fileUpload {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/selenium/upload/");
		driver.manage().window().maximize();
		
		Robot robot=new Robot();
		
		WebElement chooseFile=driver.findElement(By.id("uploadfile_0"));
		
		Actions action=new Actions(driver);
		action.moveToElement(chooseFile).click().build().perform();
		 // action.sendKeys(chooseFile,Keys.ENTER).build().perform();//using sendkeys
		StringSelection ss=new StringSelection("C:\\Users\\ansha\\OneDrive\\Pictures\\Screenshots\\Assignment1 (1).png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		robot.delay(2000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(2000); 
		
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(2000); 
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
		
		
		
		
		
		
		
		
		
		
		


