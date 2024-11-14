package Assignment_selenium;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_logic implements IRetryAnalyzer
{
int initialcount=0;
int retry_count=2;
	@Override
	public boolean retry(ITestResult result) 
	{
		// TODO Auto-generated method stub
		if (initialcount<retry_count)
		{
			initialcount++;
			return true;
		}
		return false;
	}

}
