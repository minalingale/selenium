package Assignment_selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Ass35_Screenshot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		ChromeDriver ts=driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
	//	File destination=new File("C:\\Users\\Minal Ingale\\Desktop\\AB45\\minal.png");//if we change the url then screenhot is replaced 
        File destination=new File("C:\\Users\\Minal Ingale\\Desktop\\AB45\\minal"+ Math.random() +".png");//if we add math.random then every screenshote saved at diffrently (not rep;laced) 

		
		FileHandler.copy(source, destination);
		
		
	}

}
