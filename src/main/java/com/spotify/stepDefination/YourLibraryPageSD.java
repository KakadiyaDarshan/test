package com.spotify.stepDefination;



import org.junit.Assert;

import com.spotify.base.TestBase;
import com.spotify.pages.YourLibraryPage;

import cucumber.api.java.en.Then;

public class YourLibraryPageSD extends TestBase {
	
	YourLibraryPage ylp = new YourLibraryPage();
	
	@Then("^Click on Your Library Page Tab$")
	public void click_on_Your_Library_Page_Tab() throws Throwable {
		openYourLibrarypage();
	    }

	@Then("^check for Create List button$")
	public void check_for_Create_List_button() throws Throwable {
		Assert.assertTrue("Creat List Button is not present", ylp.iscreatListButtonPresent());
	    }

	@Then("^check for Library Tab Bar$")
	public void check_for_Library_Tab_Bar() throws Throwable {
		Assert.assertTrue("Library TabBar is not Present", ylp.islibrarytabBarPresent());
	    }

	@Then("^check for LibraryPage Info Text$")
	public void check_for_LibraryPage_Info_Text() throws Throwable {
		Assert.assertTrue("'Creat Your First Playlist' text not present", ylp.istextPresent());
	    }

}
