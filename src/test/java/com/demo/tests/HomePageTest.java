package com.demo.tests;

import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demo.pages.HomePage;
import com.demo.runner.TestRunner;

public class HomePageTest extends TestRunner {

	public static HomePage home;

	@BeforeClass
	public void setUp() throws IOException {
		home = new HomePage();
	}

	@Test(priority = 1, description = "Verify TopLevel Menu.")
	public void TC001_verifyTopLevelMenu() throws IOException, InterruptedException {
		
		home.verifyHomePageTitle(driver);
		home.ourStory(driver);
		home.ourSolution(driver);
		home.whyTendable(driver);
	}
	
	@Test(priority = 2, description = "Verify Request a Demo Menu.")
	public void TC002_verifyRequestDemoMenu() throws IOException, InterruptedException {
		
		home.requestDemoButtonVerify(driver);
		home.contactUsButtonVerify(driver);
		home.signInButtonVerify(driver);
	}
	
	@Test(priority = 3, description = "Navigating contact-us and submit form.")
	public void TC003_navigateContactUs() throws IOException, InterruptedException {
		
		home.contactUs(driver);
		
	}
}
