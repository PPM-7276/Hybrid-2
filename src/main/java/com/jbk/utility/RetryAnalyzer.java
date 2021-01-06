package com.jbk.utility;

import org.testng.IRetryAnalyzer;

import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	int count=0;
	int maxLimit=3;
	
	
	public boolean retry(ITestResult result) {
		if(count < maxLimit) {
			TestBase.log.info("Retrying failed test case for count "+count);
			count++;
			return true;
		}else {
			TestBase.log.info("skip Retrying failed test case as max limit reached as "+maxLimit);
			return false;
		}
		
	}

}