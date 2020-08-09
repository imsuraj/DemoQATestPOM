package com.qa.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.demoqa.base.BasePage;
import com.qa.demoqa.util.ElementUtil;
import com.qa.demoqa.util.JavaScriptUtil;


/**
 * @author SurajAnand
 *
 */


public class SelectMenu extends BasePage{
	private WebDriver driver;

	public SelectMenu(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
		js = new JavaScriptUtil(this.driver);
	}


	By selectValue = By.id("withOptGroup");

	By selectOne = By.id("selectOne");

	By oldSelectMenu = By.id("oldSelectMenu");

	public void selectValue() {
		eu.doClick(selectValue);
		eu.doActionSelectDropDownUsingDownAndEnterKey();
	}

	public void selectOne() {
		eu.doClick(selectOne);
		eu.doActionSelectDropDownUsingDownAndEnterKey();
	}

	public void selectOldStyleSelectMenu(String value) {
		eu.doSelectByVisibleText(oldSelectMenu, value);
	}



}
