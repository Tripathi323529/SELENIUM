package Excersice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver_v75.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("http://examples.codecharge.com//Store//Default.php");
		String exp_result="Online Bookstore";
		String act_result=dr.getTitle();
		//for string valu to compare always use compareTo method
		if(exp_result.compareTo(act_result)==0) {
			System.out.println("Verified");
			
		}
		else {
			System.out.println("Not Verified");
		}
		WebElement wel=dr.findElement(By.name("category_id"));
		Select sel1=new Select(wel);
		sel1.selectByVisibleText("Databases");
		dr.findElement(By.name("DoSearch")).click();
		dr.close();

	}

}
