package sel5;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandling {

public static void main(String []args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://rahulshettyacademy.com/AutomationPractice/");
		
		//driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		//System.out.print(driver.getCurrentUrl());
			
		driver.findElement(By.xpath(" //a[@id='opentab']")).click();
		System.out.println(driver.getCurrentUrl());
		Set<String> obj=driver.getWindowHandles();
		
		  /* Iterator<String> it=obj.iterator();
		   String parent_window=it.next();
		   String child_window=it.next();
		   
		   
		   driver.switchTo().window(child_window);
		    System.out.println(driver.getCurrentUrl());
		   
		   
		    driver.switchTo().window(parent_window);
		    
		    System.out.println(driver.getCurrentUrl());*/
		    
		
		
}
}