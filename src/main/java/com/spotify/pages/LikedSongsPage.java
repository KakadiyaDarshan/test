package com.spotify.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spotify.base.TestBase;

public class LikedSongsPage extends TestBase{
	@FindBy (className ="Ws8Ec3GREpT5PAUesr9b")
	@CacheLookup
	public WebElement heartlogo;
	
	@FindBy (xpath ="//h1[contains(text(),'Liked Songs')]")
	@CacheLookup
	public WebElement likedsongstext;
	
	@FindBy (xpath ="//span[contains(text(),'Find songs')]")
	@CacheLookup
	public WebElement findsongsbotton;
	
	public LikedSongsPage() {
		PageFactory.initElements(driver, this);
		}
	
	public boolean isheartlogoPresent() {
		//return heartlogo.isDisplayed();
		return driver.findElement(By.className("Ws8Ec3GREpT5PAUesr9b")).isDisplayed();
		}
	
	public boolean islikedsongstextPresent() {
		//return likedsongstext.isDisplayed();
		return driver.findElement(By.xpath("//h1[contains(text(),'Liked Songs')]")).isDisplayed();
		}
	
	public boolean isfindsongsbottonPresent() {
		//return findsongsbotton.isDisplayed();
		return driver.findElement(By.xpath("//span[contains(text(),'Find songs')]")).isDisplayed();
		}

}
