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

public class Widgets extends BasePage {
	private WebDriver driver;

	public Widgets(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
		js = new JavaScriptUtil(this.driver);
	}

	By accordianMenu= By.xpath("//span[text()='Accordian']");
	By autoCompleteMenu= By.xpath("//span[text()='Auto Complete']");
	By datePickerMenu= By.xpath("//span[text()='Date Picker']");
	By sliderMenu= By.xpath("//span[text()='Slider']");
	By progressMenu= By.xpath("//span[text()='Progress Bar']");
	By tabs= By.xpath("//span[text()='Tabs']");
	By toolTips= By.xpath("//span[text()='Tool Tips']");
	By menu= By.xpath("//span[text()='Menu']");
	By selectMenu= By.xpath("//span[text()='Select Menu']");


	public Accordian doClickAccordian() {
		eu.doClick(accordianMenu);
		return new Accordian(driver);
	}

	public AutoComplete doClickAutoComplete() {
		eu.doClick(autoCompleteMenu);
		return new AutoComplete(driver);
	}

	public DatePicker doClickDatePicker() {
		eu.doClick(datePickerMenu);
		return new DatePicker(driver);
	}

	public Slider doClickSlider() {
		eu.doClick(sliderMenu);
		return new Slider(driver);
	}

	public ProgressBar doClickProgress() {
		eu.doClick(progressMenu);
		return new ProgressBar(driver);
	}

	public Tabs doClickTabs() {
		//eu.doClick(tabs);
		//eu.doActionsClick(tabs);
		js.clickElementByJS(eu.getElement(tabs));
		return new Tabs(driver);
	}

	public void doClickToolTips() {
		//eu.doClick(toolTips);
		eu.doActionsClick(toolTips);
		//return new AccordianMenu(drver);
	}

	public Menu doClickMenu() {
		//eu.doClick(menu);
		//		eu.doActionsClick(menu);
		js.clickElementByJS(eu.getElement(menu));
		return new Menu(driver);
	}

	public SelectMenu doClickSelectMenu() {
		//eu.doClick(selectMenu);
		//eu.doActionsClick(selectMenu);
		js.clickElementByJS(eu.getElement(selectMenu));
		return new SelectMenu(driver);
	}
}
