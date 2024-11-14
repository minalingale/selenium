package Assignment_selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ass60_before_after_annotation_priority
{
@Test
public void searching_the_product()
{
	System.out.println("searching_the_product");
}
@Test(priority=-1)
public void searching_to_cart()
{
	System.out.println("searching_to_cart");
}
@BeforeMethod
public void launch()
{
	System.out.println("launch browser");
}
	
@AfterMethod
public void quit()
{
	System.out.println("quit browser");
}


@Test(priority=1)

public void Add_to_cart()
{
	System.out.println("Add_to_cart");
}
}