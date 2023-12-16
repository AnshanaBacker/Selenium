package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String sourcecode=driver.getPageSource();
		System.out.println(sourcecode);
		
		//driver.close();
		//driver.quit();
		
		
	//	how to capture all links in the webpage?
				
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println("total number of links"+list.size());
		for(WebElement e:list)
		{
			System.out.println(e.getText());//link name
			System.out.println("hyperlink reference is"+e.getAttribute("href"));//from here we get the link
		}
		
		
	}

}
