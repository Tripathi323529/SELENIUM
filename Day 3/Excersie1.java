package Excersice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excersie1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver_v75.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("https://demowebshop.tricentis.com");
		String exp_result="Demo Web Shop";
		String act_result=dr.getTitle();
		//for string valu to compare always use compareTo method
		if(exp_result.compareTo(act_result)==0) {
			System.out.println("Verified");
			
		}
		else {
			System.out.println("Not Verified");
		}
		
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
		String c="Demo Web Shop. Register";
		String d=dr.getTitle();
		if(c.compareTo(d)==0) {
			System.out.println("Verified");
		}
		else {
			System.out.println("Not Verified");
		}
		List rb=dr.findElements(By.name("Gender"));
	    ((WebElement) rb.get(1)).click();
		dr.findElement(By.id("FirstName")).sendKeys("Sky");
		dr.findElement(By.id("LastName")).sendKeys("Walker");
		dr.findElement(By.id("Email")).sendKeys("akash.eng17@gmail.com");
		dr.findElement(By.id("Password")).sendKeys("pass123$");
		dr.findElement(By.id("ConfirmPassword")).sendKeys("pass123$");
		dr.findElement(By.id("register-button")).click();
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")).click();
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		dr.close();

	}

}
