package io.duotech.step_definition;

import java.util.List;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.duotech.beans.ShoppingCart;
import io.duotech.pages.ProductPage;
import io.duotech.pages.ShoppingCartSummaryPage;

public class ShoppingCatrStepDef {

	
	

@When("I increase the quantity to {int} and add them to cart")
public void i_increase_the_quantity_to_and_add_them_to_cart(Integer int1) {
	ProductPage productPage = new ProductPage();
	
	for (int i = 0; i < int1-1; i++) {
		
	
	productPage.plusButton.click();
	}
	
	productPage.addToCart.click();
	productPage.proceed.click();
}

@Then("The shopping cart details have to be as following")
public void the_shopping_cart_details_have_to_be_as_following(List<ShoppingCart> carts) {
ShoppingCartSummaryPage shoppingCartSummaryPage = new ShoppingCartSummaryPage();

}
	
	
}
