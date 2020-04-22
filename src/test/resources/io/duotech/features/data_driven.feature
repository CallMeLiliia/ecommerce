Feature: Verify products

  Scenario: Verify product name
    Given I am on the homepage
    When I click on "Blouse"
    Then The product page should also display "Blouse"
    And The product price should be 27.00

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



  Scenario Outline: Verify multiple user registration
    Given I am on the homepage
    When I click on Sing
    And I enter valid email "<email>" and click Create Account     
    And I should be able to pass the following data and see the name
      | First Name   | Last Name   | Address   | Password | City   | Zip   | Phone   |
      | <first name> | <last name> | <address> | dt12345  | <city> | <zip> | <phone> |

    Examples: 
      | email                         | first name | last name  | address               | city              | zip   | phone        |
      | rdugget88@redcross.org       | Ruddy      | Dugget     | 35288 Mitchell Street | Tariport          | 33447 | 202-098-3948 |
      | gdaniele1301@google.com.au     | Gwendolen  | Daniele    | 2949 Novick Avenue    | Lake Jessie       | 41651 | 987-455-3456 |
      | dmanicom1b20@timesonline.co.uk | Ddene      | Manicomb   | 5321 Browning Parkway | North Cameronland | 31968 | 098-432-4567 |
      | lcoulst1on30@shinystat.com     | Lynett     | Coulston   | 642 West Street       | East Kirsten      | 10830 | 950-345-6789 |
      | hpadde1more04@cbsnews.com      | Had        | Paddemore  | 568 Fair Oaks Avenue  | Chimouth          | 35994 | 123-654-3546 |
      | dklos1sek50@zimbio.com         | Dionysus   | Klossek    | 60 Harbort Way        | East Darrickfort  | 46836 | 365-345-6789 |
      | imillet1t60@de.vu              | Ingrim     | Millett    | 7545 Birchwood Center | Benbury           | 89089 | 254-434-6565 |
      | bdorki1n70@jalbum.net          | Boycie     | Dorkin     | 17722 Sommers Pass    | Gaylordshire      | 56415 | 345-909-9999 |
      | chargi1tt80@wordpress.org      | Chico      | Hargitt    | 56749 Bay Lane        | North Royce       | 42098 | 345-111-2222 |
      | mspear1ett90@bbb.org           | Michale    | Spearett   | 182 Myrtle Lane       | South Bongbury    | 23575 | 233-123-4747 |
      | hkindle1side0a@e-recht24.de    | Hashim     | Kindleside | 3 Dayton Alley        | South Dustin      | 75287 | 567-282-6543 |
      | rrapine1ttb0@123-reg.co.uk     | Ralina     | Rapinett   | 8578 Cody Crossing    | Bayerland         | 04527 | 365-336-4567 |
      | hjerzy1kc0@fema.gov            | Hew        | Jerzyk     | 93 Pepper Wood Park   | West Monty        | 36804 | 456-846-5678 |
      | kricke1ll0d@earthlink.net      | Krissie    | Rickell    | 35724 Anthes Plaza    | East Keeleyside   | 27197 | 542-333-7777 |
      | jocosgra1e0@altervista.org     | Jilleen    | O'Cosgra   | 56 Mayer Park         | Mohrside          | 82727 | 111-222-3456 |
