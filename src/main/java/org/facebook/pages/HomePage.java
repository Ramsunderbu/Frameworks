package org.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.LibGlobal;

public class HomePage extends LibGlobal {
	@FindBy(id="email")
	WebElement txtUser;
	
	@FindBy(name="pass")
	WebElement txtPass;
	
	@FindBy(xpath="//button[@name='login']")
	WebElement btnLogin;
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	WebElement btnForgetten;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	
	}
	public void logintoPage(String Username,String pass) {
		insertValueInTextBox(txtUser, Username);
		insertValueInTextBox(txtPass, pass);
		
	}
	public void validateForgottenPassword() {
		click(btnForgetten);

	}
	


}
