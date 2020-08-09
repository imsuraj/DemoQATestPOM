package com.qa.demoqa.pages;

/**
 * @author SurajAnand
 *
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.demoqa.base.BasePage;
import com.qa.demoqa.util.ElementUtil;

public class Accordian extends BasePage{
	private WebDriver driver;
	
	public Accordian(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
	}
	
	By header1 = By.id("section1Heading");
	By body1 = By.id("section1Content");
	
	By header2 = By.id("section2Heading");
	By body2 = By.id("section2Content");
	
	By header3 = By.id("section3Heading");
	By body3 = By.id("section3Content");
	
	
	public void verifyAccordian() throws InterruptedException {
		System.out.println(eu.doGetText(header1));
		System.out.println(eu.doGetText(body1));
		
		System.out.println(eu.doGetText(header2));
		eu.doClick(header2);
		Thread.sleep(1000);
		System.out.println(eu.doGetText(body2));
		
		System.out.println(eu.doGetText(header3));
		eu.doClick(header3);
		Thread.sleep(1000);
		System.out.println(eu.doGetText(body3));

		
	}

}
