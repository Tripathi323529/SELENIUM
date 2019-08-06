package TESTING_FEATURES;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base_Class.login;

public class TESTING_TNG_LOGIN extends login{
  @Test
  public void test1() {
	  this.user_name="akash.royal9912@gmail.com";
	  this.pass="batman087";
	  this.er="Sky";
	  //this.ar=this.login_id();
	  Assert.assertEquals(ar, er);
  }
  @Test
  public void test2() {
	  this.user_name="akash.royal9912@gmail.com";
	  this.pass="batman087";
	  this.er="Sku";
	  //this.ar=this.login_id();
	  Assert.assertEquals(ar, er);
  }
  
}
