package com.qa.demoqa.pages;


/**
 * @author SurajAnand
 *
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.demoqa.base.BasePage;
import com.qa.demoqa.util.ElementUtil;

public class Upload extends BasePage{
	private WebDriver driver;
	
	public Upload(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
	}
	
	By uploadFile = By.id("uploadFile");
	
	
	public void uploadFile(String path) throws InterruptedException {		;
		Thread.sleep(1000);
		eu.doSendKeys(uploadFile, path);
	}
}
