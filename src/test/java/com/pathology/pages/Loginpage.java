package com.pathology.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pathology.java.BasePage;

public class Loginpage extends BasePage{
	private WebDriver driver;
	
	public Loginpage(WebDriver driver){
		  this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement Login;
	
	@FindBy(xpath = "//u[text()='Recover or set password']")
	private WebElement recover;
	
	@FindBy(xpath = "//div[text()='Pathology & Diagnostic']")
	private WebElement Pathology;
	
	
	public void Logininpathology() {
		elementvisible(Pathology);
		elementvisible(Login);
		elementvisible(email);
		elementvisible(password);
		elementvisible(recover);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOf(Pathology)).isDisplayed();
//		wait.until(ExpectedConditions.visibilityOf(recover)).isDisplayed();
//		wait.until(ExpectedConditions.visibilityOf(Login)).isDisplayed();
//		wait.until(ExpectedConditions.visibilityOf(password)).isDisplayed();
//		wait.until(ExpectedConditions.visibilityOf(email)).isDisplayed();
		sendkey(email,"test@kennect.io");
		sendkey(password,"Qwerty@1234");
		clickwebElement(Login);
		
		
	}
}
