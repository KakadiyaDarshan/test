package com.spotify.stepDefination;

import org.junit.Assert;

import com.spotify.base.TestBase;
import com.spotify.pages.LikedSongsPage;

import cucumber.api.java.en.Then;

public class LikedSongsPageSD extends TestBase{
	
	LikedSongsPage lsp = new LikedSongsPage();
	
	@Then("^Click on Liked Songs Page Tab$")
	public void click_on_Liked_Songs_Page_Tab() throws Throwable {
		openLikedSongspage();
	    }

	@Then("^check for Find Songs button$")
	public void check_for_Find_Songs_button() throws Throwable {
		Assert.assertTrue("find songs botton is not present", lsp.isfindsongsbottonPresent());
	   }

	@Then("^check for Heart Logo$")
	public void check_for_Heart_Logo() throws Throwable {
		Assert.assertTrue("heart logo is not present", lsp.isheartlogoPresent());
	    }

	@Then("^check for likedsongs page info text$")
	public void check_for_likedsongs_page_info_text() throws Throwable {
		 Assert.assertTrue("liked songs page info text is not present",lsp.islikedsongstextPresent());
	    }

}
