Feature: Spotify Search Page Elements and Functionality Test

 Scenario: Validate Spotify Home Page
    Given User is on login page
    Then Log into Spotify Account with Valid Username and Password
    Then Click on Search Page Tab
    Then check for BrosweAll button
    Then check for Search Bar
    Then Enter "lana del ray" in serach bar and check for tab bar
    And user quit
