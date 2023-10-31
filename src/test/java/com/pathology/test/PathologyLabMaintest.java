package com.pathology.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.pathology.java.BasePage;
import com.pathology.pages.Homepage;
import com.pathology.pages.Loginpage;
import com.pathology.pages.costCalculator;
import com.pathology.pages.Addpatients;

 public class PathologyLabMaintest extends BasePage {
		
		@Test(priority = 0)
		public void tes01login() {
			Loginpage Loginpage = new Loginpage(driver);
			Loginpage.Logininpathology();	
		}
		@Test(priority = 1)
		public void test02Homepage() throws Exception {
			Homepage Homepage = new Homepage(driver);
			Homepage.TODOVisible();
			Homepage.Scrolldown();
			Homepage.Homepagetest();
			
		}
		@Test(priority = 2)
		public void test03Calculator() throws Exception {
			
			costCalculator  costCalculator  = new costCalculator(driver);
			costCalculator.costcalutlate();
			
			
			
		}
		@Test(priority = 3)
		public void test04Patient() throws InterruptedException {
			Homepage Homepage = new Homepage(driver);
			Addpatients Addpatients = new Addpatients(driver);
			Addpatients.Patientsdetails();
			Homepage.Homepagetest();
			Homepage.Scrolldown();
			Addpatients.Equipment();
			Addpatients.clickaddpatient();
			Addpatients.Addpatient();
			Addpatients.logout();
			
		}
	

}
