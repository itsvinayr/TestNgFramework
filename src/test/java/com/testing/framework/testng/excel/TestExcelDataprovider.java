package com.testing.framework.testng.excel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestExcelDataprovider {
	
	public static ExcelReader excel = null;
	
	@Test(dataProvider="getData")
	public void testTestExcelDataprovider(String username, String password, String course) {
		System.out.println(username+"---"+password+"-----"+course);
	}
	
	@DataProvider(name="getData")
	public Object[][] getData() {
		Object[][] data;
		if(excel==null) {
			excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\excelFiles\\Data.xlsx");
		}
		String sheetName = "UserData";
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);
		data = new Object[rows-1][cols];
		
		for(int i=2; i<=rows; i++) {
			for(int j=0; j<cols; j++) {
				data[i-2][j]=excel.getCellData(sheetName, j, i);
			}
		}
		
		return data;
	}

}
