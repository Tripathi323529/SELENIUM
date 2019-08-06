package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver_v75.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.facebook.com");
		//tag#id
		//dr.findElement(By.cssSelector("input#u_0_2")).click();
		//tag[attribute='value']
		dr.findElement(By.cssSelector("input[type='submit']")).click();

	}

}
