package com.qa.demoqa.tests;


/**
 * @author SurajAnand
 *
 */


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.Widgets;

public class WidgetsTest extends BaseTest {
	
	public Widgets widgets;
	
	@BeforeClass
	public void classSetUp() {
		widgets = homePage.doClickWidgets();
	}
	
	@Test(priority = 1)
	public void clickAccordianTest() {
		widgets.doClickAccordian();
	}
	
	@Test(priority = 2)
	public void clickAutoCompleteTest() {
		widgets.doClickAutoComplete();
	}
	
	@Test(priority = 3)
	public void clickDatePickerTest() {
		widgets.doClickDatePicker();
	}
	
	@Test(priority = 4)
	public void clickSliderTest() {
		widgets.doClickSlider();
	}
	
	@Test(priority = 5)
	public void clickProgressBarTest() {
		widgets.doClickProgress();
	}
	
	@Test(priority = 6)
	public void clickTabsTest() {
		widgets.doClickTabs();
	}
	
	@Test(priority = 7)
	public void clickToolTipsTest() {
		widgets.doClickToolTips();
	}
	
	@Test(priority = 8)
	public void clickMenuTest() {
		widgets.doClickMenu();
	}
	
	@Test(priority = 9)
	public void clickSelectMenuTest() {
		widgets.doClickSelectMenu();
	}
	
	
	
}
