package regressionTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 {
	@Test
	public void validateTitles() {
		System.out.println("Beginning");
        String expected_title = "Yahoo.com";
		String actual_title = "Gmail.com";
		
//ASSERTION = TestNG also include JUnit's Assert class, which lets you perform assertions on complex objects:
//SOFT ASSERTION = To avoid test case failure in between.. // Assert is class of testNG..
		
        SoftAssert softAssert = new SoftAssert();                   

        System.out.println("validating title");
		softAssert.assertEquals(actual_title, expected_title);          
		// isElementPresent("xpath") - True, False
		// Assert.assertTrue(false, "element not found");
		//Assert.fail("failing the test case as condition is not met");
	    
	    System.out.println("validating image");
	    softAssert.assertEquals(true, false,"image not present");
	    
	    System.out.println("validating text box presence");
	    softAssert.assertEquals(true, false,"tesxbox not present");
		
	    System.out.println("End");

	    softAssert.assertAll();
	}

}
