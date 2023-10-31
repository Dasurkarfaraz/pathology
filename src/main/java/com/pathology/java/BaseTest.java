package com.pathology.java;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	public static WebDriver driver;
	@BeforeSuite
	public void init() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void BCinint() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://gor-pathology.web.app/");
	}
	
	
	@AfterSuite
	public void end() {
		driver.close();
	}

}
