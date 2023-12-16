package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		//driver.navigate().to("https://selenium.obsqurazone.com/index.php");//to refresh the page
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		 
		driver.navigate().refresh();//refresh/reloads the page
		driver.navigate().back();
		driver.navigate().forward();
		
		}

}
