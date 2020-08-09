package com.qa.demoqa.pages;


/**
 * @author SurajAnand
 *
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.demoqa.base.BasePage;
import com.qa.demoqa.util.ElementUtil;

public class TextBox extends BasePage{

	private WebDriver driver;

	public TextBox(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
	}


	By fullName = By.id("userName");
	By email = By.id("userEmail");
	By currentAddress = By.id("currentAddress");
	By permanentAddress = By.id("permanentAddress");
	By submitButton = By.id("submit");


	public void enterTextBoxValue(String fname, String email, String currentAddress, String permanentAddress) {
		eu.doSendKeys(fullName, fname);
		eu.doSendKeys(this.email, email);
		eu.doSendKeys(this.currentAddress, currentAddress);
		eu.doSendKeys(this.permanentAddress, permanentAddress);
		eu.doClick(submitButton);
	}
}
