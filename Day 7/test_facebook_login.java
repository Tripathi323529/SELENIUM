package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.fb_home_page;
import pages.fb_login_page;

public class test_facebook_login {
	WebDriver dr;
	fb_login_page loginpage;
	fb_home_page homepage;
	
@BeforeClass
public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver","chromedriver_v75.exe");
	 dr= new ChromeDriver();
	 dr.get("http://www.facebook.com");
	
}

  @Test(priority=0)
  public void test_login_page() {
	  loginpage =new fb_login_page(dr);
	  String login_page_title=loginpage.get_title();
	  System.out.println("Title : " + login_page_title);
	  
	  Assert.assertTrue(login_page_title.contains("Facebook"));
	  
  }
  
 @Test(priority=2)
 public void test_home_page() {
	 loginpage.do_login("akash.royal9912@gmail.com", "batman087");
	 homepage=new fb_home_page(dr);
	 String actual_vl=homepage.get_home_page();
	 System.out.println("Actual Profile name: " + actual_vl);
	 Assert.assertTrue(actual_vl.contains("Sky"));
 }
}
