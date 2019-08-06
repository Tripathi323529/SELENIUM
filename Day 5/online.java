package Excersice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class online {
	public void exc_5() {
		System.setProperty("webdriver.chrome.driver","chromedriver_v75.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("http://examples.codecharge.com//Store//Default.php");
		String exp_result="Online Bookstore";
		String act_result=dr.getTitle();
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
		dr.findElement(By.xpath("//*[contains (text(),'Web Database Development')]")).click();
		String c="Web Database Development";
		String d=dr.findElement(By.xpath("//h1[text()=\"Web Database Development\"]")).getText();
		if(c.compareTo(d)==0) {
			System.out.println("Verified");
			
		}
		else {
			System.out.println("Not Verified");
			
		}
		String e=dr.findElement(By.xpath("//td[@colspan=\"2\"] ")).getText();
		dr.findElement(By.xpath("//input[@name=\"quantity\"]")).clear();
		dr.findElement(By.xpath("//input[@name=\"quantity\"]")).sendKeys("2");
		dr.findElement(By.xpath("//input[@name=\"Insert1\"]")).click();
		String f=dr.findElement(By.xpath("//td[text()=\"$79.98\"]")).getText();
		dr.close();
	}

}
