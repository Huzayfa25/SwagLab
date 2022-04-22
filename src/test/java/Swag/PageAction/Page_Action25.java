package Swag.PageAction;

import org.testng.Assert;

import Swag.PageLocator.Page_Locator25;
import Util25.TestBase25;

public class Page_Action25 extends TestBase25 {
	
	
	Page_Locator25 pagelocator25 = new Page_Locator25 ();
	
	public void StandardUser_Username (){
	
	pagelocator25.EnterUsrname.sendKeys("standard_user");
	

}
	
	public void StandardUser_Password () {
		
		pagelocator25.EnterPassword.sendKeys("secret_sauce");
	}
	
	public void ClickLoginButton () {
		
		pagelocator25.LoginButton.click();
		
	}
	
	public void redirectedSauceDemoMainPage () {
		
		pagelocator25.Redirect.click();
	}
	public void clicksidebar () {
		
		pagelocator25.ClickSidebar.click();
	}
	
	public void verifyAppLogoexists  () {
		
	boolean VerifyAppLogo25 = pagelocator25.VerifyAppLogo.isDisplayed();
	Assert.assertTrue(VerifyAppLogo25);
		
		
}
	public void LockedOutUser_Username (){
		pagelocator25.EnterUsrname.sendKeys("locked_out_user");
		
	}
	public void LockedOutUser_Password () {
		pagelocator25.EnterPassword.sendKeys("secret_sauce");
		
	}
	
	public void ClickLoginButtonLockedUser () {
		pagelocator25.LoginButton.click();
	}
	
	public void verifyErrorMessage () {
		boolean Error25 = pagelocator25.ErrorMessage.isDisplayed();
		Assert.assertTrue(Error25);
		
	}
}		
