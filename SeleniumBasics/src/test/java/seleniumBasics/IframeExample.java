package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		
	   //driver.switchTo().frame("frame13");
		driver.switchTo().frame(13);
		//WebElement iframe=driver.findElement(By.id("frame1"));
		//driver.switchTo().frame(iframe);
		
		WebElement text=driver.findElement(By.id("sampleHeading"));
		System.out.println(text.getText());
		
		driver.switchTo().parentFrame();
		
		//driver.quit();
		
		
	}

}
