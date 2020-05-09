package testCasesTestNG;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 extends BaseTest {
//Hard dependencies = All the methods you depend on must have run and succeeded for you to run. If at least one failure occurred in your dependencies, you will not be invoked and marked as a SKIP in the report.	

	@Test(priority = 1,groups= {"functional","smoke"})
	public void doUserReg() {
		System.out.println("executing user reg test");
		Assert.fail("user not registered successfully");

	}

	@Test(priority = 2, dependsOnMethods = "doUserReg",groups= {"functional","smoke"})
	public void doLogin() {
		System.out.println("executing login test");
	}

//	Soft dependencies = You will always be run after the methods you depend on, even if some of them have failed. This is useful when you just want to make sure that your test methods are run in a certain order but their 
//  success doesn't really depend on the success of others.
//  A soft dependency is obtained by adding "alwaysRun=true" in your @Test annotation.	

	@Test(priority = 3, dependsOnMethods = "doUserReg", alwaysRun = true,groups={"functional","smoke"})
	public void thirdTest() {
		System.out.println("executing thirdTest");
	}

	@Test(priority = 4,groups="bvt")
	public void fourthTest() {
		System.out.println("executing fourthTest");
	}

}
