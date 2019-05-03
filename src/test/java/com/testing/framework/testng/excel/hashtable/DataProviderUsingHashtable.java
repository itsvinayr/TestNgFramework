package com.testing.framework.testng.excel.hashtable;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderUsingHashtable {	
	
	@Test(dataProvider = "getUniqueData")
	public void testHashtable(Hashtable<String, String> data) {
		System.out.println(data.get("username"));
	}
	
	@DataProvider
	public static Object[][] getUniqueData(){
		
		Object[][] obj = new Object[4][1];
		
		Hashtable<String, String> data = new Hashtable<String, String>();
		data.put("username", "vinay");
		data.put("password", "vinayPassword");
		data.put("employeeID", "234");
		obj[0][0]=data;
		
		data = new Hashtable<String, String>();
		data.put("username", "anusha");
		data.put("password", "anushaPassword");
		data.put("employeeID", "116");		
		obj[1][0]=data;
		
		data = new Hashtable<String, String>();
		data.put("username", "likki");
		data.put("password", "likkiPassword");
		data.put("employeeID", "321");		
		obj[2][0]=data;
		
		data = new Hashtable<String, String>();
		data.put("username", "chandrababu");
		data.put("password", "chandrababuPassword");
		data.put("employeeID", "420");		
		obj[3][0]=data;
		
		return obj;
		
	}
}
