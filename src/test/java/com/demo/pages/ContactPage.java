package com.demo.pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.saucedemo.keywords.Keywords;

public class ContactPage {

	Keywords locator = new Keywords();

	public void enterFullName(WebDriver driver, String userName) throws IOException {

		locator.type(driver, "FullName_XPATH", userName);

	}

	public void enterOrgName(WebDriver driver, String OrgName) throws IOException {

		locator.type(driver, "OrgName_XPATH", OrgName);

	}

	public void enterPhoneNumber(WebDriver driver, String PhoneNumber) throws IOException {

		locator.type(driver, "OrgPhoneNumber_XPATH", PhoneNumber);

	}

	public void enterEmail(WebDriver driver, String enterEmail) throws IOException {

		locator.type(driver, "enterEmail_XPATH", enterEmail);

	}

	public void clickAgree(WebDriver driver) throws IOException {

		locator.click(driver, "Agree_XPATH");

	}

	public void clickSubmit(WebDriver driver) throws IOException {

		locator.click(driver, "Submit_XPATH");
	}

	public void verifyErrorMesage(WebDriver driver) {
		String expected_error = driver.findElement(By.xpath("//form[@id='contactMarketingPipedrive-163701']/div/p"))
				.getText();
		String actual_error = "Sorry, there was an error submitting the form. Please try again.";
		Assert.assertEquals(actual_error, expected_error);
		System.out.println("Verify the Error message");

		// Assert.assertEquals(actualTitle, expectedTitle);
	}

	public void selectDropDown(WebDriver driver) throws IOException {

		WebElement ele = driver.findElement(By.xpath("(//select[@id='form-input-jobRole'])[1]"));
		Select select = new Select(ele);
		select.selectByVisibleText("Other");
	}

}
