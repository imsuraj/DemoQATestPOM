package com.qa.demoqa.pages;


/**
 * @author SurajAnand
 *
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.demoqa.base.BasePage;
import com.qa.demoqa.util.Constants;
import com.qa.demoqa.util.ElementUtil;

public class HomePage extends BasePage {
	private WebDriver driver;
	
	By elements = By.xpath("//h5[contains(text(),'Elements')]");
	By forms = By.xpath("//h5[contains(text(),'Forms')]");
	By alertFrameWindows = By.xpath("//h5[contains(text(),'Alerts, Frame & Windows')]");
	By widgets = By.xpath("//h5[contains(text(),'Widgets')]");
	By interactions = By.xpath("//h5[contains(text(),'Interactions')]");
	
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
	}
	
	
	
	public String getHomePagetitle() {
		return eu.doGetPageTitleWithContains(10, Constants.Home_Page_Title);
	}
	
	public boolean verifyElementsIsPresent() {
		eu.waitForElementPresent(elements, 5);
		return eu.doIsDisplayed(elements);
	}
	
	public Elements doClickElements() {
		eu.doClick(elements);
		return new Elements(driver);
	}
	
	public boolean verifyFormsIsPresent() {
		eu.waitForElementPresent(forms, 5);
		return eu.doIsDisplayed(forms);
	}
	
	public Forms doClickForms() {
		eu.doClick(forms);
		return new Forms(driver);
	}
	
	public boolean verifyAlertFrameWindowsIsPresent() {
		eu.waitForElementPresent(alertFrameWindows, 5);
		return eu.doIsDisplayed(alertFrameWindows);
	}
	
	public AlertFrameWindows doClickAlertFrameWindows() {
		eu.doClick(alertFrameWindows);
		return new AlertFrameWindows(driver);
	}
	
	public boolean verifyWidgetsIsPresent() {
		eu.waitForElementPresent(widgets, 5);
		return eu.doIsDisplayed(widgets);
	}
	
	public Widgets doClickWidgets() {
		eu.doClick(widgets);
		return new Widgets(driver);
	}
	
	public boolean verifyInteractionsIsPresent() {
		eu.waitForElementPresent(interactions, 5);
		return eu.doIsDisplayed(interactions);
	}
	
	public Interactions doClickInteractions() {
		eu.doClick(interactions);
		return new Interactions(driver);
	}
	
}
