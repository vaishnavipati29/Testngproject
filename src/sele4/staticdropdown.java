package sele4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdropdown {

	public static void main(String []args) {
		
		ChromeDriver driver = new ChromeDriver();
 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");		
         
  //        WebElement a = driver.findElement(By.xpath("[@id='ctl00_mainContent_DropDownListCurrency']']"));
    //     Select s = new Select(a);
      //    s.selectByIndex(1);
         
          driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("India");
    List<WebElement> p = driver.findElements(By.xpath("//input[@id='autosuggest"));
     for(WebElement u:p) {
    	if (u.getText().equalsIgnoreCase("India"));{
    		u.click();
    		break;
    		
    	}
     }
	}
	
}
