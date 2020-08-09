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

public class Menu extends BasePage{
	private WebDriver driver;

	public Menu(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
		js = new JavaScriptUtil(this.driver);
	}

	By mainItem1 = By.xpath("//a[text()='Main Item 1']");
	By mainItem2 = By.xpath("//a[text()='Main Item 2']");
	By mainItem3 = By.xpath("//a[text()='Main Item 3']");
	By subItem = By.xpath("//a[text()='Sub Item']");
	By subSubList = By.xpath("//a[text()='SUB SUB LIST »']");
	By subSubItem1 = By.xpath("//a[text()='Sub Sub Item 1']");
	By subSubItem2 = By.xpath("//a[text()='Sub Sub Item 2']");

	public void verifyMainItemOne() {
		Actions actions = new Actions(driver);

		actions.moveToElement(eu.getElement(mainItem1)).build().perform();
	}

	public void verifyMainItemTwo() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(eu.getElement(mainItem2)).build().perform();

		Thread.sleep(1000);
		actions.moveToElement(eu.getElement(subItem)).build().perform();

		Thread.sleep(1000);
		actions.moveToElement(eu.getElement(subSubList)).build().perform();

		Thread.sleep(1000);
		actions.moveToElement(eu.getElement(subSubItem1)).build().perform();

		Thread.sleep(1000);
		actions.moveToElement(eu.getElement(subSubItem2)).build().perform();

	}

	public void verifyMainItemThree() {
		Actions actions = new Actions(driver);
		actions.moveToElement(eu.getElement(mainItem3)).build().perform();

	}

}
