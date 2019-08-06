package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testalert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baseclass b=new baseclass();
		b.login("webdriver.chrome.driver", "chromedriver_v75.exe", "http://demo.guru99.com/test/delete_customer.php");

	}

}
