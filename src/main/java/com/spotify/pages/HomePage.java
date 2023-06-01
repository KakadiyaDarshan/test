package com.spotify.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spotify.base.TestBase;
import com.spotify.data.DataFetch;



public class HomePage extends TestBase{
	
	DataFetch df = new DataFetch();
	
	@FindBy (css = "span[data-testid=user-widget-name]")
	public WebElement userTitle;
	
	@FindBy (className ="NyIynkmMpZXSoaE3XGhA")
	public WebElement logo;
	
	@FindBy (className = "RSg3qFREWrqWCuUvDpJR")
	public WebElement NavMenu;
	
	@FindBy (css = "button[data-testid=user-widget-link]")
	public WebElement userMenu;
	
	@FindBy (xpath = "//span[contains(text(),'Log out')]")
	public WebElement logoutbutton;
	
	@FindBy (css = "button[title='Upgrade to Premium']")
	public WebElement planButton;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		}
	
	public void backbutton() {
		driver.navigate().back();
		}
	
	public boolean isUserTitlePresent() {
		//return userTitle.getText().equals(df.usertitle);
		return driver.findElement(By.cssSelector("span[data-testid='user-widget-name']")).getText().equals(df.usertitle);	
		}
	
	public boolean isPlanButtonPresent() {
		//return planButton.isDisplayed();
		return driver.findElement(By.cssSelector("button[title='Upgrade to Premium']")).isDisplayed();
		}
	
	public boolean isLogoPresent() {
		//return logo.isDisplayed();		
		return driver.findElement(By.className("NyIynkmMpZXSoaE3XGhA")).isDisplayed();
		}
	
	public boolean isNavMenuPresent() {
		//return NavMenu.isDisplayed();
		return driver.findElement(By.className("RSg3qFREWrqWCuUvDpJR")).isDisplayed();
		}
	
	public boolean verifylogin() {
		return isLogoPresent()|isNavMenuPresent()|isUserTitlePresent();
		}
	
	public void logout() throws InterruptedException {
		//userMenu.click();
		//logoutbutton.click();
		driver.findElement(By.cssSelector("figure[title='jackspot']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Log out')]")).click();
		Thread.sleep(2000);
		}

}
