package TESTING_FEATURES;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {
	 @Test(dataProvider="logindataprovider")
	  public void login_text(String user_name,String pass,String er) {
		 
		  System.out.println(user_name+ " " + pass + " " + er);
		 
		  Assert.assertEquals("Sky",er);
		  
	  }
  
  
  @DataProvider(name="logindataprovider")
  public String[][] login_text(){
	  String[][] logintestdata = {
			  {"akash.royal9912@gmail.com","batman087","Sky"},
			  {"akash.royal9912@gmail.com","batman087","Sky1"}
	  };
	  return logintestdata;
  }
}
