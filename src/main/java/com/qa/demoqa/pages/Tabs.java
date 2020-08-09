package com.qa.demoqa.pages;


/**
 * @author SurajAnand
 *
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.demoqa.base.BasePage;
import com.qa.demoqa.util.ElementUtil;

public class Tabs extends BasePage{
	private WebDriver driver;
	
	public Tabs(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
	}

	By what = By.id("demo-tab-what");
	By whatTabpane = By.id("demo-tabpane-what");
	
	By origin = By.id("demo-tab-origin");
	By originTabpane = By.id("demo-tabpane-origin");
	
	By use = By.id("demo-tab-use");
	By useTabpane = By.id("demo-tabpane-use");
	
	
	public void clickOriginTab() throws InterruptedException {
	eu.doClick(origin);
	Thread.sleep(1000);
	System.out.println(eu.doGetText(originTabpane));
	}
	
	public void clickUseTab() throws InterruptedException {
	eu.doClick(use);
	Thread.sleep(1000);
	System.out.println(eu.doGetText(useTabpane));
	}
	
	public void clickWhatTab() throws InterruptedException {
	eu.doClick(what);
	Thread.sleep(1000);
	System.out.println(eu.doGetText(whatTabpane));
	}	
}
