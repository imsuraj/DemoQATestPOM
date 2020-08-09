package com.qa.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qa.demoqa.base.BasePage;
import com.qa.demoqa.util.ElementUtil;


/**
 * @author SurajAnand
 *
 */


public class RadioButton extends BasePage {
	
	private WebDriver driver;

	public RadioButton(WebDriver driver) {
		this.driver=driver;
		eu = new ElementUtil(this.driver);
	}
	
	
	By yes = By.xpath("//label[contains(text(),'Yes')]");
	By impressive = By.xpath("//label[contains(text(),'Impressive')]");
	By sucessMessage = By.xpath("//span[@class='text-success']");
	
	
	public void testRadioButton(String msg1, String msg2) {
		eu.doClick(yes);
		String yesSucess = eu.doGetText(sucessMessage);
		System.out.println(yesSucess);
		Assert.assertEquals(yesSucess, msg1);
		eu.doClick(impressive);
		String impressiveSuccess = eu.doGetText(sucessMessage);
		System.out.println(impressiveSuccess);
		Assert.assertEquals(impressiveSuccess, msg2);
	}

}
