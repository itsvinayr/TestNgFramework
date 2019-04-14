package com.testing.framework.testng.factory.parameters;

import org.testng.annotations.Factory;

public class Runner {

	@Factory
	public Object[] runInstances() {
		return new Object[] { new LoginTests(0), new LoginTests(1) };
	}

}
