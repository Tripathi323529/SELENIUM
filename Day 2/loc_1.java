package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loc_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver_v75.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.facebook.com");
		
		dr.findElement(By.linkText("Forgotten account?")).click();

	}

}
