package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ass65_amazon_search_logout {
	@Test
	public void testcase1() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		WebElement un1=driver.findElement(By.name("email"));
		un1.sendKeys("9175522451");
		
		WebElement contiue_button=driver.findElement(By.id("continue"));
		contiue_button.click();
		
	    WebElement pwd=driver.findElement(By.id("ap_password"));
		pwd.sendKeys("Atharvaved@248");
		
		WebElement signin_button=driver.findElement(By.id("signInSubmit"));
		signin_button.click();
	
WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
e1.sendKeys("shoes" +Keys.ENTER);
Thread.sleep(6000);


//a[@class='nav-a nav-a-2 nav-truncate   nav-progressive-attribute']
WebElement e4=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
Actions a1=new Actions(driver);
a1.moveToElement(e4).perform();
Thread.sleep(3000);
WebElement e5=driver.findElement(By.linkText("Sign Out"));
e5.click();
WebElement e6=driver.findElement(By.name("email"));
Assert.assertEquals(e6.isDisplayed(), true,"Sorry tc got failed pls check again");//true then tc pass,if false then fail
}
}