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

public class Slider extends BasePage{
	private WebDriver driver;
	
	public Slider(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
	}
	
	By slider = By.xpath("//input[@class='range-slider range-slider--primary']");
	
	public void verifySlider(int xoffset, int yofset) {
		Actions action = new Actions(driver);
		action.clickAndHold(eu.getElement(slider)).dragAndDropBy(eu.getElement(slider), xoffset, yofset).build().perform();
		
	}

}
