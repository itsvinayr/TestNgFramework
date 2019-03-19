package com.testing.framework.testng.dependencies;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Runner {
	
	@BeforeTest
	public void openDBConnection() {
		System.out.println("Opening db connection");
	}
	
	@BeforeMethod
	public void openBrowser() {
		System.out.println("Opening browser");
	}
	
	/**
	 * always run = true is a soft dependency, which allows test not to skip
	 * even when dependent methods fails
	 */
	@Test(dependsOnMethods= {"testUserRegistration"}, alwaysRun=true)
	public void testLogin() {
		System.out.println("User login");
	}
	
	@Test()
	public void testUserRegistration() {
		System.out.println("User registration");
		Assert.fail();
	}
	
	@Test()
	public void testDashboard() {
		System.out.println("User dashboard");
	}
	
	@Test()
	public void testMyactivities() {
		System.out.println("User activity page");
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("closing browser");
	}
	
	@AfterTest
	public void closeDBConnection() {
		System.out.println("closing db connection");
	}

}
