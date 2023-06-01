package com.spotify.stepDefination;


import org.junit.Assert;

import com.spotify.base.TestBase;
import com.spotify.data.DataFetch;
import com.spotify.pages.HomePage;
import com.spotify.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class LoginPageSD extends TestBase{
	LoginPage lp = new LoginPage();
	DataFetch df = new DataFetch();
	HomePage hmpg = new HomePage();
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws InterruptedException {
	   openBrowser();
	   openLoginPage();
	}

	@Then("^verify title of login page is Login - Spotify$")
	public void verify_title_of_login_page_is_Login_Spotify() {
	    Assert.assertEquals(lp.getPageTitle(), prop.getProperty("loginpagetitle"));
	}

	@Then("^check for spotify logo$")
	public void check_for_spotify_logo() {
		Assert.assertTrue(lp.isLogoPresent());
	}

	@Then("^check for userid field$")
	public void check_for_userid_field() {
		Assert.assertTrue(lp.isIDfieldPresent());
	}

	@Then("^check for password field$")
	public void check_for_password_field() {
		Assert.assertTrue(lp.isPasswordfieldPresent());
	}

	@Then("^check for signup button$")
	public void check_for_signup_button() {
		Assert.assertTrue(lp.isSignupButtonPresent());
	}

	@Then("^test pass$")
	public void test_pass() {
	    System.out.println("login page test passed");
	}

	@Then("^user quit$")
	public void user_quit() {
	    closeBrowser();
	}
	
	@Then("^user enters a valid username and password$")
	public void user_enters_a_valid_username_and_password() throws InterruptedException {
		lp.loginDetail(df.getvalidusername, df.getcorrectpassword);
		Thread.sleep(2000);
	    }

	@Then("^user clicks on LoginButton$")
	public void user_clicks_on_LoginButton() throws Throwable {
		lp.loginButtonClick();
	    }

	@Then("^verify if user is on home page$")
	public void verify_if_user_is_on_home_page() throws Throwable {
		Assert.assertTrue("Login with username failed", hmpg.verifylogin());
	    }

	@Then("^user logout$")
	public void user_logout() throws Throwable {
		hmpg.logout();
	    }

	@Then("^user enters a valid emailID and password$")
	public void user_enters_a_valid_emailID_and_password() throws Throwable {
		lp.loginDetail(df.getregistredemailid, df.getcorrectpassword);
	    }
	
	@Then("^login fail with correct error message shown$")
	public void login_fail_with_correct_error_message_shown() throws Throwable {
		System.out.println("error shown was - " + lp.readError());
		Assert.assertEquals(lp.readError(), df.expectedErr);
		}

	@Then("^user enters a Invalid Username$")
	public void user_enters_a_Invalid_Username() throws Throwable {
		lp.loginDetail(df.getinvaliduserid, "");
	    }

	@Then("^user enters a Unregistered emailID$")
	public void user_enters_a_Unregistered_emailID() throws Throwable {
		lp.loginDetail(df.getunregistredemailid, "");
	    }

	@Then("^user enters a Incorrect Password$")
	public void user_enters_a_Incorrect_Password() throws Throwable {
		lp.loginDetail("", df.getwrongpassword);
	    }

	@Then("^user enters a Valid Username$")
	public void user_enters_a_Valid_Username() throws Throwable {
		lp.loginDetail(df.getvalidusername, "");
	    }

	@Then("^user enters a Registered emailID$")
	public void user_enters_a_Registered_emailID() throws Throwable {
		lp.loginDetail(df.getregistredemailid, "");
	    }

	@Then("^user enters a Valid Username and Incorrect password$")
	public void user_enters_a_Valid_Username_and_Incorrect_password() throws Throwable {
		lp.loginDetail(df.getvalidusername, df.getwrongpassword);
	    }

	@Then("^user enters a Registered emailID and Incorrect password$")
	public void user_enters_a_Registered_emailID_and_Incorrect_password() throws Throwable {
		lp.loginDetail(df.getregistredemailid, df.getwrongpassword);
	    }

}
