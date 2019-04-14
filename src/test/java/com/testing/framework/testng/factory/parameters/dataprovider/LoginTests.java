package com.testing.framework.testng.factory.parameters.dataprovider;

import org.testng.annotations.Test;

public class LoginTests {
	
	String param;
	
	public LoginTests(String param) {
		this.param=param;
	}
	
	@Test
	public void test1() {
		System.out.println("test1 with param "+param);
	}
	
	@Test
	public void test2() {
		System.out.println("test2 with param "+param);
	}
	
	@Test
	public void test3() {
		System.out.println("test3 with param "+param);
	}
	
	@Test
	public void test4() {
		System.out.println("test4 with param "+param);
	}
	
	@Test
	public void test5() {
		System.out.println("test5 with param "+param);
	}

}
