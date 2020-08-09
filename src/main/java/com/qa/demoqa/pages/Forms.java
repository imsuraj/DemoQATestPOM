package com.qa.demoqa.pages;


/**
 * @author SurajAnand
 *
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.demoqa.base.BasePage;
import com.qa.demoqa.util.ElementUtil;

public class Forms extends BasePage{
	
	private WebDriver driver;
	public Forms(WebDriver driver) {
		this.driver= driver;
		eu = new ElementUtil(this.driver);
	}
	
	
	By practiceForm = By.xpath("//span[text()='Practice Form']");
	
	public PracticeForm doClickPracticeForm() {
		eu.doClick(practiceForm);
		return new PracticeForm(driver);
	}
	
	
	
}
