package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver_v75.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.facebook.com");
		
		dr.findElement(By.id("email")).sendKeys("akash.royal9912@gmail.com");
		
		

	}

}
