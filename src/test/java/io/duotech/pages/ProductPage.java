package io.duotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.pages.utilities.Driver;

public class ProductPage {

	
	public ProductPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(tagName = "h1")
	public WebElement productName;
	
	@FindBy (id = "quantity_wanted")
	public WebElement quantityBox;

	@FindBy(className = "icon-plus")
	public WebElement plusButton;
	@FindBy(className = "icon-minus")
	public WebElement minusButton;
	
	@FindBy(xpath = "//span[@id='our_price_display']")
	public WebElement price;
	
	@FindBy (xpath = "//span[@itemprop='sku']")
	public WebElement model;
	
	@FindBy (xpath = "//tr[@class='odd']//td[2]")
	public WebElement composition;
	
	@FindBy (xpath="//tr[@class='even']//td[2]")
	public WebElement style;
	
	@FindBy(id="add_to_cart")
	public WebElement addToCart;
	
	@FindBy(className ="btn btn-default button button-medium")
	public WebElement proceed;
}
