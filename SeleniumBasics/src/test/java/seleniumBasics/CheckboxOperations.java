package seleniumBasics;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
		
		List<WebElement> list=driver.findElements(By.xpath("//input[@type='checkbox']"));
	    for(WebElement e:list)
	    {
	    	//e.click();
	    	System.out.println(e.isSelected());
	    }
	    
	    List<WebElement> list1=driver.findElements(By.className("check-box-list"));
	    System.out.println("Total checkboxes are"+list1.size());
	    for(WebElement e1:list1)
	    {
	    	String Checkboxname=e1.getAttribute("id");
	    	if(Checkboxname.equals("check-box-one")|| Checkboxname.equals("check-box-three")||Checkboxname.equals("check-box-four"))
	    	{
	    		e1.click();
	    	}
	    }
	    	
	    
	}

}
//to select multiple checkboxes

/*         List<WebElement> list=driver.findElements(By.name("language"));
           int totalcheckboxes=list.size();
           System.out.println(totalcheckboxes);


           for(WebElement e:list)
            {
	          String checkboxname=e.getAttribute("id");
              if(checkboxname.equals("hindichbx")|| checkboxname.equals("latinchbx"))
            {
    	      e.click();
            }
 
    	
 }*/