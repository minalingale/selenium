package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ass54_dataprovider_un_pwd_gender_dob_email 
{
@Test(dataProvider="regi")
public void login_fb(String fname,String lname,String dob,String email)
{
	
	ChromeDriver c=new ChromeDriver();
	c.get("https://www.facebook.com/");
	WebElement create_account=c.findElement(By.linkText("Create new account"));
	create_account.click();

	       WebElement FN=c.findElement(By.name("firstname"));
	       FN.sendKeys(fname+Keys.ENTER);
	       WebElement LN=c.findElement(By.name("lastname"));
	       LN.sendKeys(lname+Keys.ENTER);
	       WebElement day=       c.findElement(By.name("u_0_b_Ge"));
	       FN.sendKeys(dob+Keys.ENTER);

	      // WebElement gender1=  c.findElement(By.xpath("//span[@class='_5k_2 _5dba'][3]"));
	      // gender1.click();*/
		    WebElement Mobileno=c.findElement(By.name("reg_email__"));
	       Mobileno.sendKeys(email+Keys.ENTER);

}
@DataProvider(name="regi")
public Object[][] method1()
{
	  Object data[][] =new Object[5][3];
	  data[0][0]="minal";
	  data[0][1]="Ingale";
	 data[0][2]="21101999";
	//  data[0][3]="Female";
	  data[0][2]="minal.jangale21@gmail.com";
	  
	  data[1][0]="ved";
	  data[1][1]="Ingale";
	  data[0][2]="22101999";	 // data[1][3]="male";
	  data[1][2]="ved.ingale1@gmail.com";     
	  
	  data[2][0]="Atharva";
	  data[2][1]="Ingale";
	  data[0][2]="23101999";      //data[2][3]="male";
	  data[2][2]="Atharva.ingale@gmail.com";
	  
	  data[3][0]="Kaavya";
	  data[3][1]="Kolhe";
	  data[0][2]="24101999";	  //data[3][3]="Female";
	  data[3][2]="Kaavya.kolhe1@gmail.com";  

	  data[4][0]="Soni";
	  data[4][1]="Kolhe";
	  data[0][2]="26101999";	  //data[4][3]="Female";
	  data[4][2]="Soni.kolhe1@gmail.com";  
	  
	  
	return data;
	
}
}

