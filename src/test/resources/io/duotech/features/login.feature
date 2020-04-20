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

  Scenario: Verify positive login usin DataTable
    And I enter the following credentinals, I should be able to login
      | duotech@gmail.com  | dt123      |
      | dt2020@gmail.com   | dt123      |
      | akmaldt@gmail.com  | dt123      |
      | duotech1@gmail.com | duotech1   |
      | duotech2@gmail.com | duotech22  |
      | duotech3@gmail.com | duotech333 |


  Scenario: Verify user registration
    And I enter valid email and click Create Account
    And I should be able to pass the following data and see the name
      | First Name | Last Name | Address         | Password | City   | Zip   | Phone    |
      | James      | Bond      | 65 New Yourk st | bond007  | London | 10009 |   123456 |
      | Mona       | Lisa      | 505 Q Street NW | Lisa1892 | Paris  | 10005 | 94802802 |
