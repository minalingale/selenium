package Assignment_selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ass01_Launch_Browser {

	public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver(); 
		//EdgeDriver driver=new EdgeDriver(); 
		//driver.get("http://www.amazon.in");
		//driver.manage().window().maximize();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.in");

	}

}
