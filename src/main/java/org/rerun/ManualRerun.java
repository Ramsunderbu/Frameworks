package org.rerun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ManualRerun implements IRetryAnalyzer {
	int mincount =0;
	int maxcount =5;
	@Override
	public boolean retry(ITestResult result) {
		if (mincount < maxcount) {
			mincount++;
			return true;
		}
		return false;
	}

}
