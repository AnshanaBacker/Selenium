package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropdownhandling {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();//to maximise the window page
		
		
		WebElement dropdown=driver.findElement(By.id("single-input-field"));
		dropdown.click();
		
		Select select=new Select(dropdown);//instansiation
		//select.selectByIndex(1);
		//select.selectByValue("Red");
		select.selectByVisibleText("Yellow");
		
		List<WebElement> list=select.getOptions();
		for(WebElement e: list)
		{
			System.out.println(e.getText());
		}
	}

}
