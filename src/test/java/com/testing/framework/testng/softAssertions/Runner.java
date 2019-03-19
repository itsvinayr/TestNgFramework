package com.testing.framework.testng.softAssertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Runner {
	
	@Test
	public void test() {
		SoftAssert softAssert = new SoftAssert();
		String expected = "Yahooo";
		String actual = "Google";
		
		softAssert.assertEquals(actual, expected);
		softAssert.assertTrue(expected.equals(actual));
		
		System.out.println("execution completed");
		softAssert.assertAll();
		
	}

}
