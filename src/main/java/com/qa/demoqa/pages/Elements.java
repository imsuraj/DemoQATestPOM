package com.qa.demoqa.pages;


/**
 * @author SurajAnand
 *
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.demoqa.base.BasePage;
import com.qa.demoqa.util.ElementUtil;

public class Elements extends BasePage{
	
	private WebDriver driver;
	
	public Elements(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
	}
	
	By textBoxMenu = By.xpath("//span[text()='Text Box']");
	By checkboxMenu = By.xpath("//span[text()='Check Box']");
	By radioButtonMenu = By.xpath("//span[text()='Radio Button']");
	By webTable = By.xpath("//span[text()='Web Tables']");
	By buttonsMenu = By.xpath("//span[text()='Buttons']");
	By linkMenu = By.xpath("//span[text()='Links']");

	By uploadMenu = By.xpath("//span[contains(text(),'Upload and Download')]");
	
	
	
	
	public TextBox doClickTextBoxSideSubMenu() {
		eu.doClick(textBoxMenu);
		return new TextBox(driver);
	}
	
	
	public CheckBox doClickCheckBoxSideSubMenu() {
		eu.doClick(checkboxMenu);
		return new CheckBox(driver);
	}
	
	public RadioButton doClickRadioButtonSideSubMenu() {
		eu.doClick(radioButtonMenu);
		return new RadioButton(driver);
	}
	
	public WebTable doClickWebTableSideSubMenu() {
		eu.doClick(webTable);
		return new WebTable(driver);
	}
	
	public Buttons doClickButtonsSideSubMenu() {
		eu.doClick(buttonsMenu);
		return new Buttons(driver);
	}
	
	public Links doClickLinkSubMenu() {
		eu.doClick(linkMenu);
		return new Links(driver);
	}
	
	public Upload doClickUploadSubMenu() {
		eu.doClick(uploadMenu);
		return new Upload(driver);
	}
	
	
	
	
}
