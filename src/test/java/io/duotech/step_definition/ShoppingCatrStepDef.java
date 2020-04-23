package io.duotech.step_definition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.duotech.pages.ProductPage;

public class ShoppingCatrStepDef {

	
	

@When("I increase the quantity to {int} and add them to cart")
public void i_increase_the_quantity_to_and_add_them_to_cart(Integer int1) {
	ProductPage productPage = new ProductPage();
	
	
	
}

@Then("The shopping cart details have to be as following")
public void the_shopping_cart_details_have_to_be_as_following(List<ShoppingCart> carts) {

}
	
	
}
