package com.qa.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qa.demoqa.base.BasePage;
import com.qa.demoqa.util.ElementUtil;


/**
 * @author SurajAnand
 *
 */


public class ProgressBar extends BasePage{
	private WebDriver driver;
	
	public ProgressBar(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
	}
	
	
	By startStopButton = By.id("startStopButton");
	By progressBar = By.xpath("//div[@class='progress-bar bg-success']");
	By resetButton = By.id("resetButton");
	
	public void verifyProgressBar()  {
		eu.doClick(startStopButton);
		eu.waitForElementPresent(progressBar, 25);
		System.out.println(eu.doGetText(progressBar));
		Assert.assertEquals(eu.doGetText(progressBar), "100%");
		
	}
	
	public void clickResetButton() {
		eu.doClick(resetButton);
	}
}
