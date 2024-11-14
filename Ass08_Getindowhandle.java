package Assignment_selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Ass08_Getindowhandle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getWindowHandle());
		//System.out.println(driver.getWindowHandles());
		
	}

}
