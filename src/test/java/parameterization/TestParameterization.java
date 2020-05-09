package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {
	
/*--> Parameters with DataProviders:
Specifying parameters in testng.xml might not be sufficient if you need to pass complex parameters, or parameters that need to be created from Java 
(complex objects, objects read from a property file or a database, etc...).
In this case, we can use a "Data Provider" to supply the values you need to test.  
--> Data Provider: 
A Data Provider is a method on our class that returns an array of array of objects.
This method is annotated with @DataProvider:	
--> To read data from table and execute all together, i.e. login test for multiple users..
*/
	@Test(dataProvider = "getData")
    public void doLogin(String username, String password) {
    	
    	System.out.println(username+"---"+password); 
    	}	

    @DataProvider
    public Object[][] getData(){
    	 Object[][] data = new Object[3][2]; //total no. of column is always = total no of argument of test method i.e. doLogin..
    	 
    	 data[0][0] = "sks@gmail.com";
    	 data[0][1] = "12345";
    	 
    	 data[1][0] = "abc@gmail.com";
    	 data[1][1] = "1233445";
    	 
    	 data[2][0] = "pqr@gmail.com";
    	 data[2][1] = "12365645";
		return data;

    	 }
    }
