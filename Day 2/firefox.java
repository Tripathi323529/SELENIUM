package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "D:\\Drivers\\IEDriverServer.exe");
		WebDriver dr1=new InternetExplorerDriver();
		dr1.get("https://www.facebook.com");

	}

}
