package com.spotify.testrunners;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/QA/Selenium_workspace/SpotifyWebCucumber/src/main/java/com/spotify/features/LoginPage.feature"
		,glue = {"com.spotify.stepDefination"}
		,plugin = {"pretty", "html:test-output"}
		,dryRun = false
		,monochrome = true
		)
public class LoginPageRunner {

}
