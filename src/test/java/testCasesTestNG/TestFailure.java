package testCasesTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFailure {

	@Test
	public void doLogin() {
		Assert.fail("failing the login test");
		System.out.println("capture screenchot");
	}

}
