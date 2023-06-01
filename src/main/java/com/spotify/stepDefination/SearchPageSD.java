package com.spotify.stepDefination;



import org.junit.Assert;

import com.spotify.base.TestBase;
import com.spotify.pages.SearchPage;

import cucumber.api.java.en.Then;

public class SearchPageSD extends TestBase {
	
	SearchPage sp = new SearchPage();
	
	@Then("^Click on Search Page Tab$")
	public void click_on_Search_Page_Tab() throws Throwable {
		openSearchpage();
	    }

	@Then("^check for BrosweAll button$")
	public void check_for_BrosweAll_button() throws Throwable {
		 Assert.assertTrue("Browse All text is not present", sp.isbrowseallButtonPresent());
	    }

	@Then("^check for Search Bar$")
	public void check_for_Search_Bar() throws Throwable {
		Assert.assertTrue("search Bar is not present", sp.issearchBarPresent());
	    }

	@Then("^Enter \"([^\"]*)\" in serach bar and check for tab bar$")
	public void enter_in_serach_bar_and_check_for_tab_bar(String name) throws Throwable {
		Assert.assertTrue("Category Tab Bar is not present when searching for songs", sp.istabBarPresent(name));
	    }

}
