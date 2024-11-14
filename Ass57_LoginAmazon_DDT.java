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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass57_LoginAmazon_DDT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step 1:let the java know where exctaly is sheet present
				FileInputStream f1=new FileInputStream("C:\\Users\\Minal Ingale\\eclipse-workspace\\SeleniumBasic\\DataSheet\\YourSheet.xlsx");
					//2 open the excel sheet
				Workbook w1=	WorkbookFactory.create(f1);
				//3 go to the actual  sheet
					Sheet s1=			w1.getSheet("login");
						Row r1=	s1.getRow(1);
						Cell c1=	r1.getCell(0);
						String un=		c1.getStringCellValue();
						//System.out.println(un);
						Row r2=	s1.getRow(1);
						Cell c2=		r2.getCell(1);
						String password=	c2.getStringCellValue();
						//System.out.println(password);
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		WebElement un1=driver.findElement(By.name("email"));
		un1.sendKeys(un);
		
		WebElement contiue_button=driver.findElement(By.id("continue"));
		contiue_button.click();
		
	    WebElement pwd=driver.findElement(By.id("ap_password"));
		pwd.sendKeys("password");
		
		WebElement signin_button=driver.findElement(By.id("signInSubmit"));
		signin_button.click();
	}

}
