package io.duotech.step_definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.duotech.pages.HomePage;
import io.duotech.pages.ProductPage;
import io.pages.utilities.Driver;
import io.pages.utilities.ExcelUtils;

public class PromotedProductsStepDef {
	
	
	
	

@Then("The promoted products should be displayed")
public void the_promoted_products_should_be_displayed() {
	//Get the promoted products from excel file
	//Verify if the are displayed
	
	HomePage homePage = new HomePage();
	ExcelUtils sheet = new ExcelUtils("src/test/resources/io/duotech/test-data/1.xlsx", "Sheet1");
	
	List<Map<String, String>> allRows = sheet.getDataAsList();
	for (int i = 0; i < allRows.size(); i++) {
		Map<String, String> row = allRows.get(i);
		
	}
	
}

@Then("The details of the product should be correct")
public void the_details_of_the_product_should_be_correct() {
	HomePage homePage = new HomePage();
	ProductPage productPage = new ProductPage();
	ExcelUtils sheet = new ExcelUtils("src/test/resources/io/duotech/test-data/1.xlsx", "Sheet1");
	
	List<Map<String, String>> allRows = sheet.getDataAsList();
	for (int i = 0; i < allRows.size(); i++) {
		Map<String, String> row = allRows.get(i);
		if(row.get("Execute").equalsIgnoreCase("Y")) {
			String expectedProduct = row.get("Product");
			homePage.getProduct(expectedProduct).click();
			String expectedPrice = row.get("Price");
			String expectedModel = row.get("Model");
			String expectedComposition = row.get("Composition");
			String expectedStyle = row.get("Styles");
			
			String actualPrice = productPage.price.getText();
			String actualModel = productPage.model.getText();
			String actualComposition = productPage.composition.getText();
			String actualStyle = productPage.style.getText();
			
			
			Assert.assertEquals(expectedPrice, actualPrice);
			Assert.assertEquals(expectedModel, actualModel);
			Assert.assertEquals(expectedComposition, actualComposition);
			Assert.assertEquals(expectedStyle, actualStyle );
			
			sheet.setCellData("passed", "Status", i+1);
			
			Driver.getDriver().navigate().back();
		}
		else {sheet.setCellData("skipped", "Status", i+1);
			
		}
	}
	
}


}
