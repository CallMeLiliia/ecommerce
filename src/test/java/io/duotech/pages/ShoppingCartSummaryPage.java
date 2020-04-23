package io.duotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.pages.utilities.Driver;

public class ShoppingCartSummaryPage {

	public ShoppingCartSummaryPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy ()
	public WebElement productName;
	
	@FindBy ()
	public WebElement unitPrice;
	
	@FindBy ()
	public WebElement quantity;
	@FindBy ()
	public WebElement totalBefore;
	@FindBy ()
	public WebElement totalAfter;
	
}
