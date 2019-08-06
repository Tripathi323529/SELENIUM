package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class simulatekeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver_v75.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.facebook.com");
		WebElement we2=dr.findElement(By.xpath("//input[@name=\"firstname\"]"));
		WebElement we3=dr.findElement(By.xpath("//input[@name=\"lastname\"]"));
		
		Actions act=new Actions(dr);
		
		Action set = act
				.moveToElement(we2)
				.click(we2)
				.sendKeys("Akki")
				.keyDown(we2,Keys.CONTROL)
				.sendKeys(we2, "a")
				.sendKeys(we2, "c")
				.keyUp(we2,Keys.CONTROL)
				.build();
		
		set.perform();
		Actions act1=new Actions(dr);
		
		Action set1= act1
				.moveToElement(we3)
				.click(we3)
				.keyDown(we3, Keys.CONTROL)
				.sendKeys(we3, "v")
				.keyUp(we3, Keys.CONTROL)
				.build();
		
		set1.perform();

	}

}
