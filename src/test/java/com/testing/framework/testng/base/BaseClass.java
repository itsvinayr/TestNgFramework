package com.testing.framework.testng.base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	@BeforeSuite
	public void initializeAll() {
		System.out.println("Initializing everything");
	}
	
	@AfterSuite
	public void tearDownAll() {
		System.out.println("Closing all");
	}

}
