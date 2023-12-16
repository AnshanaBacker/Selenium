package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get(" https://selenium.obsqurazone.com/index.php");
		
		WebElement logo=driver.findElement(By.cssSelector("img[alt=logo]"));
        
		System.out.println(logo.getSize());
		System.out.println(logo.getLocation());
		
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		
        WebElement yourmessage=driver.findElement(By.id("message-one"));
        
        String tagname=yourmessage.getTagName();
        System.out.println(tagname);
        
        String attr=yourmessage.getAttribute("id");
        System.out.println(attr);
        
        WebElement selectinput=driver.findElement(By.linkText("Select Input"));
        
        String attribute=selectinput.getAttribute(tagname);
        System.out.println(attribute);
        
        String fontfamily=yourmessage.getCssValue("font-size");
        System.out.println(fontfamily);
        
        String fontsize=yourmessage.getCssValue("font-family");
        System.out.println(fontsize);
     driver.close();
       
	
}
}
