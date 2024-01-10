package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class tendableProject {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.tendable.com/");
		driver.manage().window().maximize();
		String actualTitle = "Quality Improvement App | Health and Social Care | Tendable";
		String expectedTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle);

		driver.findElement(By.xpath("//a[contains(text(),'Our Story')]")).click();
		driver.findElement(By.xpath("//a[.='Our Solution']")).click();
		driver.findElement(By.xpath("//a[.='Why Tendable?']")).click();
//Request button
		boolean requestButton = driver.findElement(By.xpath("(//a[contains(text(),'Request a Demo')])[1]")).isEnabled();
		System.out.println("Request a Demo button is present: " + requestButton);
//3rd
		driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Contact')]")).click();
//Form

		driver.findElement(By.xpath("(//input[@id='form-input-fullName'])[1]")).sendKeys("FirstName");
		driver.findElement(By.xpath("(//input[@id='form-input-organisationName'])[1]")).sendKeys("organisationName");

		driver.findElement(By.xpath("(//input[@id='form-input-cellPhone'])[1]")).sendKeys("9843000000");
		driver.findElement(By.xpath("(//input[@id='form-input-email'])[1]")).sendKeys("organisation@gmail.com");

		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//select[@id='form-input-jobRole'])[1]"));
		Select select = new Select(ele);
		select.selectByVisibleText("Other");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='form-input-consentAgreed-0'])[1]")).click();
		driver.findElement(By.xpath("(//button[@name='form_page_submit'])[1]")).click();
		Thread.sleep(2000);
		String actual_error = driver.findElement(By.xpath("//form[@id='contactMarketingPipedrive-163701']/div/p")).getText();
		System.out.println(actual_error);
		String expected_error = "Sorry, there was an error submitting the form. Please try again.";
		Assert.assertEquals(actual_error, expected_error);
		
		driver.quit();
	}
}
