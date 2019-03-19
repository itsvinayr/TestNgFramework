package com.testing.framework.testng.excel;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class TestExcel {
	
	public static Logger logger = Logger.getLogger(TestExcel.class.getName());
	
	@Test
	public void testExcel() {
		
		String sheetName = "UserData";
		ExcelReader reader = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\excelFiles\\Data.xlsx");
		
		print(reader.getRowCount(sheetName));
		logger.info("printing row count");
		print(reader.getColumnCount(sheetName));
		logger.info("printing column count");
		print(reader.getCellData(sheetName, "username", 2));
		logger.info("printing cell data");
	}
	
	public static void print(Object x) {
		System.out.println(x);
	}

}
