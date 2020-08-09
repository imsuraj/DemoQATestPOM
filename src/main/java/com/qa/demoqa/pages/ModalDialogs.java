package com.qa.demoqa.pages;


/**
 * @author SurajAnand
 *
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.demoqa.base.BasePage;
import com.qa.demoqa.util.ElementUtil;

public class ModalDialogs extends BasePage{
	private WebDriver driver;
	
	public ModalDialogs(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
	}
	
	
	By smallModal = By.id("showSmallModal");
	By largeModal = By.id("showLargeModal");
	
	By modalScreen = By.cssSelector(".modal-content");
	By smallModalHeader = By.id("example-modal-sizes-title-sm");
	By largeModalHeader = By.id("example-modal-sizes-title-lg");
	By modalBody = By.cssSelector(".modal-body");
	
	By closeButton = By.xpath("//button[text()='Close']");
	
	public void verifySmallModalDialog() {
		eu.doClick(smallModal);
		eu.doClick(modalScreen);
		System.out.println(eu.doGetText(smallModalHeader));
		System.out.println(eu.doGetText(modalBody));
		eu.doClick(closeButton);
		
	}
	
	public void verifyLargeModalDialog() {
		eu.doClick(largeModal);
		eu.doClick(modalScreen);
		System.out.println(eu.doGetText(largeModalHeader));
		System.out.println(eu.doGetText(modalBody));
		eu.doClick(closeButton);
		
	}
}
