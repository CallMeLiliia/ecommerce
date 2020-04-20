package io.duotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.pages.utilities.Driver;

public class LoginPage {

	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id = "email")
	public WebElement emailInputBox;

	@FindBy(id = "passwd")
	public WebElement passwordInputButton;

	@FindBy(xpath = "//button[@id='SubmitLogin']")
	public WebElement signInButton;

	@FindBy(id = "email_create")
	public WebElement createAccountEmail;
	
	@FindBy(id = "SubmitCreate")
	public WebElement createAccountButton;
}
