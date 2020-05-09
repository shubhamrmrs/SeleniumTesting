package testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TestScreenshotUsingAshot {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.xpath("/html/body"));
//      WebElement ele = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div[2]/div/div[1]/a/img\r\n"));

//full screenshot:	
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
//element screenshot:
//      Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver,ele);

		ImageIO.write(screenshot.getImage(), "jpg", new File(".\\screenshot\\ashotpage.jpg"));		
		
	}

}
//useful