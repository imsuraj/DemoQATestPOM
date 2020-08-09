package com.qa.demoqa.pages;


/**
 * @author SurajAnand
 *
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qa.demoqa.base.BasePage;
import com.qa.demoqa.util.ElementUtil;

public class Frames extends BasePage{
	private WebDriver driver;
	
	public Frames(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
	}
	
	
	By frameWindow = By.xpath("//span[text()='Frames']");
	By frame1 = By.id("frame1");
	By frame2 = By.id("frame2");
	By headerMessage = By.id("sampleHeading");
	
	public void verifyFrame() {
		eu.doClick(frameWindow);
		eu.doSwitchFrame(frame1);
		String messsage1 = eu.doGetText(headerMessage);
		Assert.assertEquals(messsage1, "This is a sample page");
		driver.switchTo().defaultContent();
		
		eu.doSwitchFrame(frame2);
		String messsage2 = eu.doGetText(headerMessage);
		Assert.assertEquals(messsage2, "This is a sample page");
		driver.switchTo().defaultContent();
	}
}
