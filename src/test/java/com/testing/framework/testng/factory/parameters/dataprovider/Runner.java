package com.testing.framework.testng.factory.parameters.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

public class Runner {

	@Factory(dataProvider="getData")
	public Object[] runInstances(String name) {
		return new Object[] { new LoginTests(name), new LoginTests(name)};
	}
	
	@DataProvider
	public static Object[][] getData(){
		return new Object[][] {
			{"one"},
			{"two"},
			{"three"}
		};
	}

}
