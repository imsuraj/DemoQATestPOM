package com.qa.demoqa.tests;



/**
 * @author SurajAnand
 *
 */


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.Elements;
import com.qa.demoqa.pages.WebTable;

public class WebTableTest extends BaseTest{

	Elements elements;
	WebTable webTable;

	@BeforeClass
	public void classSetUp() {
		elements = homePage.doClickElements();
		webTable = elements.doClickWebTableSideSubMenu();


	}

	@Test(priority = 1)
	public void verifyWebTableTest() {
		webTable.doClickAddButton();
		webTable.doEnterValues("Suraj", "Sah", "suraj@gmail.com", 29, 30000, "IT");
	}

	@Test(priority = 2, dependsOnMethods = "verifyWebTableTest")
	public void verifyNameAddedTest() {
		Assert.assertEquals(webTable.doGetEnteredValue(), "Suraj", "Not mathced.");
	}

	@Test(priority = 3, dependsOnMethods = "verifyNameAddedTest")
	public void verifyEditValueTest() {
		webTable.editValues("HR");
	}

	@Test(priority = 4, dependsOnMethods = "verifyEditValueTest")
	public void verifyValueEditedTest() {
		webTable.doVerifyEditValueTest("HR");
	}
	
	@Test(priority = 5, dependsOnMethods = "verifyValueEditedTest")
	public void deleteRecordTest() {
		webTable.doClickDeleteButton();
	}

}
