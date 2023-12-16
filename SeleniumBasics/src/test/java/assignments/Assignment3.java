package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/home");
		driver.navigate().refresh();
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		driver.navigate().refresh();
		String title1=driver.getTitle();
		System.out.println(title1);
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		driver.quit();
	
	}

}
