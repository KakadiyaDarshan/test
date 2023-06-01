package com.spotify.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spotify.base.TestBase;

public class YourLibraryPage extends TestBase{
	
	@FindBy (className = "rovbQsmAS_mwvpKHaVhQ")
	@CacheLookup
	public WebElement tabBar;
	
	@FindBy (xpath = "//span[contains(text(),'Create playlist')]")
	@CacheLookup
	public WebElement creatListButton;
	
	@FindBy (xpath = "//h1[contains(text(),'Create your first playlist')]")
	@CacheLookup
	public WebElement text;
	
	public YourLibraryPage() {
		PageFactory.initElements(driver, this);
		}
	
	public boolean iscreatListButtonPresent() {
		//return creatListButton.isDisplayed();
		return driver.findElement(By.xpath("//span[contains(text(),'Create playlist')]")).isDisplayed();
		}
	
	public boolean istextPresent() {
		//return text.isDisplayed();
		return driver.findElement(By.xpath("//h1[contains(text(),'Create your first playlist')]")).isDisplayed();
		}
	
	public boolean islibrarytabBarPresent() {
		//return tabBar.isDisplayed();
		return driver.findElement(By.className("rovbQsmAS_mwvpKHaVhQ")).isDisplayed();
		}

}
