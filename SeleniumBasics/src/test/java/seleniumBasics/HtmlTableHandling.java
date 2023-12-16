package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTableHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
		
		List<WebElement> list=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[3]"));
		for(WebElement e:list)
		{
			String text=e.getText();
			System.out.println(text);
			
		}
	}

}
