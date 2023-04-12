package testcaseA;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pagesA.HomePgA;
import pagesA.LoginPgA;
import pagesA.MyAccountPg;
import testbaseA.WebTestBaseA;

public class tc extends WebTestBaseA {

	HomePgA homeA;
	LoginPgA loPgA;
	MyAccountPg myAccountPg;
	
	public tc() {
		super();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		initialization();
		homeA = new HomePgA();
		loPgA = new LoginPgA();
		myAccountPg=new MyAccountPg();
	}
	@Test(priority = 0)
	public void verifyLoginWithValidCredential(){
		SoftAssert softAssert = new SoftAssert();
		homeA.userSearchClick();
		loPgA.login(prop.getProperty("email"), prop.getProperty("password"));
		softAssert.assertAll();
	}
	
	 @Test(priority = 1)
	    public void verifyMouseHover(){
	        SoftAssert softAssert = new SoftAssert();
	        myAccountPg.mouseHover();
	        softAssert.assertAll();
	    }
	 @Test(priority = 2)
	    public void verifyScrollDown(){
	        SoftAssert softAssert = new SoftAssert();
	        myAccountPg.scrollDownMethod();
	        softAssert.assertAll();
	    }
	 @Test(priority = 3)
	 public void verifyGetWindowHandle(){
	        SoftAssert softAssert = new SoftAssert();
	        myAccountPg.windowHandle();
	        softAssert.assertAll();
	 }
	 
	 @Test(priority = 4)
	 public void verifyCheckBox(){
	        	SoftAssert softAssert=new SoftAssert();
	        	myAccountPg.checkincheckBox();
	        	softAssert.assertAll();
	        }
	        
	 @Test(priority = 5)
	    public void verifyCookiesHandle(){
	        SoftAssert softAssert = new SoftAssert();
	        myAccountPg.getCookiesHandle();
	        softAssert.assertAll();
	    }
	 //world art community
	 
	 @AfterMethod
	 public void afterMethod() {
		 driver.close();
	 }
}
