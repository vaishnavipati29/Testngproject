package sele5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frame {
public static void main(String []args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://the-internet.herokuapp.com/nested_frames");
  WebElement Leftframe  = driver.findElement(By.xpath("//frame[@src='/frame_left']"));		
		
		driver.switchTo().frame(0);
		 Actions ac=new Actions(driver);
		 WebElement source = driver.findElement(By.xpath(" (//frame[@scrolling='no'])[3]"));
         WebElement target = driver.findElement(By.xpath(" //frame[@name='frame-bottom']"));		
         ac.dragAndDrop(source, target).build().perform();
         driver.switchTo().defaultContent();
}



}