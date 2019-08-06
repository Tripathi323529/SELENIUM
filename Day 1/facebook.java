package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to open the facebook app
		System.setProperty("webdriver.chrome.driver","chromedriver_v75.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.facebook.com");
		//to write email id and password
		dr.findElement(By.id("email")).sendKeys("akash.royal9912@gmail.com");
		dr.findElement(By.id("pass")).sendKeys("batman087");
		dr.findElement(By.id("loginbutton")).click();
		//get the facebook id title from the id shown above
		String profile_name, title=dr.getTitle();
		profile_name=dr.findElement(By.xpath("//*[@id=\"u_0_a\"]/div[1]/div[1]/div/a/span/span")).getText();
		System.out.println("title: " + title + "\nprofile name: " + profile_name);
		
	}

}
