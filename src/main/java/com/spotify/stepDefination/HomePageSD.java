package com.spotify.stepDefination;

import org.junit.Assert;

import com.spotify.base.TestBase;
import com.spotify.pages.HomePage;
import com.spotify.pages.LoginPage;

import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;



public class HomePageSD extends TestBase{
	
	LoginPage lp = new LoginPage();
	HomePage hmpg = new HomePage();

	@Then("^Log into Spotify Account with Valid Username and Password$")
	public void log_into_Spotify_Accont_with_Valid_Username_and_Password() throws Throwable {
		lp.userNameLogin();
	    }
	
	@Then("^Click on Home Page Tab$")
	public void Click_on_Home_Page_Tab() throws Throwable {
		openHomepage();
	    }

	@Then("^check for Home Page Title$")
	public void check_for_Home_Page_Title() throws Throwable {
		Assert.assertTrue("Title is not present", hmpg.isUserTitlePresent());
	    }

	@Then("^check for PlanButton$")
	public void check_for_PlanButton() throws Throwable {
		Assert.assertTrue("Premium Plan button is not present", hmpg.isPlanButtonPresent());
	    }

	@Then("^check for Spotify Logo$")
	public void check_for_Spotify_Logo() throws Throwable {
		Assert.assertTrue("Spotify logo is not present", hmpg.isLogoPresent());
	    }


}
