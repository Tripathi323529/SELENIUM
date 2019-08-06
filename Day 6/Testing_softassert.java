package TESTING_FEATURES;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing_softassert {
  @Test
  public void test1() {
	  String er="Noida", ar="Noida";
	  System.out.println("in test 2");
	  Assert.assertEquals(ar, er);
	  System.out.println("in assdin");
  }
  @Test
  public void test2() {
	  String er="Noida", ar="Noida";
	  System.out.println("in test 4");
	  SoftAssert sa=new SoftAssert();
	  sa.assertEquals(ar, er);
	  System.out.println("in assdin5");
	  
	  sa.assertAll();
  }
}
