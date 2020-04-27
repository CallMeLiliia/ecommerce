Feature: Product info verification using datatables

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
