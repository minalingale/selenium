package Assignment_selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass59 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//step 1:let the java know where exctaly is sheet present
				FileInputStream f1=new FileInputStream("C:\\Users\\Minal Ingale\\eclipse-workspace\\SeleniumBasic\\DataSheet\\YourSheet2.xlsx");
					//2 open the excel sheet
				Workbook w1=	WorkbookFactory.create(f1);
				//3 go to the actual  sheet
				
				
					Sheet s1=			w1.getSheet("Address");
						Row r1=	s1.getRow(1);
						Cell c1=	r1.getCell(0);
						String fname=		c1.getStringCellValue();
						
						
						Row r2=	s1.getRow(1);
						Cell c2=	r1.getCell(1);
						long Mono=		(long) c2.getNumericCellValue();
						
						Row r3=	s1.getRow(1);
						Cell c3=	r1.getCell(2);
						long  pin=		(long) c3.getNumericCellValue();
						

						Row r4=	s1.getRow(1);
						Cell c4=	r1.getCell(3);
						String address=		c4.getStringCellValue();
						
						Row r5=	s1.getRow(1);
						Cell c5=	r1.getCell(4);
						String area=		c5.getStringCellValue();
						
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/a/addresses/add?ref=ya_address_book_add_button");
		driver.manage().window().maximize();
		
		WebElement e8=driver.findElement(By.name("email"));
		e8.sendKeys("9175522451");
		WebElement e9= driver.findElement(By.id("continue"));
		e9.click();
		WebElement e10=	driver.findElement(By.name("password"));
		e10.sendKeys("Atharvaved@248");
		
		WebElement e11=driver.findElement(By.id("signInSubmit"));
		e11.click();
		
		WebElement e1=driver.findElement(By.name("address-ui-widgets-enterAddressFullName"));
		e1.sendKeys(fname+ Keys.ENTER);
		
		/*WebElement e3=driver.findElement(By.name("address-ui-widgets-enterAddressPhoneNumber"));
		e3.sendKeys(Mono+ Keys.ENTER);
		
		WebElement e4=	driver.findElement(By.name("address-ui-widgets-enterAddressPostalCode"));
		e4.sendKeys(pin+ Keys.ENTER);*/
		
		WebElement e5=driver.findElement(By.name("address-ui-widgets-enterAddressLine1"));
		e5.sendKeys(address+ Keys.ENTER);
		 
		WebElement e6=driver.findElement(By.name("address-ui-widgets-enterAddressLine2"));
		e6.sendKeys(area+ Keys.ENTER);

	}

}
