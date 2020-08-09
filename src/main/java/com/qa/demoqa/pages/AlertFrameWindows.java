package com.qa.demoqa.pages;


/**
 * @author SurajAnand
 *
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.demoqa.base.BasePage;
import com.qa.demoqa.util.ElementUtil;

public class AlertFrameWindows extends BasePage{
	private WebDriver driver;
	public AlertFrameWindows (WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
	}
	
	
	By browserWindowsSideMenu = By.xpath("//span[text()='Browser Windows']");
	By alersSideMenu = By.xpath("//span[text()='Alerts']");
	By frameideMenu = By.xpath("//span[text()='Frames']");
	By nestedFramesSideMenu = By.xpath("//span[text()='Nested Frames']");
	By modalDialogsMenu= By.xpath("//span[text()='Modal Dialogs']");
	
	
	public BrowserWindows doClickbrowserWindowsSideMenu() {
		eu.doActionsClick(browserWindowsSideMenu);
		return new BrowserWindows(driver);
	}
	
	
	public Alerts doClickAlertsSideMenu() {
		eu.doActionsClick(alersSideMenu);
		return new Alerts(driver);
	}
	
	public Frames doClickFrameSideMenu() {
		eu.doActionsClick(frameideMenu);
		return new Frames(driver);
	}
	
	public NestedFrames doClickNestedFramesSideMenu() {
		eu.doActionsClick(nestedFramesSideMenu);
		return new NestedFrames(driver);
	}
	
	public ModalDialogs doClickModalDialogsMenu() {
		eu.doActionsClick(modalDialogsMenu);
		return new ModalDialogs(driver);
	}
}
