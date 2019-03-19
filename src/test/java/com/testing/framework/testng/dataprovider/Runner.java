package com.testing.framework.testng.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Runner {
	
	@Test(dataProvider="getData")
	public void test(String username, String password) {
		System.out.println(username+"-----"+password);
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0]="vinay@infi.com";
		data[0][1]="vin@infi.com";
		
		data[1][0]="anusha@infi.com";
		data[1][1]="anu@infi.com";
		
		data[2][0]="likki@infi.com";
		data[2][1]="kavya@infi.com";
		
		return data;
	}

}
