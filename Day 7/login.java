package Base_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	public String user_name;
	public String pass;
	public String er;
	public String ar;
	
		public void login_text() {
		System.setProperty("webdriver.chrome.driver","chromedriver_v75.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.facebook.com");
		//to write email id and password
		
		//dr.findElement(By.xpath("//a[@class='ico-login']")).click();
		dr.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(user_name);
		dr.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys(pass);
		dr.findElement(By.xpath("//input[@data-testid=\"royal_login_button\"]")).click();
		dr.close();
		//if(dr.getTitle().compareTo("Demo Web Shop")==0){
			//ar = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
			//dr.findElement(By.xpath("//*[@class='ico-logout']")).click();
			
			
		//}
		//else if(dr.getTitle().compareTo("Demo Web Shop. Login")==0) {
			//if(dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/span")).isDisplayed()) {
				//ar=dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/span")).getText();
			//}
			
			//else if(dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div")).isDisplayed()) {
				//ar=dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div")).getText();
			//}
			//else if(dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div")).isDisplayed()) {
				//ar=dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div")).getText();
			//}
		//}
		
		//String test=dr.findElement(By.xpath("//*[@id=\"u_0_a\"]/div[1]/div[1]/div/a/span")).getText();
		//dr.close();
		//return test;
		//return ar;
		
		
	}
}


