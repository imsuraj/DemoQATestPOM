package com.qa.demoqa.tests;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.Buttons;
import com.qa.demoqa.pages.Elements;
import com.qa.demoqa.util.Constants;

public class ButtonsTest extends BaseTest {

	public Elements elements;
	public Buttons button;

	@BeforeClass
	public void classSetUp() {
		elements = homePage.doClickElements();
		button = elements.doClickButtonsSideSubMenu();
	}

	@Test (priority = 1, enabled = true)
	public void testDoubleClick() {
		button.doDoubleClick();
		String message = button.getDoubleClickMessage();
		Assert.assertEquals(message, Constants.doubleClickMessage);

	}

	@Test (priority = 2, enabled = true)
	public void testRightClick() {
		button.doRightClick();
		String message = button.getRightClickMessage();
		Assert.assertEquals(message, Constants.rightClickMessage);
	}

	@Test (priority = 3, enabled = true)
	public void testButtonClick() {
		button.doButtonClick();
		String message = button.getButtonClickMessage();
		Assert.assertEquals(message, Constants.dynamicClickMessage);
	}

}
