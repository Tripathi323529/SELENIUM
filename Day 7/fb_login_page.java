package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fb_login_page {
	By uname=By.xpath("//input[@id=\"email\"]");
	By pwd=By.xpath("//input[@id=\"pass\"]");
	By btn=By.xpath("//input[@data-testid=\"royal_login_button\"]");
	
	
	WebDriver dr;
	
	public fb_login_page(WebDriver dr) {
		this.dr=dr;
	}
	public void set_uname(String un) {
		dr.findElement(uname).sendKeys(un);
	}
	public void set_pwd(String pword) {
		dr.findElement(pwd).sendKeys(pword);
	}
	public void click_btn() {
		dr.findElement(btn).click();
	}
	
	public void do_login(String u,String p) {
		this.set_uname(u);
		this.set_pwd(p);
		this.click_btn();
	}
	public String get_title() {
		return dr.getTitle();
	}

}
