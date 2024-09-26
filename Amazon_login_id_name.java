//Assignment3
package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_login_id_name {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		WebElement un=driver.findElement(By.name("email"));
		un.sendKeys("minaljangale1992@gmail.com");
		
		WebElement contiue_button=driver.findElement(By.id("continue"));
		contiue_button.click();
		
	    WebElement pwd=driver.findElement(By.id("ap_password"));
		pwd.sendKeys("Atharvaved@248");
		
		WebElement signin_button=driver.findElement(By.id("signInSubmit"));
		signin_button.click();
		

	}

}
