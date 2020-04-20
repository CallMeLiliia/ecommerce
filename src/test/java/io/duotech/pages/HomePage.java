package io.duotech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.pages.utilities.Driver;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(className = "login")
	public WebElement signInLink;
	
	@FindBy(xpath = "(//a[@title='Blouse'])[2]")
	public WebElement blouse;
	@FindBy(xpath = "(//a[.='Dresses'])[2]")
	public WebElement dressesLink;
	
	
	public WebElement getProduct (String name) {
		String xpath = "(//a[@title='"+name+"'])[2]";
		return Driver.getDriver().findElement(By.xpath(xpath));
	}
	
	
	
	
}
