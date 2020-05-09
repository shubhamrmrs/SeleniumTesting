package testCases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestElementScreenshot {
	public static WebDriver driver;

	public static void captureScreenshot() throws IOException{
	    Date d = new Date();
	    String fileName = (d.toString().replace(":", "_").replace(" ", "_")+".jpg");
	    
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".//screenshot//"+fileName));
		}
	
	public static void captureElementScreenshot(WebElement ele) throws IOException {
		
	Date d = new Date();
	String fileName = (d.toString().replace(":", "_").replace(" ", "_")+".jpg");
			
	File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    
	BufferedImage fullImg = ImageIO.read(screenshot);
	
	Point point =ele.getLocation();
	int elewidth = ele.getSize().getWidth();
	int eleheight = ele.getSize().getHeight();
	
	BufferedImage eleScreenshot = fullImg.getSubimage(point.getX(), point.getY(), elewidth, eleheight);
	ImageIO.write(eleScreenshot, "jpg", screenshot);
	
	File screenshotLocation = new File(".\\screenshot\\"+fileName);
    FileUtils.copyFile(screenshot, screenshotLocation);
	}

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.id("hplogo"));
	
		captureElementScreenshot(ele);
     }
}
//useless