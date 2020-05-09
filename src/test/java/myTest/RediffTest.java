package myTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffTest {
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("login1")).sendKeys("monty9358");
		driver.findElement(By.id("password")).sendKeys("Sks@12345");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
		
		driver.findElement(By.xpath("//*[@id=\"boxscroll\"]/li[1]/a/b")).click();
		driver.findElement(By.id("TO_IDcmp2")).sendKeys("shubhamrmrs@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"rd_compose_cmp2\"]/ul/li[4]/input")).sendKeys("IMPORTANT");
		//driver.findElement(By.className("cke_editable cke_editable_themed cke_contents_ltr cke_show_borders")).sendKeys("hi there, how are you??");
		driver.findElement(By.xpath("//*[@id=\"rd_compose_cmp2\"]/div[1]/a[1]")).click();

		
		
		
		
		
		

	}

}
