package customListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

/*There are several interfaces that allow you to modify TestNG's behavior. These interfaces are broadly called "TestNG Listeners".
--> ITestListener (doc, javadoc) 
--> Specifying listeners with testng.xml or in Java:
<listeners>
<listener class-name="com.example.MyListener" />
</listeners>
--> Also need to add dependencies in testng.xml*/

public class Listeners implements ITestListener {
	public void onTestStart(ITestResult result) {
		// not implemented
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("passed testcase -- " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
//To print link in report..
		
		System.setProperty("org.uncommons.reportng.escape-output", "false");

		Reporter.log("<a href=\"G:\\new\\1675313.png\" target=\"_blank\">ScreenShot Link</a>");
		Reporter.log("<br>");
		Reporter.log("<a href=\"G:\\new\\1675313.png\" target=\"_blank\"><img height=200 width=200 src= \"G:\\new\\1675313.png\"></a>");

		System.out.println("capturing screenshot for the failed testcase -- " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		// not implemented
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// not implemented
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		onTestFailure(result);
	}

	public void onStart(ITestContext context) {
		// not implemented
	}

	public void onFinish(ITestContext context) {
		// not implemented
	}

}
