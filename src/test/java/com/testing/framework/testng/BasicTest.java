package com.testing.framework.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testing.framework.testng.base.BaseClass;

public class BasicTest extends BaseClass{
	
	@BeforeTest
	public void openDBConnection() {
		System.out.println("Opening db connection");
	}
	
	@BeforeMethod
	public void openBrowser() {
		System.out.println("Opening browser");
	}
	
	@Test(priority=2)
	public void testLogin() {
		System.out.println("User login");
	}
	
	@Test(priority=1)
	public void testUserRegistration() {
		System.out.println("User registration");
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
