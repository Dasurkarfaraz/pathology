package com.pathology.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pathology.java.BasePage;

public class Homepage extends BasePage{
	private static WebDriver driver;
	
	public Homepage(WebDriver driver){
		  this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[@title=\"Open\"]")
	private WebElement patient;
	@FindBy(id="patient-test")
	private WebElement patend;
	@FindBy(xpath = "//div[text()='TODO']")
	private WebElement TODO;
	
	public void TODOVisible() {
		elementvisible(TODO);
	}
	public void Scrolldown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	public void Homepagetest() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		clickwebElement(patient);
		patend.sendKeys("VITAMIN" + Keys.ARROW_DOWN + Keys.ENTER);
		patend.sendKeys("Beans" + Keys.ARROW_DOWN + Keys.ENTER);
		patend.sendKeys("CULTURE  URINE (DD)" + Keys.ARROW_DOWN + Keys.ENTER);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
	}

}
