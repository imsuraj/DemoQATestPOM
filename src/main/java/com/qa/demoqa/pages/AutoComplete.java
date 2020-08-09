package com.qa.demoqa.pages;


/**
 * @author SurajAnand
 *
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.demoqa.base.BasePage;
import com.qa.demoqa.util.ElementUtil;

public class AutoComplete extends BasePage{
	private WebDriver driver;

	public AutoComplete(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
	}

	By multiSelect = By.id("autoCompleteMultipleInput");
	By singleSelect = By.id("autoCompleteSingleInput");


	public void verifyMultiSelect(String value1, String value2, String value3)  {
		eu.doSendKeys(multiSelect, value1);
		eu.doPressEnterKey(multiSelect);
		eu.doSendKeys(multiSelect, value2);
		eu.doPressEnterKey(multiSelect);
		eu.doSendKeys(multiSelect, value3);
		eu.doPressEnterKey(multiSelect);
	}

	public void verifySingleSelect(String value)  {
		eu.doSendKeys(singleSelect, value);
		eu.doPressEnterKey(singleSelect);

	}
}
