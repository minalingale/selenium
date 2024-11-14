package Assignment_selenium;

import org.testng.annotations.Test;

public class Ass62_disabletc {
	@Test (enabled=false)
	public void login()
	{
		System.out.println("test3");
	}
	@Test
	public void logout()
	{
		System.out.println("test4");
	}
	@Test(priority=1)
	public void regi()
	{
		System.out.println("test5");

     }
     }