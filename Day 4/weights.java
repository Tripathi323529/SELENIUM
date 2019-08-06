package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class weights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver_v75.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.facebook.com");
		
		WebDriverWait wt=new WebDriverWait(dr,4);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@data-testid=\"royal_login_button\"]")));
		
		dr.findElement(By.xpath("//input[@data-testid=\"royal_login_button\"]")).click();
		
		dr.navigate().back();
		dr.navigate().forward();
		dr.navigate().refresh();

	}

}
