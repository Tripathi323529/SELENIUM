package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class haovar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver_v75.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com");
		WebElement we= dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a"));
		WebElement we1=dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[3]/a"));
		
		Actions act=new Actions(dr);
		
		Action set= act
				.moveToElement(we)
				.build();
		
		set.perform();
		
		Action set1= act
				.moveToElement(we1)
				.click(we1)
				.build();
		
		set1.perform();
		
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[1]/a/img")).click();
		
		WebElement we2=dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/a"));
		WebElement we3=dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/ul/li[2]/a"));
		
		Action set2= act
				.moveToElement(we2)
				.build();
		
		set2.perform();
		
		Action set3= act
				.moveToElement(we3)
				.click(we3)
				.build();
		
		set3.perform();
		
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[1]/a/img")).click();
		
		
		
				

	}

}
