@SmokeTest
Feature:  users could search for products using Product Name and Search sku

  Scenario Outline:  user could search using Product Name
    Given  user click on search item field
    When user search item with "<Product Name>"
    Then user could find  "<Product Name>" relative words


    Examples:
      | Product Name|
      |book|
      |laptop|
      |nike|



  Scenario Outline:  user could search for product using Search sku
    Given  user click on search item field
    And user search item with "<search sku>"
    Then user could find  "<search sku>" inside product page

    Examples:
      |search sku|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|


