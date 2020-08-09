package com.qa.demoqa.pages;


/**
 * @author SurajAnand
 *
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.qa.demoqa.base.BasePage;
import com.qa.demoqa.util.ElementUtil;
import com.qa.demoqa.util.JavaScriptUtil;

public class Draggable extends BasePage {
	private WebDriver driver;

	public Draggable(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
		js = new JavaScriptUtil(this.driver);
	
	}
	
	
	By dragBox = By.id("dragBox");
	By axisRestricted = By.id("draggableExample-tab-axisRestriction");
	By xAxis = By.id("restrictedX");
	By yAxis = By.id("restrictedY");
	
	
	public void doSimpleDrag(int x, int y) {
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(eu.getElement(dragBox), x, y).build().perform();;
	}
	
	
	
	public void doAxisRestrictedDrag(int x, int y) {
		eu.doClick(axisRestricted);
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(eu.getElement(xAxis), x, 0).build().perform();
		actions.dragAndDropBy(eu.getElement(yAxis), 0, y).build().perform();
	}
	
	
}
