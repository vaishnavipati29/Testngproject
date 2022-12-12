import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class screen {

	public static void main (String []args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.website.com/sign-in/?source=SC&country=IN ");
	   File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(src, new File("C:\\Users\\patil\\Desktop\\demo1\\tst.png "));
}
}