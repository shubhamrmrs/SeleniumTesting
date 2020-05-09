package testCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestKeyboardEvent {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("identifierId")).sendKeys("sks102it");
		//driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
//or
		/* Actions action = new Actions(driver); 
		 * action.sendKeys(Keys.ENTER).perform();*/
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]")).click();
		 
		 Actions action = new Actions(driver);
		 action.sendKeys(Keys.chord(Keys.CONTROL+"a")).sendKeys(Keys.chord(Keys.CONTROL+"c")).build().perform();
		 
		 driver.findElement(By.id("identifierId")).click();
		 action.sendKeys(Keys.chord(Keys.CONTROL+"v")).perform();

	}
}
