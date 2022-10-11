@SmokeTest
Feature: F01_Registration | user could register with new accounts

  Scenario:  user could register with valid data successfully

    Given user go to register page
     When user select gender type
     And  user enter "Mahmoud" and "Shehata"
     And  user enter date of birth
     And  user enter email "mahmoudshehata@gmail.com"
     And  user enter Password "Mshe@123456" and "Mshe@123456"
     And  user click on register button
     Then user register successfully

    #And  user enter first name and last name
  #And  user enter email field
  # And  user enter  Password  and confirmation Pass fields