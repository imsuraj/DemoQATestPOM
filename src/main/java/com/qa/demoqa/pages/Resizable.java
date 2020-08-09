package com.qa.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.qa.demoqa.base.BasePage;
import com.qa.demoqa.util.ElementUtil;
import com.qa.demoqa.util.JavaScriptUtil;


/**
 * @author SurajAnand
 *
 */


public class Resizable extends BasePage {

	private WebDriver driver;
	
	public Resizable(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
		js = new JavaScriptUtil(this.driver);
	}

	
	By resizableBoxWithRestriction = By.xpath("//div[@id='resizableBoxWithRestriction']//span");
	By resize = By.xpath("//div[@id='resizable']//span");
	
	public void verifyResizableBox(int xValue, int yValue) {
		Actions action = new Actions(driver);
		action.dragAndDropBy(eu.getElement(resizableBoxWithRestriction), xValue, yValue).build().perform();
	}
	
	
	public void verifyResizable(int xValue, int yValue)  {
		Actions action = new Actions(driver);
		action.clickAndHold(eu.getElement(resize)).moveByOffset(xValue, yValue).release().build().perform();

	}
}
