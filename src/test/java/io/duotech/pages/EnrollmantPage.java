package io.duotech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.pages.utilities.Driver;

public class EnrollmantPage {

	public EnrollmantPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//span[contains(text(),'SQAE Summer (06.02.2020)')]")
	public WebElement text;
}
