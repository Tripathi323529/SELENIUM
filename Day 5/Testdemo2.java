package DataDriven;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 obj = new Demo1();
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com");
		for(int i=1;i<=4;i++)
		{
			dr.findElement(By.xpath("//*[@class='ico-login']")).click();
			obj = read_excel(i,"Sheet1");
			dr.findElement(By.name("Email")).sendKeys(obj.email);
			dr.findElement(By.name("Password")).sendKeys(obj.pass);
			dr.findElement(By.xpath("//input[@value='Log in']")).click();
			String title=dr.getTitle();
			if(title.compareTo("Demo Web Shop")==0){
				obj.act_value = "Login Succesful.";
				dr.findElement(By.xpath("//*[@class='ico-logout']")).click();
				
				
			}
			else if(title.compareTo("Demo Web Shop. Login")==0) {
				if(dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/span")).isDisplayed()) {
					obj.act_value=dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/span")).getText();
				}
				
				else if(dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div")).isDisplayed()) {
					obj.act_value=dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div")).getText();
				}
				else if(dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div")).isDisplayed()) {
					obj.act_value=dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div")).getText();
				}
			}
			if(obj.act_value.compareTo(obj.exp_value)==0) {
				obj.test_res="PASS";
			}
			else {
				obj.test_res="FAIL";
			}
			write_excel(i,"Sheet1",obj);

		}
		dr.close();
	}
	public static Demo1 read_excel(int r, String sheet)
	{
		Demo1 obj = new Demo1();
		try {
			File f = new File("C:\\Users\\akash.tripathi1\\Desktop\\Extra\\TestData.xlsx");
			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet(sheet);
			XSSFRow row = sh.getRow(r);
			XSSFCell cell_id = row.getCell(0);
			XSSFCell cell_pass = row.getCell(1);
			XSSFCell cell_exp = row.getCell(2);
			obj.setEmail(cell_id.getStringCellValue());
			obj.setPass(cell_pass.getStringCellValue());
			obj.setExp_value(cell_exp.getStringCellValue());
			return obj;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
	public static void write_excel(int r, String sheet, Demo1 obj)
	{
		try {
			File f = new File("C:\\Users\\akash.tripathi1\\Desktop\\Extra\\TestData.xlsx");
			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet(sheet);
			XSSFRow row = sh.getRow(r);
			XSSFCell cell_act = row.createCell(3);
			XSSFCell cell_res = row.createCell(4);
			cell_act.setCellValue(obj.act_value);
			cell_res.setCellValue(obj.test_res);
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
