package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main (String []args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
	
		driver.close();
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("hello@gmail.com");
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc@123");
	
	
	driver.get("https://www.website.com/sign-in/?source=SC&country=IN ");
	
	driver.findElement(By.xpath(" //input[@id='username']")).sendKeys(" Vaishnavi");
	
	
	
	}
	
	
}
