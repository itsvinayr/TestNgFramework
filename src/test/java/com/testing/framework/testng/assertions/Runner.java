package com.testing.framework.testng.assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Runner {
	
	@Test
	public void test() {
		String expected = "Yahooo";
		String actual = "Google";
		
		//Assert.assertEquals(actual, expected);
		//Assert.assertTrue(expected.equals(actual), "Results doesn't match");
		//Assert.fail("Failing test intentionally");
	}

}
