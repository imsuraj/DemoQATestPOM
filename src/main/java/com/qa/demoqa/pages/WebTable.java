package com.qa.demoqa.pages;


/**
 * @author SurajAnand
 *
 */


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.qa.demoqa.base.BasePage;
import com.qa.demoqa.util.ElementUtil;

public class WebTable extends BasePage{
	private WebDriver driver;

	public WebTable(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
	}


	By addBtn = By.id("addNewRecordButton");
	By searchBox = By.id("searchBox");

	By submitBtn = By.id("submit");
	By firstName = By.id("firstName");
	By lastName = By.id("lastName");
	By userEmail = By.id("userEmail");
	By age = By.id("age");
	By salary = By.id("salary");
	By department = By.id("department");

	String fName = "Suraj";
	String lName = "Sah";

	By addedDetails = By.xpath("//div[text()='"+lName+"']//preceding-sibling::div[text()='"+fName+"']");
	By edit = By.xpath("//div[text()='"+fName+"']//following-sibling::div[text()='"+lName+"']//following-sibling::div//div[@class='action-buttons']//span[@title='Edit']");
	By delete = By.xpath("//div[text()='"+fName+"']//following-sibling::div[text()='"+lName+"']//following-sibling::div//div[@class='action-buttons']//span[@title='Delete']");

	By webList = By.xpath("//div[text()='"+fName+"']//following-sibling::div");


	public void testLinks() {
		eu.doClick(addBtn);
		eu.waitForElementPresent(submitBtn, 10);
		eu.doSendKeys(firstName, fName);
		eu.doSendKeys(lastName, lName);
		eu.doSendKeys(userEmail, "suraj@sah.com");
		eu.doSendKeys(age, "30");
		eu.doSendKeys(salary, "30000");
		eu.doSendKeys(department, "IT");

		eu.doClick(submitBtn);

		String name = eu.doGetText(addedDetails);
		Assert.assertEquals(name, fName);


		eu.doSendKeys(searchBox, fName);

		String name1 = eu.doGetText(addedDetails);
		Assert.assertEquals(name1, fName);

		eu.doClick(edit);
		eu.getElement(department).clear();
		eu.doSendKeys(department, "HR");
		eu.doClick(submitBtn);

		List<WebElement> list = eu.getElements(webList);

		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			//System.out.println(list.get(i).getText());
			if (list.get(i).getText().equals("HR")) {
				System.out.println("Edited value matched.");
				break;
			}
			else {
				System.out.println("Edited value does not match.");
			}
		}
		eu.doClick(delete);
	}


	public void doClickAddButton() {
		eu.doClick(addBtn);
	}


	public void doClickDeleteButton() {
		eu.doClick(delete);

	}
	public void doEnterValues(String fName, String LName, String email, int age, int salary, String Dept) {
		eu.doSendKeys(firstName, fName);
		eu.doSendKeys(lastName, LName);
		eu.doSendKeys(userEmail, email);
		eu.doSendKeys(this.age, age);
		eu.doSendKeys(this.salary, salary);
		eu.doSendKeys(department, Dept);
		eu.doClick(submitBtn);
	}

	public  String doGetEnteredValue() {
		String name = eu.doGetText(addedDetails);
		return name;
	}

	public void editValues(String Dept) {
		eu.doClick(edit);
		eu.getElement(department).clear();
		eu.doSendKeys(department, Dept);
		eu.doClick(submitBtn);
	}
	
	
	public void doVerifyEditValueTest(String dept) {
		List<WebElement> list = eu.getElements(webList);

		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			//System.out.println(list.get(i).getText());
			if (list.get(i).getText().equals(dept)) {
				System.out.println("Edited value matched.");
				break;
			}
			else {
				System.out.println("Edited value does not match.");
			}
		}
	}
}





