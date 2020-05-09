package parameterization;

import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	@DataProvider(name = "dp1")
	public static Object[][] getData(Method m) {

		Object[][] data = null;

		if (m.getName().equals("testLogin")) {  // --> We can use same dataProvder to work with different test-
												//    cases with different arguments by using if-else conditions..
			data = new Object[2][2];

			data[0][0] = "raman";
			data[0][1] = "ghghcg";

			data[1][0] = "rahul";
			data[1][1] = "hjvguh";
		}

		else if (m.getName().equals("testUserReg")) {
			data = new Object[2][3];

			data[0][0] = "raman";
			data[0][1] = "singh";
			data[0][2] = "singh@gmail.com";

			data[1][0] = "rahul";
			data[1][1] = "kumar";
			data[1][2] = "kumar@gmail.com";
		}
		return data;
	}
}
