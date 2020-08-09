package com.qa.demoqa.pages;


/**
 * @author SurajAnand
 *
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.demoqa.base.BasePage;
import com.qa.demoqa.util.ElementUtil;
import com.qa.demoqa.util.JavaScriptUtil;

public class Interactions extends BasePage {
	private WebDriver driver;

	public Interactions(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
		js = new JavaScriptUtil(this.driver);
	}

	By sortable= By.xpath("//span[contains(text(),'Sortable')]");
	By selectable= By.xpath("//span[contains(text(),'Selectable')]");
	By resizable= By.xpath("//span[contains(text(),'Resizable')]");
	By droppable= By.xpath("//span[contains(text(),'Droppable')]");
	By draggable= By.xpath("//span[contains(text(),'Dragabble')]");





	public Sortable doClickSortable() {
		js.clickElementByJS(eu.getElement(sortable));
		return new Sortable(driver);
	}

	public Selectable doClickSelectable() {
		js.clickElementByJS(eu.getElement(selectable));
		return new Selectable(driver);
		}

	public Resizable doClickResizable() {
		js.clickElementByJS(eu.getElement(resizable));
		return new Resizable(driver);
	}

	public Droppable doClickDroppable() {
		js.clickElementByJS(eu.getElement(droppable));
		return new Droppable(driver);
	}
	
	public Draggable doClickDraggable() {
		js.clickElementByJS(eu.getElement(draggable));
		return new Draggable(driver);
	}
}
