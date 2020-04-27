package io.duotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.pages.utilities.Driver;

public class ShoppingCartSummaryPage {

	public ShoppingCartSummaryPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath = "//tr[@id='product_7_34_0_0']//p[@class='product-name']")
	public WebElement productName;
	
	@FindBy (id="product_price_7_34_0")
	public WebElement unitPrice;
	
	@FindBy (className = "cart_quantity_input form-control grey")
	public WebElement quantity;
	@FindBy (id = "total_product_price_7_34_0")
	public WebElement totalBefore;
	@FindBy (id = "total_price")
	public WebElement totalAfter;
	
}
