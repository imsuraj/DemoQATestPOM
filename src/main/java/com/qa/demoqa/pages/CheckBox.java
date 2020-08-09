package com.qa.demoqa.pages;


/**
 * @author SurajAnand
 *
 */


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.demoqa.base.BasePage;
import com.qa.demoqa.util.ElementUtil;


public class CheckBox extends BasePage{

	private WebDriver driver;
	
	public CheckBox(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
	}
	
	
	
	By allCheckbox = By.xpath("//span[@class='rct-title']");
	By expandIcon = By.xpath("//button[@title='Expand all']");
	

	public void selectCheckBox(String checkBox) {
		eu.doClick(expandIcon);
		List<WebElement> checkBoxList = eu.getElements(allCheckbox);
		System.out.println(checkBoxList.size());
		
		for (int i = 0; i < checkBoxList.size(); i++) {
			if (checkBoxList.get(i).getText().equals(checkBox)) {
				checkBoxList.get(i).click();
				break;
			}
		}
	}
	
}
