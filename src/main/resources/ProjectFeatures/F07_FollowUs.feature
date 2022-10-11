@SmokeTest
Feature: F07_FollowUs    user could open followUs links in new tab

  Scenario: user could open facebook link successfully
    When    user opens facebook link
    Then    "https://www.facebook.com/nopCommerce" The link is opened in new tab

  Scenario: user could open twitter link successfully
    When    user opens twitter link
    Then    "https://twitter.com/nopCommerce" The link is opened in new tab

  Scenario: user could open rss link successfully
    When user opens rss link
    Then "https://demo.nopcommerce.com/new-online-store-is-open" The link is opened in new tab


  Scenario: user could open rss link successfully
    When user opens youtube link
    Then "https://www.youtube.com/user/nopCommerce" The link is opened in new tab