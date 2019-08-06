package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver_v75.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.facebook.com");
		//alternate method to write the email id.
		
		WebElement we=dr.findElement(By.id("email"));
		we.sendKeys("akash.eng14@gmail.com");

	}

}
