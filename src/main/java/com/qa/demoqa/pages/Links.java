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

public class Links extends BasePage{
	private WebDriver driver;
	
	public Links(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
	}
	
	
	By linkMenu = By.xpath("//span[text()='Links']");
	By simpleLink = By.linkText("Home");
	By dynamicLink = By.id("dynamicLink");

	By element = By.xpath("//h5[text()='Elements']");
	
	public void doClickLinks() {

		String winHandleBefore = driver.getWindowHandle();
		eu.doClick(simpleLink);
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
		}
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String text = eu.doGetText(element);
		System.out.println(text);

		Assert.assertEquals(text, "Elements");
		driver.close();
		driver.switchTo().window(winHandleBefore);
	}
	
	
	public void doClickDynamicLink() {
		String winHandleBefore = driver.getWindowHandle();
		eu.doClick(dynamicLink);
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
		}
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String text = eu.doGetText(element);
		System.out.println(text);

		Assert.assertEquals(text, "Elements");
		driver.close();
		driver.switchTo().window(winHandleBefore);
	}
	
}
