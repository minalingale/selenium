package Assignment_selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Ass47_test_AM_BS_AC
{
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
	@BeforeSuite
	public void BS()
	{
	System.out.println("1");
	}
	 @AfterClass
	   public void AC()
	   {
		   System.out.println("8");
	   }

}
