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

public class Ass58_searchProduct_Amazon {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//step 1:let the java know where exctaly is sheet present
		FileInputStream f1=new FileInputStream("C:\\Users\\Minal Ingale\\eclipse-workspace\\SeleniumBasic\\DataSheet\\YourSheet1.xlsx");
			//2 open the excel sheet
		Workbook w1=	WorkbookFactory.create(f1);
		//3 go to the actual  sheet
			Sheet s1=			w1.getSheet("Search");
				Row r1=	s1.getRow(1);
				Cell c1=	r1.getCell(0);
				String product=		c1.getStringCellValue();
				//System.out.println(un);
				

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys(product+ Keys.ENTER);
		
		
	}

}
