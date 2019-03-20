package com.testing.framework.testng.multipleDataProviders;

import org.testng.annotations.Test;

public class Runner {
	
	@Test(dataProviderClass=DataSource.class, dataProvider="getLoginData")
	public void test1(String username, String password) {
		System.out.println(username+"-----"+password);
	}
	
	@Test(dataProviderClass=DataSource.class, dataProvider="getAccountDetails")
	public void test2(String id, String name, int salary) {
		System.out.println(id+"-----"+name+"------"+salary);
	}
	
	@Test(dataProviderClass=DataSource.class, dataProvider="getData")
	public void test3(String username, String password) {
		System.out.println(username+"-----"+password);
	}
	
	@Test(dataProviderClass=DataSource.class, dataProvider="getData")
	public void test4(String id, String name, int salary) {
		System.out.println(id+"-----"+name+"------"+salary);
	}

}
