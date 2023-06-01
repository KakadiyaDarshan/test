Feature: Spotify Login Page Elements and Functionality Test

 Scenario: Validate Spotify Login page
    Given User is on login page
    Then verify title of login page is Login - Spotify
    Then check for spotify logo
    Then check for userid field
    Then check for password field
    Then check for signup button
    And user quit

 Scenario: Varify Spotify Login functionality with no Username and no Password
    Given User is on login page
    Then user clicks on LoginButton
    And login fail with correct error message shown
    And user quit
    
 Scenario: Varify Spotify Login functionality with a Invalid Username and no password
    Given User is on login page
    Then user enters a Invalid Username
    And user clicks on LoginButton
    And login fail with correct error message shown
    And user quit
    
 Scenario: Varify Spotify Login functionality with a Unregistered emailID and no password
    Given User is on login page
    Then user enters a Unregistered emailID
    And user clicks on LoginButton
    And login fail with correct error message shown
    And user quit
    
Scenario: Varify Spotify Login functionality with Incorrect Password only
    Given User is on login page
    Then user enters a Incorrect Password
    And user clicks on LoginButton
    And login fail with correct error message shown
    And user quit
    
Scenario: Varify Spotify Login functionality with a Valid Username and no password
    Given User is on login page
    Then user enters a Valid Username
    And user clicks on LoginButton
    And login fail with correct error message shown
    And user quit
    
Scenario: Varify Spotify Login functionality with a Registered emailID and no password
    Given User is on login page
    Then user enters a Registered emailID
    And user clicks on LoginButton
    And login fail with correct error message shown
    And user quit
    
Scenario: Varify Spotify Login functionality with a Valid Username and Incorrect password
    Given User is on login page
    Then user enters a Valid Username and Incorrect password
    And user clicks on LoginButton
    And login fail with correct error message shown
    And user quit
    
Scenario: Varify Spotify Login functionality with a Registered emailID and Incorrect password
    Given User is on login page
    Then user enters a Registered emailID and Incorrect password
    And user clicks on LoginButton
    And login fail with correct error message shown
    And user quit
    
 Scenario: Varify Spotify Login functionality with a Valid Username and correct password
    Given User is on login page
    And user enters a valid username and password
    And user clicks on LoginButton
    And verify if user is on home page
    And user logout
    And user quit
    
 Scenario: Varify Spotify Login functionality with a Valid emailID and correct password
    Given User is on login page
    And user enters a valid emailID and password
    And user clicks on LoginButton
    And verify if user is on home page
    And user logout
    And user quit
    