package Assignment_selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass32_Naukri_moveControlto_child {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.xpath("//span[.='Google']"));	
		e1.click();
		Set<String> s1=	driver.getWindowHandles();//browser id
		System.out.println(s1);
						
			Iterator<String> i1=			s1.iterator();
				String parentid=		i1.next();
				String childid=		i1.next();
				System.out.println( parentid);
				System.out.println(childid);
				 driver.close();//parent window close because control is in parent window
				 driver.quit();//both window cloed
			    //no move the control to child window as below
		driver.switchTo().window(childid);
		Thread.sleep(2000);
		driver.close();
		
	}

}
