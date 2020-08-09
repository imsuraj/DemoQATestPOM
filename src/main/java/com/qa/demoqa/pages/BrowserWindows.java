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

public class BrowserWindows extends BasePage{
	private WebDriver driver;

	public BrowserWindows(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
	}

	By newTab = By.id("tabButton");
	By headingMessage = By.id("sampleHeading");
	By newWindow = By.id("windowButton");
	By newWindowMessage = By.id("messageWindowButton");
	By newWindowMsg = By.xpath("//body[contains(text(),'Knowledge increases by sharing but not by saving.')]");

	public void clickNewTab(String message) {
		String winHandelBefore = driver.getWindowHandle();
		doClickAndVerifyText(newTab,headingMessage, message);
		switchToWindowHandelBefore(winHandelBefore);
	}

	public void clickNewWindow(String message) throws InterruptedException {
		String winHandelBefore = driver.getWindowHandle();
		doClickAndVerifyText(newWindow, headingMessage, message);
		Thread.sleep(2000);
		switchToWindowHandelBefore(winHandelBefore);
	}

	public void clickNewWindowMessage(String message) throws InterruptedException {
		String winHandelBefore = driver.getWindowHandle();
		doClickAndVerifyText(newWindowMessage, newWindowMsg, message);
		Thread.sleep(2000);
		switchToWindowHandelBefore(winHandelBefore);
	}

	public void doClickAndVerifyText(By locator, By msgLocator, String message) {
		eu.doClick(locator);
		for(String winhandel : driver.getWindowHandles()) {
			driver.switchTo().window(winhandel);
		}
		Assert.assertEquals(eu.doGetText(msgLocator), message);
		//String title = driver.getTitle();
		System.out.println(eu.doGetText(msgLocator));
	}

	public void switchToWindowHandelBefore(String winHandelBefore ) {
		driver.close();
		driver.switchTo().window(winHandelBefore);
	}
}
