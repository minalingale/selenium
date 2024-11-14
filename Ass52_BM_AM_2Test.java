package Assignment_selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ass52_BM_AM_2Test {

	@BeforeMethod
	public void BM()
	{
	System.out.println("Launch Browser");
	}
	@Test
	public void Testcase1()
	{
	System.out.println(" Login to amazon search for any product");
	}
	@AfterMethod
	 public void AM()
	 {
		   System.out.println("Close browser");
	 }
	@Test
	public void Testcase2()
	{
	System.out.println(" Login to Amazon and Add product to wishlist");
	}

}
