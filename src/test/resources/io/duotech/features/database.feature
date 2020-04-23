Feature:

  Scenario: Verify the plus and minus buttons
    Given I am on the homepage
    When I click on Blouse
    Then I land on product page
    And I ckick on plus button 5 times
    Then The quantity should be correct
    And I ckick on minus button 3 times
    Then The quantity should be correct
