@SmokeTest
Feature: F03_currencies user could switch between different currencies

  Scenario: user could move between currencies
    Given user select random currency user select euro
    Then  currency is changed correctly euro currency is changed
