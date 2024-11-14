package Assignment_selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ass48_BM_AM_TEst {

	@BeforeMethod
	public void BM()
	{
	System.out.println("4");
	}
	@Test
	public void Testcase1()
	{
	System.out.println("5");
	}
	@AfterMethod
	   public void AM()
	   {
		   System.out.println("9");
	   }
	    
}
