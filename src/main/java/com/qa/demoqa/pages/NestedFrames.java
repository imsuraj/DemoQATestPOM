package com.qa.demoqa.pages;


/**
 * @author SurajAnand
 *
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.demoqa.base.BasePage;
import com.qa.demoqa.util.ElementUtil;

public class NestedFrames extends BasePage{
	private WebDriver driver;
	
	public NestedFrames(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
	}
	
	By nestedFramePage = By.xpath("//span[text()='NestedFrames']");
	By frame1 = By.id("frame1");
	By nestedFrame =  By.tagName("iframe");
	By parentFrame = By.xpath("//body[text()='Parent frame']");
	
	By childFrame = By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']");
	By childFrameText = By.xpath("//p[text()='Child Iframe']");
	
	
	public void verifyNestedFrame() {
		eu.doClick(nestedFramePage);
		eu.doSwitchFrame(frame1);
		System.out.println(eu.doGetText(parentFrame));
		eu.doSwitchFrame(childFrame);
		System.out.println(eu.doGetText(childFrameText));
		
		
	}
}
