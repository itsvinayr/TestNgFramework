package com.testing.framework.testng.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListener implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Passed Test "+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		Reporter.log("Screenshot");
		System.out.println("Failed Test -- Captureing screenshot "+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("skipped Test "+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
