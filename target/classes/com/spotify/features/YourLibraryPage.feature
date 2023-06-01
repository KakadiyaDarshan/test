Feature: Spotify Your Library Page Elements and Functionality Test

 Scenario: Validate Spotify Home Page
    Given User is on login page
    Then Log into Spotify Account with Valid Username and Password
    Then Click on Your Library Page Tab
    Then check for Create List button
    Then check for Library Tab Bar
    Then check for LibraryPage Info Text
    And user quit