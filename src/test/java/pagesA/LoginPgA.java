package pagesA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbaseA.WebTestBaseA;

public class LoginPgA extends WebTestBaseA{
	@FindBy(id = "email")
    WebElement mobileTextBox;

    @FindBy(name = "password")
    WebElement passwordTextBox;

    @FindBy(id = "signInBtn")
    WebElement loginbtn;
    public LoginPgA() {
    	PageFactory.initElements(driver,this);
    }

    public void login(String email, String password){
        mobileTextBox.sendKeys(email);
        passwordTextBox.sendKeys(password);
        loginbtn.click();
    }
}
