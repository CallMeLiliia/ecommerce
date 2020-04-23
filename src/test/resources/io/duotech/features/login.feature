@verifyElements
Feature: Login feature
  As a user I must be able to use log

  Background: 
    Given I am on the homepage
    When I click on Sing

  Scenario: Verify login page title
    As a user, I want to be able to login #Description of the scenario

    Then The login page title should be Login - My Store

  @smoke
  Scenario: Verify login page elements
    Then I should be able to see email, password box and login button

  @temporary
  Scenario: Verify positive login
    And I enter duotech@gmail.com as email, dt123 as password, and click login
    Then I should be able to land on welcome page and read welcome message

  Scenario: Verify positive login usin parametrization
    And I enter "duotech@gmail.com" as email, "dt123" as password, and click login
    Then I should be able to land on welcome page and read welcome message

  Scenario: Verify positive login usin parametrization
    And I enter "duotech@gmail.com" as email, "dt123" as password, and click login
    Then I should be able to land on welcome page and read welcome message

 