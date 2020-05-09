package myTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailTest {
	@Test
	public void test() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.id("identifierId")).sendKeys("sks102it@gmail.com");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"))).sendKeys("Sks@12345");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
		Thread.sleep(500);

		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[1]/div/div")).click();
		driver.findElement(By.name("to")).sendKeys("shubhamrmrs@gmail.com");
		Thread.sleep(500);

		driver.findElement(By.id(":p7")).sendKeys("IMPORTANT");
		
		driver.findElement(By.id(":qc")).sendKeys("Hii there, how are you");
        Thread.sleep(1000);   
        driver.findElement(By.id(":ox")).click();

	
	}

}
