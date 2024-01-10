package com.demo.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.saucedemo.keywords.Keywords;

public class HomePage {

	Keywords locator = new Keywords();

	public void ourStory(WebDriver driver) throws IOException, InterruptedException {

		locator.click(driver, "ourStory_XPATH");
	}

	public void ourSolution(WebDriver driver) throws IOException, InterruptedException {

		locator.click(driver, "ourSolution_XPATH");
	}

	public void whyTendable(WebDriver driver) throws IOException, InterruptedException {

		locator.click(driver, "whyTendable_XPATH");
	}

	public void contactUs(WebDriver driver) throws IOException, InterruptedException {

		locator.click(driver, "contactUs_XPATH");
	}

	public void requestDemo(WebDriver driver) throws IOException, InterruptedException {

		locator.click(driver, "requestDemo_XPATH");
	}

	public void verifyHomePageTitle(WebDriver driver) {

		String expectedTitle = "Quality Improvement App | Health and Social Care | Tendable";
		String actualTitle = driver.getTitle();
		locator.assertEquals(actualTitle, expectedTitle);
		System.out.println("Launch Home page");

		// Assert.assertEquals(actualTitle, expectedTitle);
	}

	public void requestDemoButtonVerify(WebDriver driver) throws IOException, InterruptedException {

		boolean requestButton = driver.findElement(By.xpath("(//a[contains(text(),'Request a Demo')])[1]")).isEnabled();
		System.out.println("Request a Demo button is present: " + requestButton);

	}

	public void contactUsButtonVerify(WebDriver driver) throws IOException, InterruptedException {

		boolean contactUsButton = driver.findElement(By.xpath("(//a[contains(text(),'Contact Us')])[1]")).isEnabled();
		System.out.println("Request a Demo button is present: " + contactUsButton);
	}

	public void signInButtonVerify(WebDriver driver) throws IOException, InterruptedException {

		boolean signInButton = driver.findElement(By.xpath("(//a[contains(text(),'Sign In')])[1]")).isEnabled();
		System.out.println("Request a Demo button is present: " + signInButton);
	}
}
