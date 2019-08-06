package TESTING_FEATURES;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Excersice.online;
import Selenium.baseclass;

public class TESTING_TC1 extends online {
	
	Logger log;
  @Test
  public void tc1() {
	  baseclass bd=new baseclass();
	  bd.login("webdriver.chrome.driver", "chromedriver_v75.exe", "http://demo.guru99.com/test/delete_customer.php");
	  
	  
  }
@Test
  public void tc2() {
	  System.out.println("in tc2");
	  log=Logger.getLogger("devpinoyLogger");
	  log.info("test 2 is executed");
	  
  }
  @Test
  public void tc3() {
	  System.out.println("in tc3");
	  exc_5();
	  log.info("test 3 is executed");
	  
	  
  }
}
