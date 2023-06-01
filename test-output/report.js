$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/QA/Selenium_workspace/SpotifyWebCucumber/src/main/java/com/spotify/features/HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Spotify Home Page Elements and Functionality Test",
  "description": "",
  "id": "spotify-home-page-elements-and-functionality-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Spotify Home Page",
  "description": "",
  "id": "spotify-home-page-elements-and-functionality-test;validate-spotify-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Log into Spotify Account with Valid Username and Password",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Click on Home Page Tab",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "check for Home Page Title",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "check for PlanButton",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "check for Spotify Logo",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user quit",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSD.user_is_on_login_page()"
});
formatter.result({
  "duration": 7845977900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.log_into_Spotify_Accont_with_Valid_Username_and_Password()"
});
formatter.result({
  "duration": 10774930400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.Click_on_Home_Page_Tab()"
});
formatter.result({
  "duration": 620065800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.check_for_Home_Page_Title()"
});
formatter.result({
  "duration": 31633500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.check_for_PlanButton()"
});
formatter.result({
  "duration": 87421300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.check_for_Spotify_Logo()"
});
formatter.result({
  "duration": 37342100,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSD.user_quit()"
});
formatter.result({
  "duration": 2472588100,
  "status": "passed"
});
});