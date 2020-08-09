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
import com.qa.demoqa.util.JavaScriptUtil;

public class Droppable extends BasePage {
	private WebDriver driver;

	public Droppable(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
		js = new JavaScriptUtil(this.driver);
	}


	By draggable = By.id("draggable");
	By droppable = By.id("droppable");
	By droppableAcceptTarget = By.xpath("//div[@id='acceptDropContainer']//div[@id='droppable']");
	By droppableAccept = By.id("droppableExample-tab-accept");
	By acceptable = By.id("acceptable");
	By notAcceptable = By.id("notAcceptable");

	public void doSimpleDroppable(String message) {
		eu.doActionsDragAndDrop(draggable, droppable);
		Assert.assertEquals(eu.doGetText(droppable), message);
	}

	public void doAcceptDroppable(String beforeMessage, String afterMessage)  {
		eu.doClick(droppableAccept);
		eu.doActionsDragAndDrop(notAcceptable, droppableAcceptTarget);
		Assert.assertEquals(eu.doGetText(droppableAcceptTarget), beforeMessage);
		eu.doActionsDragAndDrop(acceptable, droppableAcceptTarget);
		Assert.assertEquals(eu.doGetText(droppableAcceptTarget), afterMessage);

	}
}
