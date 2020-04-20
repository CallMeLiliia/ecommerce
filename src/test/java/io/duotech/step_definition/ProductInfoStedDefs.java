package io.duotech.step_definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.duotech.pages.DressesPage;
import io.duotech.pages.HomePage;
import io.duotech.pages.ProductPage;
import io.pages.utilities.Driver;

public class ProductInfoStedDefs {

	String HomepageNameText;
	Integer globalTimes;
	DressesPage dressPage;

	@When("I click on Blouse")
	public void i_click_on_Blouse() {
		HomePage homePage = new HomePage();
		HomepageNameText = homePage.blouse.getText();
		homePage.blouse.click();
	}

	@Then("The product page should also display Blouse")
	public void the_product_page_should_also_display_Blouse() {

		ProductPage productPage = new ProductPage();
		String productPageName = productPage.productName.getText();
		Assert.assertEquals(HomepageNameText, productPageName);
	}

	@Then("I land on product page")
	public void i_land_on_product_page() {
		String actual = Driver.getDriver().getTitle();
		String expected = "Blouse - My Store";
		Assert.assertEquals(expected, actual);
	}

	@Then("The default quantity for the product should be {int}")
	public void the_default_quantity_for_the_product_should_be(Integer expected) {
		ProductPage productPage = new ProductPage();
		String actual = productPage.quantityBox.getAttribute("value");
		Assert.assertEquals(expected.toString(), actual);

	}

	@Then("I ckick on {word} button {int} times")
	public void i_ckick_on_plus_button_times(String word, Integer times) {
		ProductPage productPage = new ProductPage();

		for (int i = 0; i < times; i++) {
			if (word.equalsIgnoreCase("plus")) {
				productPage.plusButton.click();

			} else {
				productPage.minusButton.click();

			}
		}
		globalTimes = word.equalsIgnoreCase("plus") ? (++times) : times;
	}

	@Then("The quantity should be correct")
	public void the_quantity_should_be_correct() {
		ProductPage productPage = new ProductPage();
		String actual = productPage.quantityBox.getAttribute("value");

		Assert.assertEquals(globalTimes.toString(), actual);
	}

	@Then("I click on minus button {int} times")
	public void i_click_on_minus_button_times(Integer int1) {
	}

	@Given("the first step")
	public void the_first_step() {
		System.out.println("1");
	}

	@When("I do second step")
	public void i_do_second_step() {
		System.out.println("2");
	}

	@Then("I verify third step")
	public void i_verify_third_step() {
		System.out.println("3");
	}

	@When("I click on Dresses link")
	public void i_click_on_Dresses_link() {
		new HomePage().dressesLink.click();

	}

	@Then("The casual Dresses subcategory should be displayed")
	public void the_casual_Dresses_subcategory_should_be_displayed() {
		DressesPage dp = new DressesPage();
		Assert.assertTrue(dp.casualDresses.isDisplayed());

	}

	@Then("The following subcategories should be displayed")
	public void the_following_subcategories_should_be_displayed(List<String> subcategories) {

		dressPage = new DressesPage();
		for (String dress : subcategories) {
			Assert.assertTrue(dressPage.getSubcategory(dress).isDisplayed());
		}

	}

	@Then("The following colors should be displyed")
	public void the_following_colors_should_be_displyed(List<String> colors) {
		dressPage = new DressesPage();
		for (String string : colors) {
			Assert.assertTrue(dressPage.getColorElement(string).isDisplayed());

		}

	}

	@When("I click on {string}")
	public void i_click_on(String string) {
		HomePage homePage =new HomePage();
		homePage.getProduct(string).click();
	}

	@Then("The product page should also display {string}")
	public void the_product_page_should_also_display(String expectedName) {
		ProductPage productPage = new ProductPage();
		String actualName =productPage.productName.getText();
		Assert.assertEquals(expectedName, actualName);
		
		
	}

	@And("The product price should be {double}")
	public void the_product_price_should_be(Double expectPrice) {
		ProductPage productPage = new ProductPage();
		Double actualPrice =Double.parseDouble(productPage.price.getText().substring(1));
		Assert.assertEquals(expectPrice, actualPrice);
	}

}
