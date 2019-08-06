package Base_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class all_methods {
	public String Keyword;
	public String Xpath;
	public String Test_Data;
	public String Test_Result;
	public String getKeyword() {
		return Keyword;
	}
	public String setKeyword(String keyword) {
		return Keyword = keyword;
	}
	public String getXpath() {
		return Xpath;
	}
	public String setXpath(String xpath) {
		return Xpath = xpath;
	}
	public String getTest_Data() {
		return Test_Data;
	}
	public String setTest_Data(String test_Data) {
		return Test_Data = test_Data;
	}
	public String getTest_Result() {
		return Test_Result;
	}
	public String setTest_Result(String test_Result) {
		return Test_Result = test_Result;
	}
	public static WebDriver dr;
	public void lb1(String Test_Data) {
		System.setProperty("webdriver.chrome.driver","chromedriver_v75.exe");
		 dr= new ChromeDriver();
		dr.get(Test_Data);
	}
	
	public void entertext1(String Xpath, String Test_Data ) {
		dr.findElement(By.xpath(Xpath)).sendKeys(Test_Data);

		
	}
	
	
	public void click1(String Xpath) {
		dr.findElement(By.xpath(Xpath)).click();
	}
	
	public void verify1(String Xpath,String Test_Data) {
		String exp_result=Test_Data;
		String act_result=dr.findElement(By.xpath(Xpath)).getText();
		if(exp_result.compareTo(act_result)==0) {
			Test_Result="Pass";
			System.out.println("Verified");
			
		}
		else {
			Test_Result="Fail";
			System.out.println("Not Verified");
		}
		dr.close();
	}
	
	

}
