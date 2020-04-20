package io.duotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.pages.utilities.Driver;

public class MyAccountPage {
	public MyAccountPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//p[@class='info-account']")
	public WebElement welcomeMessage;

	@FindBy(xpath = "//a[@title='Log me out']")
	public WebElement logOutButton;

	@FindBy(xpath = "//a[@title='View my customer account']")
	public WebElement customerNAme;

}
