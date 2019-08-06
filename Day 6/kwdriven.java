package Keyworddriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import Base_Class.all_methods;
import DataDriven.Demo1;

public class kwdriven extends all_methods {



	public static all_methods read_excel(int r, String sheet)
	{
		all_methods obj = new all_methods();
		try {
			File f = new File("C:\\Users\\akash.tripathi1\\Desktop\\Extra\\Akash.xlsx");
			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet(sheet);
			XSSFRow row = sh.getRow(r);
			XSSFCell cell_kw = row.getCell(1);
			XSSFCell cell_pass = row.getCell(2);
			XSSFCell cell_td = row.getCell(3);
			
			obj.setKeyword(cell_kw.getStringCellValue());
			obj.setXpath(cell_pass.getStringCellValue());
			obj.setTest_Data(cell_td.getStringCellValue());
			
			return obj;
			
			
		}
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
	public static void write_excel(int r, String sheet, all_methods obj)
	{
		try {
			File f = new File("C:\\Users\\akash.tripathi1\\Desktop\\Extra\\Akash.xlsx");
			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet(sheet);
			XSSFRow row = sh.getRow(r);
			XSSFCell cell_res = row.createCell(4);
			cell_res.setCellValue(obj.Test_Result);
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



	public static void main(String[] args)  {
		
		// TODO Auto-generated method stub
		all_methods ob=new all_methods();
		for(int i=1;i<=6;i++) {
		ob=read_excel(i,"Sheet1");
		System.out.println(ob.Keyword);
		switch(ob.Keyword) {
		case "launchbrowser":{
		ob.lb1(ob.Test_Data);
		break;
		}
		case "click":{
			ob.click1(ob.Xpath);
			break;
		}
		case "entertext":{
			ob.entertext1(ob.Xpath, ob.Test_Data);
			break;
		}
		case "verify":{
			ob.verify1(ob.Xpath, ob.Test_Data);
			write_excel(i,"Sheet1",ob);
			break;
		}
		}
		
		

	}

}
}
