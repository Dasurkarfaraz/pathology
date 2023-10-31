package com.pathology.java;

import java.time.Duration;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends BaseTest{
	public 	WebDriverWait wait;
	public void clickwebElement(WebElement element) {
		wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element)).isEnabled();
		for(int i =0;i<=4;i++) {
		try {
			element.click();
			break;
		} catch (ElementClickInterceptedException e) {}
		}
	}
	public void Scrollandclick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}
	public void sendkey(WebElement element, String txt) {
		wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element)).isEnabled();
		element.sendKeys(txt);
	}
	
	public void sendkey(WebElement element, Keys txt) {
		wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element)).isEnabled();
		element.sendKeys(txt);
	}
	public void elementvisible(WebElement element) {
		for(int i =0;i<=4;i++) {
			try {
		wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
		break;
			}catch (StaleElementReferenceException e) {}
	}
}
}
