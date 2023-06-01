package com.spotify.testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/QA/Selenium_workspace/SpotifyWebCucumber/src/main/java/com/spotify/features/HomePage.feature"
		,glue = {"com.spotify.stepDefination"}
		,plugin = {"pretty"}
		,dryRun = false
		//,dryRun = true
		,monochrome = true
		)
public class HomePageRunner {

}
