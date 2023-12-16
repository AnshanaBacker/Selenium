package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();//to maximise the window page
		
		WebElement multidrop= driver.findElement(By.id("multi-select-field"));
		multidrop.click();
		
		Select select=new Select(multidrop);
		
		Boolean check=select.isMultiple();//check whether dropdown is multi or single select
		System.out.println(check);
		
		select.selectByValue("Red");
		select.selectByValue("Yellow");
		
		//select.deselectAll();
		//select.deselectByValue("Red");
		List<WebElement> list=select.getOptions();
		for(WebElement e:list)
		{
			System.out.println(e.getText());
		}
		
		List<WebElement> list1=select.getAllSelectedOptions();
		for(WebElement e:list1)
		{
			System.out.println("selected options are"+e.getText());
		}
		WebElement web=select.getFirstSelectedOption();
		System.out.println("Selected element is"+web.getText());
		
		
		 
		
		
		
	}

}
