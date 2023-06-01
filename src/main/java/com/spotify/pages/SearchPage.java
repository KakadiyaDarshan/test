package com.spotify.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spotify.base.TestBase;

public class SearchPage extends TestBase{
	
	@FindBy (xpath="//input[@data-testid='search-input']")
	@CacheLookup
	public WebElement searchBar;
	
	@FindBy (xpath = "//h2[contains(text(),'Browse all')]")
	@CacheLookup
	public WebElement browseAllButton;
	
	@FindBy (className = "KjPUGV8uMbl_0bvk9ePv")
	@CacheLookup
	public WebElement tabBar;
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
		}
	
	public boolean issearchBarPresent() {
		//return searchBar.isDisplayed();
		return driver.findElement(By.xpath("//input[@data-testid='search-input']")).isDisplayed();
		}
	
	public boolean isbrowseallButtonPresent() {
		//return browseAllButton.isDisplayed();
		return driver.findElement(By.xpath("//h2[contains(text(),'Browse all')]")).isDisplayed();
		}
	
	public boolean istabBarPresent(String name) {
		//searchBar.sendKeys(name);
		//return tabBar.isDisplayed();
		driver.findElement(By.xpath("//input[@data-testid='search-input']")).sendKeys(name);
		return driver.findElement(By.className("KjPUGV8uMbl_0bvk9ePv")).isDisplayed();
		}

}
