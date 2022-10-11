@SmokeTest
Feature: user could use login functionality to use their accounts

  Scenario: user could login with valid email and password

    Given User GO TO loginPage
    When  user enter login "valid" "mahmoudshehata@gmail.com" and "Mshe@123456"
    And   user press login button
    Then  user login to the system successfully

    # When  user enter  valid Email
    # And   user enter valid password

  Scenario: user could login with invalid email and password
    Given User GO TO loginPage
    And   user enter login "invalid" "mahmoud@mo.com" and "P@ss"
    And   user press login button
    Then  user could not login

