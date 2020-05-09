package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestHandlingCalendar {
	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("RoundTrip")).click();
		driver.findElement(By.xpath("//*[@id=\"FromTag\"]")).sendKeys("New Delhi");
		driver.findElement(By.xpath("//*[@id=\"ToTag\"]")).sendKeys("Patna");

//departure on -- Calendar logic: 
		
		driver.findElement(By.xpath("//*[@id=\"DepartDate\"]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('DepartDate').value='15/05/2020'");

//Return on -- Calendar logic: 
		
		driver.findElement(By.xpath("//*[@id=\"ReturnDate\"]")).click();
		JavascriptExecutor jst = (JavascriptExecutor) driver;
		jst.executeScript("document.getElementById('ReturnDate').value='25/05/2020'");

		driver.findElement(By.id("SearchBtn")).click();
	}

}