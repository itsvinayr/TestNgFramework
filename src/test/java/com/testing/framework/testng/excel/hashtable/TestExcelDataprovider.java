package com.testing.framework.testng.excel.hashtable;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.testing.framework.testng.excel.ExcelReader;

public class TestExcelDataprovider {
	
	public static ExcelReader excel = null;
	
	@Test(dataProvider="getData")
	public void testTestExcelDataprovider(Hashtable<String,String> data) {
		System.out.println(data.get("username"));
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
		data = new Object[rows-1][1];
		Hashtable<String, String> table;
		
		for(int i=2; i<=rows; i++) {
			table = new Hashtable<String, String>();
			for(int j=0; j<cols; j++) {
				table.put(excel.getCellData(sheetName, j, 1),excel.getCellData(sheetName, j, i));
				data[i-2][0]=table;
			}
		}
		
		return data;
	}

}
