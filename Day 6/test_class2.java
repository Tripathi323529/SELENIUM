package Testing_Features2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class test_class2 {
	 @Test
	  public void test3() {
		  String er="Noida", ar="Noida";
		  System.out.println("in test 23");
		  Assert.assertEquals(ar, er);
		  System.out.println("in assdin66");
	  }
	  @Test
	  public void test4() {
		  String er="Noida", ar="Noida";
		  System.out.println("in test 48");
		  SoftAssert sa=new SoftAssert();
		  sa.assertEquals(ar, er);
		  System.out.println("in assdin67");
		  
		  sa.assertAll();
	  }
}
