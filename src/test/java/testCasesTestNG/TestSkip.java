package testCasesTestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSkip extends BaseTest{

//To forcefully skip the test case..

	@Test
	public void isSkip() {
		throw new SkipException("Skipping the test as the condition is not met");

	}

}
