package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass19_growtechmind_regi_dropdown {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.id("Skills"));
	Select a1=new Select(e1);//for dropdown we are using select class,its object is created with the help of new and also specifie the location of the eb element
	//create the object of select class
	a1.selectByIndex(1);
	WebElement e3=	driver.findElement(By.id("Country"));
	Select a3=new Select(e3);
	a3.selectByIndex(4);
	WebElement e2=	driver.findElement(By.id("Relegion"));
	Select a2=new Select(e2);
	a2.selectByIndex(7);

		
	}

}
