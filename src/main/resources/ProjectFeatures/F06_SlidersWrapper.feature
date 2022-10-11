@SmokeTest
Feature: F06_SlidersWrapper | users will be able to open sliders in home page

  Scenario: first slider is clickable on home page
    Given user clicks on first slider
    Then relative product for first slider is displayed

  Scenario: second slider is clickable on home page
    Given user clicks on second slider
    Then relative product for second slider is displayed
