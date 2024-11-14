package Assignment_selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ass50_BM_AM_3test
{
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
	@Test
	public void Testcase2()
	{
	System.out.println("11");
	}
	@Test
	public void Testcase3()
	{
	System.out.println("13");
	}
}
