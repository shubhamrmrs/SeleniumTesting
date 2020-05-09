package testNGListenerOnFailure;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

	@Test
	public void doLogin() {

		driver.findElement(By.id("identifierId12")).sendKeys("sks102it@gmail.com");
		driver.findElement(By
				.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span"))
				.click();
	}

	public void composeEmail() {

		Assert.fail("error in composing email");
	}
}
