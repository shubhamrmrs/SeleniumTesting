package parameterization; //IMPORTANT!!!

import java.util.Hashtable;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.ExcelReader;

public class TestParameterizationExcel {

	public static ExcelReader excel = null;

	@Test(dataProvider = "getData")
	public void testData(Hashtable<String, String> data) {

		System.out.println(data.get("username") + "--" + data.get("password") + "--" + data.get("is_correct") + "--"
				+ data.get("age") + "--" + data.get("gender"));
	}

	@DataProvider
	public Object[][] getData() {

		if (excel == null) {
			excel = new ExcelReader("H:\\Selenium\\ExcelCoding\\New folder\\testngdata.xlsx");
		}

// Hashtable --> Collection...

		String sheetName = "loginTest";
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);

		Object[][] data = new Object[rows - 1][1];

		Hashtable<String, String> table = null;

		for (int rowNum = 2; rowNum <= rows; rowNum++) {

			table = new Hashtable<String, String>();

			for (int colNum = 0; colNum < cols; colNum++) {

				table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
				data[rowNum - 2][0] = table;
			}
		}
		return data;

	}

}
