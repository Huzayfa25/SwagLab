package Swag.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Util25.TestBase25;

public class Page_Locator25 extends TestBase25 {
	
	
	public Page_Locator25() {
        // // This is WebElement,it is a Interface & we will make it public//

PageFactory.initElements(driver, this);

}

@FindBy(how=How.ID, using="user-name") // create locator e.g XPATH, ID, NAME 
public WebElement EnterUsrname;        


@FindBy(how=How.ID, using="password")
public WebElement EnterPassword;


@FindBy(how=How.ID, using="login-button")
public WebElement LoginButton;

@FindBy(how=How.ID, using="react-burger-menu-btn")
public WebElement Redirect;

@FindBy(how=How.ID, using="about_sidebar_link")
public WebElement ClickSidebar;

@FindBy(how=How.XPATH, using="//div[@class=\"nav-image\"]")
public WebElement VerifyAppLogo;

@FindBy(how=How.XPATH, using="//h3[@data-test=\"error\"]")
public WebElement ErrorMessage;




}


