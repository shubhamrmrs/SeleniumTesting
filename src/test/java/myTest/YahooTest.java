package myTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class YahooTest {
    @Test
	public void yahoo()throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.yahoo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"signin-main\"]/div[1]/a[2]/span")).click();
		driver.findElement(By.name("username")).sendKeys("sksinha102");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		driver.findElement(By.className("password")).sendKeys("Sks@12345");
		action.sendKeys(Keys.ENTER).perform();

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/nav/div/div[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"message-to-field\"]")).sendKeys("shubhamrmrs@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"mail-app-component\"]/div/div/div[1]/div[3]/div/div/input")).sendKeys("IMPORTANT");
		driver.findElement(By.xpath("//*[@id=\"editor-container\"]/div[1]")).sendKeys("same here buddy!!!");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"mail-app-component\"]/div/div/div[2]/div[2]/div/button")).click();

	
	}

}
