package Assignment_selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Ass45_test_AM_AC 
{
	@AfterClass
    public void AC()
    {
    System.out.println("8");
    }
    @AfterMethod
   public void AM()
   {
	   System.out.println("9");
   }
    @Test
	public void Testcase1()
	{
	System.out.println("5");
	}
}
