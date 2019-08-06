package Testing_Features3;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testing_class3 {
	 @Test
	  public void test5() {
		  String er="Noida", ar="Noida";
		  System.out.println("in test 2345");
		  Assert.assertEquals(ar, er);
		  System.out.println("in assdin6689");
	  }
	  @Test
	  public void test6() {
		  String er="Noida", ar="Noida";
		  System.out.println("in test 489");
		  SoftAssert sa=new SoftAssert();
		  sa.assertEquals(ar, er);
		  System.out.println("in assdin6767");
		  
		  sa.assertAll();
	  }
}
