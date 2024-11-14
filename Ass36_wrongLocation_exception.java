package Assignment_selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Ass36_wrongLocation_exception {

	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
	//	Ass36_wrongLocation_exception tc1=new Ass36_wrongLocation_exception();
		//System.out.println(tc1.getClass());
		//new Ass36_wrongLocation_exception().getClass();
		ChromeDriver ts=driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
	//	File destination=new File("C:\\Users\\Minal Ingale\\Desktop\\AB45\\minal.png");//if we change the url then screenhot is replaced 
File destination=new File("K:\\Users\\Minal Ingale\\Desktop\\AB45\\minal.png" + "new Ass36_wrongLocation_exception().getClass() "+ Math.random() +" .png");
	//if we add math.random then every screenshote saved at diffrently (not rep;laced) 

		
		FileHandler.copy(source, destination);
		//o/p=[_wrongLocation_exception.java:28)

		
	}

}
