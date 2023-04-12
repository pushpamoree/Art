package pagesA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbaseA.WebTestBaseA;

public class HomePgA extends WebTestBaseA{
	@FindBy(xpath = "//*//a[text()='USER LOGIN']")
    WebElement usersearch;

    public HomePgA(){
        PageFactory.initElements(driver,this);
    }

    public void userSearchClick(){
        usersearch.click();
    }

}
