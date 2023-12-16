package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement multidropdown=driver.findElement(By.xpath("(//select[@id='second'])[1]"));
		multidropdown.click();
		
		Select select=new Select(multidropdown);
		select.selectByIndex(0);
		select.selectByValue("burger");

		
		List<WebElement> list=select.getAllSelectedOptions();
		for(WebElement e:list)
		{
		System.out.println("selected options are:" + e.getText());	
		}
		
		//select.deselectByIndex(0);
		//select.deselectByValue("burger");
		
		//driver.quit();
		
	}

}
