Feature: Spotify Liked Songs Page Elements and Functionality Test

 Scenario: Validate Spotify Home Page
    Given User is on login page
    Then Log into Spotify Account with Valid Username and Password
    Then Click on Liked Songs Page Tab
    Then check for Find Songs button
    Then check for Heart Logo
    Then check for likedsongs page info text
    And user quit
