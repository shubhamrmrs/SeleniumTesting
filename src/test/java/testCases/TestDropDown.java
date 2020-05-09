package testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.get("http://way2automation.com/way2auto_jquery/index.php");
		// driver.findElement(By.name("country")).sendKeys("Germany");
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.findElement(By.id("searchLanguage")).sendKeys("Eesti");

		WebElement dropdown = driver.findElement(By.id("searchLanguage")); // important
		Select select = new Select(dropdown);
		select.selectByVisibleText("Eesti");
//		select.selectByValue("hi");

		List<WebElement> values = dropdown.findElements(By.tagName("option"));
		System.out.println(values.size());
		System.out.println(values.get(9).getText());

		for (int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i).getAttribute("lang"));
		}
		System.out.println("********************************************************************");
		
		WebElement block = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[6]/div[3]"));

		List<WebElement> links = block.findElements(By.tagName("a"));
		System.out.println(links.size());

		for (WebElement link : links) { // For-Each Loop
			System.out.println(link.getText() + " url is.." + link.getAttribute("href"));
		}

		/* Here we have 4 block having 4 button each and having same locators //whenever we are working on multiple elements, having similar properties for button value as well..
		 * whenever we are working on multiple elements, having similar properties
		 * WebElement secondBlock = driver.findElement(By.id("block")); 
		 * secondBlock.findElements(By.id("abc")).get(2).click();
		 */
	}
}
