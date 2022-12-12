package sel3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class path {


	public static void main (String []args) {
		ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.website.com/sign-in/?source=SC&country=IN ");
	
	driver.findElement(By.xpath(" //input[@id='username']")).sendKeys(" Vaishnavi");

	driver.findElement(By.xpath(" //input[@name='password']")).sendKeys("vaishnavi@45");
	}
	
	
}
