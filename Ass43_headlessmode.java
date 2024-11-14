package Assignment_selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ass43_headlessmode {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
	
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}

}
