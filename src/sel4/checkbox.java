package sel4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
   public static void main (String [] args) throws InterruptedException
   {
		ChromeDriver driver = new ChromeDriver();
		//List<WebElement> b= driver.findElements(By.xpath("//input[@type='checkox']"));
	
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		List<WebElement> h = driver.findElements(By.xpath("//input[@type='checkbox']"));
	   for(WebElement k : h) {
		   k.click();
	   }
	 //select all radio button
	   driver.findElements(By.xpath("//input[@value='radio1']"));
	   
	   List<WebElement> n = driver.findElements(By.xpath("//input[@type='radio']"));
	   
	   
	   for(int i=0;i<n.size();i++) {
		   n.get(i).click();
		Thread.sleep(3000);   
	   }
		  
	   
	   
	   
   }
}
