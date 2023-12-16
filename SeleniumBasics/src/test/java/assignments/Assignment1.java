package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new EdgeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.navigate().to("https://groceryapp.uniqassosiates.com/home");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.close();
		}

}
