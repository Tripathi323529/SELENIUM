package Excersice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver_v75.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("https://demowebshop.tricentis.com");
		dr.findElement(By.xpath("//a[@class='ico-login']")).click();
		dr.findElement(By.id("Email")).sendKeys("akash.eng17@gmail.com");
		dr.findElement(By.id("Password")).sendKeys("pass123$");
		dr.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();
		String exp_result="akash.eng17@gmail.com";
		String act_result=dr.findElement(By.xpath("//*[contains (text(), 'akash.eng17@gmail.com')]")).getText();
		if(exp_result.compareTo(act_result)==0) {
			System.out.println("Verified");
			
		}
		else {
			System.out.println("Not Verified");
		}
		dr.findElement(By.xpath("//*[contains (text(), 'Log out')]")).click();
		dr.close();
		

	}

}
