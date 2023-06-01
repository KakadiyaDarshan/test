package com.spotify.pages; //SpotifyWebCucumber

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spotify.base.TestBase;
import com.spotify.data.DataFetch;

public class LoginPage extends TestBase{
	DataFetch df = new DataFetch();

	//Page Factory // Object Repository(OR)
	
	@FindBy(id = "login-username")
    public WebElement idSpace;
	
	@FindBy(id = "login-password")
    public WebElement passwordSpace;
	
	@FindBy(id = "login-button")
    public WebElement loginButton;
	
	@FindBy(id = "sign-up-link")
    public WebElement signupButton;
	
	@FindBy(xpath = "//div[@data-encore-id='banner']")
    public WebElement errMsg;
	
	@FindBy(xpath = "//div[@data-testid='spotify-logo']") 
	public WebElement logo;
	
	//Page Objects Initialization
	public LoginPage() {
		PageFactory.initElements(driver, this);
		}
	
	//Actions
	public void clearFields() {
//		idSpace.clear();
//		passwordSpace.clear();
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-password")).clear();
		}
	
	public void loginDetail(String userID, String password) {
//		idSpace.sendKeys(userID);
//		passwordSpace.sendKeys(password);		
		driver.findElement(By.id("login-username")).sendKeys(userID);
		driver.findElement(By.id("login-password")).sendKeys(password);
		}
	
	public void loginButtonClick() throws InterruptedException {
		//driver.findElement(By.xpath("//span[@class='Indicator-sc-1airx73-0 kHTWAk']")).click();;
		//loginButton.click();
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(5000);
		}
	
	public String readError() {
		//return errMsg.getText();
		return driver.findElement(By.xpath("//div[@data-encore-id='banner']")).getText();
		}
	
	public String getPageTitle() {
		return driver.getTitle();
		}
	
	public boolean isLogoPresent() {
		//return logo.isDisplayed();
		return driver.findElement(By.xpath("//div[@data-testid='spotify-logo']")).isDisplayed(); 
		}
	
	public boolean isIDfieldPresent() {
		//return idSpace.isDisplayed();	
		return driver.findElement(By.id("login-username")).isDisplayed();
		}
	
	public boolean isPasswordfieldPresent() {
		//return passwordSpace.isDisplayed();	
		return driver.findElement(By.id("login-password")).isDisplayed();
		}
	
	public boolean isSignupButtonPresent() {
		//return signupButton.isDisplayed();
		return driver.findElement(By.id("sign-up-link")).isDisplayed();
		}
	
	public void userNameLogin() throws InterruptedException {
		loginDetail(df.getvalidusername, df.getcorrectpassword);
		loginButtonClick();
		Thread.sleep(5000);
		}
	
	public void emailIDLogin() throws InterruptedException {
		loginDetail(df.getregistredemailid, df.getcorrectpassword);
		loginButtonClick();
		Thread.sleep(5000);
		}
}
