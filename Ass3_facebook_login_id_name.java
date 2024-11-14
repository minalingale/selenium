//assignment3
package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass3_facebook_login_id_name {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("minal.jangale21@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Atharvaved@248");
		driver.findElement(By.name("login")).click();
	}

}
