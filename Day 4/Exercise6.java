package Excersice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver_v75.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("http://examples.codecharge.com//Store//Default.php");
		WebElement wel=dr.findElement(By.name("category_id"));
		Select sel1=new Select(wel);
		sel1.selectByVisibleText("Programming");
		dr.findElement(By.name("DoSearch")).click();
		dr.findElement(By.xpath("//a[text()=\"Programming Perl\"]")).click();
		dr.findElement(By.xpath("//input[@name=\"quantity\"]")).clear();
		dr.findElement(By.xpath("//input[@name=\"quantity\"]")).sendKeys("4");
		dr.findElement(By.xpath("//input[@name=\"Insert1\"]")).click();
		dr.findElement(By.xpath("//a[text()=\"Home\"]")).click();
		WebElement wel1=dr.findElement(By.name("category_id"));
		Select sel2=new Select(wel1);
		sel2.selectByVisibleText("Databases");
		dr.findElement(By.name("DoSearch")).click();
		dr.findElement(By.xpath("//*[contains (text(),'Web Database Development')]")).click();
		
		
		

	}

}
