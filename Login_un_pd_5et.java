package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login_un_pd_5et {
	@Test(dataProvider="Login")
	public void login_fb(String un,String pwd)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("email"));
		e1.sendKeys(un+Keys.ENTER);
		WebElement e3=driver.findElement(By.id("pass"));
		e3.sendKeys(pwd+Keys.ENTER);
	}
	@DataProvider(name="Login")
	public Object[][] method1()
	{
		  Object data[][] =new Object[5][2];
		  data[0][0]="minal.jangale21@gmail.com";
		  data[0][1]="test@3435";
		  
		  data[1][0]="soni.jangale@gmail.com";
		  data[1][1]="test@3435";
		  
		  data[2][0]="Chhaya.jangale@gmail.com";
		  data[2][1]="test@3435";
		  
		  data[3][0]="Ved.jangale@gmail.com";
		  data[3][1]="test@3435";
		  
		  data[4][0]="Atharva.jangale@gmail.com";
		  data[4][1]="test@3435";
		  
		return data;
		
	}
    }
	
