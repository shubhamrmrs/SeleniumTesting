package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestIsElementPresent {
	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//1).isDisplayed: checking the visibility of elements. whether the element is present on the page or not..
		// for hidden element it returns false

		// System.out.println(driver.findElement(By.xpath("//*[@id=\"js-link-box-en\"]/strong")).isDisplayed());
		// System.out.println(driver.findElement(By.id("searchLanguage")).isDisplayed());
		System.out.println(isElementPrensent(By.id("searchLanguage")));

//2).isSelected: 
//3).isEnabled:
//4).isElementPrensent: Custom method,to check the presence of element..	        //Important
	}

	public static boolean isElementPrensent(By by) {
		int size = driver.findElements(by).size();
		if (size == 0) {
			return false;
		} else {
			return true;
		}
	}
}
