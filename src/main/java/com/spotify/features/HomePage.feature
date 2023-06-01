Feature: Spotify Home Page Elements and Functionality Test

 Scenario: Validate Spotify Home Page
    Given User is on login page
    Then Log into Spotify Account with Valid Username and Password
    Then Click on Home Page Tab
    Then check for Home Page Title
    Then check for PlanButton
    Then check for Spotify Logo
    And user quit
