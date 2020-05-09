package testCases;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWaits {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
// 1).Explicit wait:

        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.get("https://gmail.com/");
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='identifierId'"))).sendKeys("sks102it");
        driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("sks102it");
		driver.findElement(By.xpath("//*[@id='identifierNext']/span")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("sds#1312");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
		
//2).Implicit wait:

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS)X;  
//  	driver.findElement(By.name("password")).sendKeys("Sks@145");

//3).Fluent wait:

//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				
//				.withTimeout(Duration.ofSeconds(10))   
//				.withTimeout(Duration.ofSeconds(2))
//				.withMessage("User defind time out after 30 second")
//				.ignoring(NoSuchElementException.class);
//
//		driver.get("https://gmail.com/");
//      driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("shubhamrmrs@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span")).click();
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password"))).sendKeys("Sks@45");
//		driver.findElement(By.cssSelector("#passwordNext > span:nth-child(3) > span:nth-child(1)")).click();
   }
}
