package com.qa.demoqa.pages;


/**
 * @author SurajAnand
 *
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.demoqa.base.BasePage;
import com.qa.demoqa.util.ElementUtil;

public class PracticeForm extends BasePage{
	private WebDriver driver;
	
	public PracticeForm(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
	}
	
	By firstName = By.id("firstName");
	By lastName = By.id("lastName");
	By userEmail = By.id("userEmail");
	By gender = By.xpath("//label[text()='Male']");
	By mobileNumber = By.id("userNumber");
	By dob = By.id("dateOfBirthInput");
	By year = By.xpath("//select[@class='react-datepicker__year-select']");
	By month = By.xpath("//select[@class='react-datepicker__month-select']");
	By date = By.xpath("//div[@class='react-datepicker__month']//div//div");

	By subject = By.id("subjectsInput");
	By hobbies1 = By.xpath("//label[text()='Sports']");
	By hobbies2 = By.xpath("//label[text()='Reading']");
	By hobbies3 = By.xpath("//label[text()='Music']");
	By picture = By.id("uploadPicture");
	By currentAddress = By.id("currentAddress");

	By state = By.id("react-select-3-input");
	By city = By.id("react-select-4-input");
	By submitBtn = By.id("submit");
	
	By closeBtn =  By.id("closeLargeModal");

	
	public void enterValueInPracticeForm (String firstname, String lastname, String email, String mobile, String year, String month, String date) throws InterruptedException {
		eu.doActionsSendKeys(firstName, firstname);
		eu.doActionsSendKeys(lastName, lastname);
		eu.doActionsSendKeys(userEmail, email);

		eu.doClick(gender);
		eu.doSendKeys(mobileNumber, mobile);
		eu.doClick(dob);

		eu.doSelectByValue(this.year, year);
		eu.doSelectByValue(this.month, month);
		eu.selectDropDownValueWithoutSelect(this.date, date);

		eu.doSendKeys(subject, "Math");

		Thread.sleep(1000);

		eu.doPressEnterKey(subject);

		eu.doClick(hobbies1);
		eu.doClick(hobbies2);
		eu.doClick(hobbies3);

		eu.doSendKeys(picture, "/Users/Suraj/Downloads/sampleFile.jpeg");
		eu.doSendKeys(currentAddress, "Lalitpur");

		eu.doSendKeys(state, "NCR");
		Thread.sleep(1000);
		eu.doPressEnterKey(state);
		
		eu.doSendKeys(city, "Delhi");
		Thread.sleep(1000);
		eu.doPressEnterKey(city);
		
		eu.doClick(submitBtn);

		eu.doClick(closeBtn);
	}
}
