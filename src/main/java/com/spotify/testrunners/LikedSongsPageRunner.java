package com.spotify.testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/QA/Selenium_workspace/SpotifyWebCucumber/src/main/java/com/spotify/features/LikedSongsPage.feature"
		,glue = {"com.spotify.stepDefination"}
		,plugin = {"pretty", "html:test-output"}
		,dryRun = false
		//,dryRun = true
		,monochrome = true
		)

public class LikedSongsPageRunner {

}
