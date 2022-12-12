package sel6;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle2 {


		public static void main(String []args) {
				
				ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brandcom&gclid=CjwKCAiApvebBhAvEiwAe7mHSFpn9pQkzPjLHftxGJrgSeVKxc1wJ7N73To-PG9RAauwL3vvL9K1CxoCVZMQAvD_BwE&gclsrc=aw.ds");
			driver.findElement(By.xpath("//img[@src='https://static.naukimg.com/s/4/100/i/naukri_Logo.png']")).click();
			Set<String> obj=driver.getWindowHandles();
			
			driver.findElement(By.xpath("//a[@title='Marketing']")).click();
			Set<String> obj2 =driver.getWindowHandles();
			
}
		
}