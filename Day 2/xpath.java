package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver_v75.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.facebook.com");
		
		//dr.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Akki0876");
		//dr.findElement(By.xpath("//*[text()='Log In']")).click();
		String s;
		s=dr.findElement(By.xpath("//*[contains (text(), 'Create an account')]")).getText();
		System.out.println("Value text is : " + s);
	}

}
