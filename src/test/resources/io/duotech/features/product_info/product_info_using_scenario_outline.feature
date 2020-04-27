Feature: Product description verification

  Scenario Outline: Verify product info using Scenario Outline
    Given I am on the homepage
    When I click on "<product name>"
    Then The product page should also display "<product name>"
    And The product price should be <price>

    Examples: 
      | product name                | price |
      | Faded Short Sleeve T-shirts | 16.51 |
      | Printed Dress               | 26.00 |
      | Blouse                      | 27.00 |
      | Printed Dress               | 50.99 |
      | Printed Summer Dress        | 28.98 |
