package Assignment_selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ASS37_Time {

	public static void main(String[] args) throws IOException   {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
        Date d1=new Date();
        System.out.println(d1.getTime());//epoch time
        Date d2=new Date(d1.getTime());
        System.out.println("current time->"+d2);

        String Human =d2.toString();
        String day=Human.replace(":","").replace(" ", "");
        System.out.println(day);

        ChromeDriver ts=driver;
        File source=ts.getScreenshotAs(OutputType.FILE);
       //File destination=new File("C:\\Users\\Minal Ingale\\Desktop\\AB45\\minal.png");//if we add math.random then every screenshote saved at diffrently (not rep;laced) 
        File destination=new File("C:\\Users\\Minal Ingale\\Desktop\\AB45\\minal"+ day +".png");//if we add math.random then every screenshote saved at diffrently (not rep;laced) 
        FileHandler.copy(source, destination);



        
		
	}

}
