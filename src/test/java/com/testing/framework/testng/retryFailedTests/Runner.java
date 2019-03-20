package com.testing.framework.testng.retryFailedTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Runner {
	
	/*
	 * Retry logic at class level
	 *
	@Test(retryAnalyzer=Retry.class)
	public void test1() {
		Assert.fail();
	}*/
	
	@Test
	public void test1() {
		Assert.fail();
	}
}
