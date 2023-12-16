package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHandling {

	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/bootstrap-dual-list.php");
		driver.manage().window().maximize();
		
		WebElement drag=driver.findElement(By.xpath("(//option[@value='option1'])[1]"));
		WebElement drop=driver.findElement(By.name("duallistbox_demo1[]_helper1"));
		
		Actions action=new Actions(driver);
		action.moveToElement(drag).click().build().perform();
		
		
		
	}
	
	
}
