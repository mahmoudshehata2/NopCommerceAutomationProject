@SmokeTest
Feature: F08_AddToWishlist | user could add products to wishlist

  Scenario: user adds product to wishlist
    When user clicks on wishlist button on product
    Then success message is visible


  Scenario: number of wishlist items in home page is increased
    When user clicks on wishlist button on product
    Then success message is visible
    And user get the number of wishlist items after adding product to wishlist
    Then number of wishlist items is increased successfully

