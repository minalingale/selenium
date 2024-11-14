package Assignment_selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ass46_bt_bc_bm_test_am 
{
	@BeforeTest
	public void BT()
	{
	System.out.println("2");
	}
	@BeforeClass
	public void BC()
	{
	System.out.println("3");
	}
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
