package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.manage().window().maximize();
		
		
		List<WebElement> list=driver.findElements(By.className("form-check-input"));
		
		for(WebElement e:list)
		{
			WebElement femaleradiobutton=driver.findElement(By.id("inlineRadio21"));
			femaleradiobutton.click();
			System.out.println(e.isSelected());
		}
		
		
		
	}

}
