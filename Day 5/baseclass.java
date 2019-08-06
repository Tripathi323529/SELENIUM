package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	String s;
	String s1;
	String s2;
	String s3;
	String s4;
	String s5;
	
	public void login(String s,String s1,String s2) {
		System.setProperty(s, s1);
		WebDriver dr = new ChromeDriver();
		dr.get(s2);
		dr.close();
		
	}


}
