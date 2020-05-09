package regressionTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {

	@BeforeTest
	public void creatingDBConn() {
		System.out.println("creating DB Conn");
	}

	@AfterTest
	public void closingDBConn() {
		System.out.println("closing DB Conn");
	}

	@BeforeMethod
	public void launcgBrowser() {
		System.out.println("launching browser");
	}

	@Test(priority = 2)
	public void doLogin() {
		System.out.println("executing login test");
	}

	@Test(priority = 1)
	public void doUserReg() {
		System.out.println("executing user reg test");
	}

	@AfterMethod
	public void closingBrowser() {
		System.out.println("closing browser");
	}

}