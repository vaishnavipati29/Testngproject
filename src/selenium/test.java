package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	
	
	
	
	public static void main (String []args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    
	    driver.get("https://www.amazon.in/") ;
	   System.out.print(driver.getCurrentUrl());
	    
	   //driver.close();
	    driver.getTitle();
	    System.out.println(driver.getTitle());
	    
	    driver.navigate().refresh();
	    
	    
	    //driver.quit();
	}
	

	
	
}
