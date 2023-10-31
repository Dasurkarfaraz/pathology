package com.pathology.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pathology.java.BasePage;

public class costCalculator extends BasePage{
	
private WebDriver driver;
	
	public costCalculator(WebDriver driver){
		  this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//em[text()='None']")
	private WebElement None;

	@FindBy(xpath = "//div[text()='TODO']")
	private WebElement TODO;
	@FindBy(xpath = "//div[text()=\"Total\"]/following-sibling::div[contains(text(),'₹')]")
	private WebElement totalvalue;
	
	public void costcalutlate() {
		clickwebElement(None);
		int percentage = 5;
		WebElement value5 = driver.findElement(By.xpath("//li[@data-value='"+percentage+"']"));
		
		clickwebElement(value5);
		WebElement Subtotal =  driver.findElement(By.xpath("//div[text()=\"Subtotal\"]/following-sibling::div[contains(text(),'₹')]"));
		String SubtotalPrice = Subtotal.getText().replace("₹", "").replace(" ", "");
		int w= Integer.valueOf(SubtotalPrice);
		List<WebElement> element=driver.findElements(By.xpath("//span[contains(text(),'₹')]"));
		int v = 0;
		for(WebElement elements:element) {
			String pateient = elements.getText();
			String[] finalPat = pateient.split("-");
			String price = finalPat[1].replace("₹", "").replace(" ", "");
			int Subtotalprice =Integer.valueOf(price);
			v = v +Subtotalprice;		
		}
		System.out.println(v);
		Assert.assertEquals(w, v);
		double originalValue = v;
  
        double amountToRemove = (percentage * originalValue) / 100;
      
        double result = originalValue - amountToRemove;
        System.out.println("Original Value: " + originalValue +"₹");
        System.out.println("5% Removed: " + amountToRemove +"₹");
        System.out.println("Result: " + result +"₹");
        double total =  Double.valueOf(totalvalue.getText().replace("₹", "").replace(" ", ""));
        Assert.assertEquals(total,result);
        
        
	}
}
