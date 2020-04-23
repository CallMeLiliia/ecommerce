Feature: Product description verification

  Scenario: Verify product name
    Given I am on the homepage
    When I click on Blouse
    Then The product page should also display Blouse

  Scenario: Verify default product quantity
    Given I am on the homepage
    When I click on Blouse
    Then I land on product page
    And The default quantity for the product should be 1
    
    
      Scenario: Verify product name
    Given I am on the homepage
    When I click on "Blouse"
    Then The product page should also display "Blouse"
    And The product price should be 27.00

  @plusminus
  Scenario: Verify the plus and minus buttons
    Given I am on the homepage
    When I click on Blouse
    Then I land on product page
    And I ckick on plus button 5 times
    Then The quantity should be correct
    And I ckick on minus button 3 times
    Then The quantity should be correct

  Scenario: Verify the hooks
    Given the first step
    When I do second step
    Then I verify third step

  Scenario: Verify Dress page subcategories
    Given I am on the homepage
    When I click on Dresses link
    Then The casual Dresses subcategory should be displayed

  Scenario: Verify Dress page subcategories
    Given I am on the homepage
    When I click on Dresses link
    Then The following subcategories should be displayed
      | Casual Dresses  |
      | Evening Dresses |
      | Summer Dresses  |


  Scenario: Verify Dress page colors
    Given I am on the homepage
    When I click on Dresses link
    Then The following colors should be displyed
      | Beige  |
      | Black  |
      | Green  |
      | Pink   |
      | Orange |
      | Yellow |
      | White  |
