package com.testing.framework.testng.groups;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testing.framework.testng.base.BaseClass;

public class Runner extends BaseClass{
	
	@Test(groups="smoke")
	public void testLogin() {
		System.out.println("User login");
	}
	
	@Test(groups="smoke")
	public void testUserRegistration() {
		System.out.println("User registration");
		Assert.fail();
	}
	
	@Test(groups="core")
	public void testDashboard() {
		System.out.println("User dashboard");
	}
	
	@Test(groups="core")
	public void testMyactivities() {
		System.out.println("User activity page");
	}

}
