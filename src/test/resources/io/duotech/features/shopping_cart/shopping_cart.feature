Feature: Verify shopping cart

 
 @cart
  Scenario: Verify shopping cart details
    Given I am on the homepage
    When I click on "Feaded Short Sleeve T-shirts"
    And I increase the quantity to 5 and add them to cart
    Then The shopping cart details have to be as following
      | DescriptionUnit price       | Unit price | Quantity | Product Total | Total After fees |
      | Faded Short Sleeve T-shirts | $16.51     |        5 | $82.55        | $84.55           |
