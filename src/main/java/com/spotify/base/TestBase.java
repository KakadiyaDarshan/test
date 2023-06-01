package com.spotify.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.spotify.util.WebEventListener;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver event_driver;
	public static WebEventListener eventListener;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:/QA/Selenium_workspace/SpotifyWebCucumber/src/main/java/com/spotify/data/config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void openBrowser() throws InterruptedException {
		String browsername = prop.getProperty("browser");
		if(browsername.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		//configure listeners
		/*
		 * event_driver = new EventFiringWebDriver(driver); eventListener = new
		 * WebEventListener(); event_driver.register(eventListener); driver =
		 * event_driver;
		 */
				
				//driver load time set-up
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	//open browser

	/*public void openBrowser() {
		//set browser properties
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		//wait 2 seconds every time "findelement" is used
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		
	}*/
	
	//enter URL for spotify login page and uncheck Remember Me checkbox
	public void openLoginPage() {
		driver.get("https://accounts.spotify.com/en/login?continue=https%3A%2F%2Fopen.spotify.com%2F");
		driver.findElement(By.cssSelector("div[data-encore-id='formCheckbox']")).click();
	}
	
	//click on home page tab
	public void openHomepage() {
		driver.findElement(By.xpath("//span[text()='Home']")).click();
	}
	
	//click on search page tab
	public void openSearchpage() {
		driver.findElement(By.xpath("//span[text()='Search']")).click();
	}
	
	//click on library tab
	public void openYourLibrarypage() {
		driver.findElement(By.xpath("//span[text()='Your Library']")).click();
	}
	
	//click on liked songs tab
	public void openLikedSongspage() {
		driver.findElement(By.xpath("//span[text()='Liked Songs']")).click();
	}
	
	//close the browser
	public void closeBrowser() {
		driver.quit();
	}

}
