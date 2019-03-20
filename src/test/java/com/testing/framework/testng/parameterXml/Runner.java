package com.testing.framework.testng.parameterXml;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Runner {
	
	@Parameters({"browser", "operatingSystem"})
	@Test
	public void test(String browser, String operatingSystem) {
		System.out.println(browser+"==="+operatingSystem);
	}

}
