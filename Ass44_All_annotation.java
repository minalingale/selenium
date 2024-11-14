package Assignment_selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ass44_All_annotation {

	@BeforeSuite
	public void BS()
	{
	System.out.println("1");
	}
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
	@Test
	public void Testcase2()
	{
	System.out.println("58");
	}
	@AfterSuite
	public void AS()
	{
	System.out.println("6");
	}
    @AfterTest
    public void AT()
    {
    System.out.println("7");
    }
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
    
}