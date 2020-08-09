package com.qa.demoqa.pages;


/**
 * @author SurajAnand
 *
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.demoqa.base.BasePage;
import com.qa.demoqa.util.ElementUtil;

public class Buttons extends BasePage{
	private WebDriver driver;

	public Buttons(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
	}

	By doubleClick = By.id("doubleClickBtn");
	By doubleClickMessage = By.id("doubleClickMessage");
	
	By rightClick = By.id("rightClickBtn");
	By rightClickMessage = By.id("rightClickMessage");


	By clickMe = By.xpath("//button[text()='Click Me']");
	By clickMessage = By.id("dynamicClickMessage");



	public void doDoubleClick() {
		eu.doDoubleClick(doubleClick);
	}

	public String getDoubleClickMessage() {
		return	eu.doGetText(doubleClickMessage);
	}

	public void doRightClick() {
		eu.doRightClick(rightClick);
	}

	public String getRightClickMessage() {
		return	eu.doGetText(rightClickMessage);
	}
	
	public void doButtonClick() {
		eu.doClick(clickMe);
	}
	
	public String getButtonClickMessage() {
		return	eu.doGetText(clickMessage);
	}
}
