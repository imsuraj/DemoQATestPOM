package com.qa.demoqa.pages;


/**
 * @author SurajAnand
 *
 */


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.demoqa.base.BasePage;
import com.qa.demoqa.util.ElementUtil;
import com.qa.demoqa.util.JavaScriptUtil;

public class Sortable extends BasePage {

	private WebDriver driver;

	public Sortable(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
		js = new JavaScriptUtil(this.driver);
	}

	By list = By.xpath("//div[@id='demo-tabpane-list']/div/div");
	By gridTab = By.id("demo-tab-grid");
	By grid = By.xpath("//div[@class='create-grid']/div");

	public void verifySortableList(int from, int to) throws InterruptedException {
		Actions action = new Actions(driver);
		List<WebElement> listElement = eu.getElements(list);
		if (from >listElement.size() || to > listElement.size()) {
			System.out.println("Enter valid from and to value.");
		}else {
			action.click(listElement.get(from)).clickAndHold().moveToElement(listElement.get(to)).release().build().perform();
		}	
	}
	
	public void clickGridTab() {
		eu.doClick(gridTab);
	}
	
	public void verifySortableGrid(int from, int to) throws InterruptedException {
		Actions action = new Actions(driver);
		List<WebElement> listElement = eu.getElements(grid);
		if (from >listElement.size() || to > listElement.size()) {
			System.out.println("Enter valid from and to value.");
		}else {
			action.click(listElement.get(from)).clickAndHold().moveToElement(listElement.get(to)).release().build().perform();
		}	
	}

}
