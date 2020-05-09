package parameterization;

import org.testng.annotations.Test;

public class NewLoginTest {

	@Test(dataProviderClass = DataProviders.class, dataProvider = "dp1") // --> W/O extending DataProviders class,
																			// we can call like this..
	public void testLogin(String username, String password) {
		System.out.println(username + "---" + password);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "dp1")

	public void testUserReg(String fname, String lname, String emailid) {
		System.out.println(fname + "---" + lname + "---" + emailid);
	}

}
