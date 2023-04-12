package pagesA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbaseA.WebTestBaseA;
import utilsA.UtilityA;

public class MyAccountPg extends WebTestBaseA{
	
	@FindBy(xpath = "//a[text()='Gifts']")
	 WebElement hover;
	
	@FindBy(xpath = "//*[@id=\"wrap\"]/footer/div/div[1]/div[2]/ul/li[3]/ul/li[5]/a")
	WebElement instagram;
	
	@FindBy(xpath = "//*[@id=\"wrap\"]/div[1]/section[2]/div[1]/div/div[1]/div/div/div/div/div[1]/label")
    WebElement checkBox;

	public MyAccountPg() {	
		PageFactory.initElements(driver,this);
	}
	
	 public void mouseHover(){
	       UtilityA.mouseHover(driver,hover);
	    }
	 
	 public void scrollDownMethod() {
	        UtilityA.scrollDownByElement(driver, instagram);
	        instagram.click();

	    }
	 public void windowHandle(){
	        UtilityA.scrollDownByElement(driver, instagram);
	        instagram.click();
	        UtilityA.switchToWindows(driver);
	    }
	 
	 public void checkincheckBox(){
		    hover.click(); 
		    checkBox.click();
	    }
	 
	 public void getCookiesHandle(){
	        UtilityA.getCookies();
	    }
	 
	 public void search() {
		 
	 }
}
