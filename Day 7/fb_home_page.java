package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fb_home_page {
	WebDriver dr;
	 By profile_name=By.xpath("//span[@class=\"_1vp5\"]");
	 
	 public fb_home_page(WebDriver dr) {
		 this.dr=dr;
	 }
	 public String get_home_page() {
		 return dr.findElement(profile_name).getText();
	 }

}
