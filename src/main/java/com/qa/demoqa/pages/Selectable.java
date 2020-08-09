package com.qa.demoqa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.demoqa.base.BasePage;
import com.qa.demoqa.util.ElementUtil;
import com.qa.demoqa.util.JavaScriptUtil;


/**
 * @author SurajAnand
 *
 */


public class Selectable extends BasePage {

private WebDriver driver;
	
	public Selectable(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
		js = new JavaScriptUtil(this.driver);
	}
	
	By list = By.xpath("//ul[@id='verticalListContainer']/li");
	By gridTab = By.id("demo-tab-grid");
	By grid = By.xpath("//div[@id='gridContainer']//div/li");
	
	
	public void verifySelectableList(int selectValue)  {
		List<WebElement> listElement = eu.getElements(list);
		System.out.println(listElement.get(selectValue).getText());
		listElement.get(selectValue).click();
		
	
	}
	
	public void verifySelectableGrid(int selectValue)  {
		eu.doClick(gridTab);
		List<WebElement> gridElement = eu.getElements(grid);
		System.out.println(gridElement.get(selectValue).getText());
		gridElement.get(selectValue).click();
		
	
	}
}
