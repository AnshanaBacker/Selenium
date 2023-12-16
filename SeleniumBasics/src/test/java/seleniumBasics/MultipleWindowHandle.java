package seleniumBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle {  //same as for if new tab is opened.

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;//to scroll down to the element.
		
		WebElement iframe=driver.findElement(By.id("a077aa5e"));
		js.executeScript("arguments[0].scrollIntoView();",iframe);
		
		
		driver.switchTo().frame(iframe);
		
		String parentWindowHandle=driver.getWindowHandle();
		System.out.println(parentWindowHandle);
		
		WebElement image=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		image.click();
		
		Set<String> handleAllWindows=driver.getWindowHandles();
		
		for(String handle:handleAllWindows)
		{
			
			if(!handle.equalsIgnoreCase(parentWindowHandle)) //if handle not equals 
				                                             //parent window handle
			{
				driver.switchTo().window(handle);
				
				String title=driver.getTitle();
				System.out.println(title);
				String url=driver.getCurrentUrl();
				System.out.println(url);
			}
		}
		
		driver.switchTo().window(parentWindowHandle);
		
		String titleParentWindow=driver.getTitle();
		System.out.println(titleParentWindow);
		driver.quit();
		
		
	}

}
