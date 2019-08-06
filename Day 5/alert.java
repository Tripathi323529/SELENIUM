package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://demo.guru99.com/test/delete_customer.php");
		dr.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("asdks");
		dr.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		dr.switchTo().alert().accept();
		dr.switchTo().alert().accept();
	}

}
