package com.testing.framework.testng.multipleDataProviders;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataSource {
	
	@DataProvider(name="getLoginData")
	public Object[][] getLoginData() {
		return new Object[][] {
			{"venky", "mass"},
			{"chandrababu", "class"},
			{"jagan", "prodigy"}
		};
	}
	
	@DataProvider(name="getAccountDetails")
	public Object[][] getAccountDetails() {
		return new Object[][] {
			{"213", "vinay", 3000},
			{"324", "chandrababu", 20000},
			{"762", "jagan", 15000}
		};
	}
	
	@DataProvider(name="getData")
	public Object[][] getData(Method m){
		if(m.getParameterCount()==2) {
			return new Object[][] {
				{"venky", "mass"},
				{"chandrababu", "class"},
				{"jagan", "prodigy"}
			};
		}else {
			return new Object[][] {
				{"213", "vinay", 3000},
				{"324", "chandrababu", 20000},
				{"762", "jagan", 15000}
			};
		}
	}

}
