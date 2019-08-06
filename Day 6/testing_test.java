package TESTING_FEATURES;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testing_test {
	@BeforeMethod
	public void BM(){
		
		System.out.println("Before Method");
	}
	@AfterMethod
	public void AM() {
		System.out.println("After Method");
		
	}
	@BeforeClass
	public void BC() {
		System.out.println("in get in");
	}
	@AfterClass
	public void AC() {
		System.out.println("out get in");
	}
  @Test(priority=6)
  public void A() {
	  System.out.println("in A");
  }
  @Test(priority=3)
  public void a() {
	  System.out.println("in a");
  }
  @Test(priority=1)
  public void Z() {
	  System.out.println("in Z");
  }
}
