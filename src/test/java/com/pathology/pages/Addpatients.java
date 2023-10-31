package com.pathology.pages;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pathology.java.BasePage;

public class Addpatients extends BasePage{
	
	private WebDriver driver;
	
	public Addpatients(WebDriver driver){
		  this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[normalize-space()='Patients']")
	private WebElement patients;
	@FindBy(xpath = "(//span[normalize-space()='Add Patient'])[1]")
	private WebElement Addpatients;
	@FindBy(xpath = "//input[@name='name']")
	private WebElement name;
	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;
	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phone;
	@FindBy(xpath = "//input[@name='height']")
	private WebElement height;
	@FindBy(xpath = "//input[@name='weight']")
	private WebElement weight;
	@FindBy(xpath = "//div[@id='mui-component-select-gender']")
	private WebElement gender;
	@FindBy(xpath = "//li[normalize-space()='Male']")
	private WebElement Male;
	@FindBy(xpath = "//input[@name='age']")
	private WebElement age;
	@FindBy(xpath = "//input[@name='systolic']")
	private WebElement Systolic;
	@FindBy(xpath = "//input[@name='diastolic']")
	private WebElement diastolic ;
	@FindBy(xpath = "//input[@id='patient-test']")
	private WebElement patienttest;
	@FindBy(xpath = "//span[text()='Add Patient']")
	private WebElement Addpatient;
	@FindBy(xpath = "//span[@class='material-icons MuiIcon-root']")
	private WebElement EquimentAdd;
	@FindBy(xpath = "//div[@aria-label='Eqipment Name']")
	private WebElement Eqipmentname;
	@FindBy(xpath = "//span[contains(text(),'check')]")
	private WebElement check;
	@FindBy(xpath = "//input[@id='patient-tests-labs']")
	private WebElement patienttestlabs ;
	@FindBy(xpath = "//div[normalize-space()='Name']")
	private WebElement Name;
	@FindBy(xpath = "//div[text()='T']")
	private WebElement Profile;
	@FindBy(xpath = "//span[normalize-space()='Sign out of Lab']")
	private WebElement signoutlab;
	@FindBy(xpath = "//li[@role='option']")
	private WebElement testvallue;
	@FindBy(xpath = "(//button[@type='button'])[4]")
	private WebElement generatedetails;
	@FindBy(xpath = "(//span[text()=\"Add Tests\"])[2]")
	private WebElement Addtests;
	@FindBy(xpath = "//div[@aria-label=\"Eqipment Name\"]")
	private WebElement Equipname;
	@FindBy(xpath = "//span[@class=\"MuiButton-endIcon MuiButton-iconSizeMedium\"]")
	private WebElement arrow;
	
	public void Patientsdetails() throws InterruptedException {
		clickwebElement(patients);
		clickwebElement(Addpatients);
		sendkey(name, "Test1");
		sendkey(email, "test@gmail.com");
		sendkey(phone, "9876789876");
//		for(int i =0;i<=4;i++) {
//			try{
				clickwebElement(arrow);
//				break;
//			}catch (ElementClickInterceptedException e) {	
//				System.out.println("Catch");
//			}}
//		elementvisible(height);
//		elementvisible(weight);
//		elementvisible(gender);
//		elementvisible(Male);
//		elementvisible(Systolic);
//		elementvisible(diastolic);
//		sendkey(height, "187");
//		sendkey(weight, "65");
//		clickwebElement(gender);
//		clickwebElement(Male);
//		sendkey(age, "25");
//		sendkey(Systolic, "134");
//		sendkey(diastolic, "99");

//		for(int i =0;i<=4;i++) {
//		try{
			clickwebElement(arrow);
//			break;
//		}catch (ElementClickInterceptedException e) {	
//			System.out.println("Catch");
//		}
//		}
	}
	
	public void Equipment() {
		try {
			Thread.sleep(3000l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		clickwebElement(EquimentAdd);
		clickwebElement(Equipname);
		clickwebElement(testvallue);
		clickwebElement(check);
		
	}
	public void clickaddpatient() {
		
		patienttestlabs.sendKeys("Test" + Keys.ARROW_DOWN + Keys.ENTER);
		
	
		
	}
	public void Addpatient() {
		clickwebElement(Addpatient);
		
		elementvisible(Name);
	}
	public void logout() {
		clickwebElement(Profile);
		elementvisible(signoutlab);
		clickwebElement(signoutlab);
	}
}
