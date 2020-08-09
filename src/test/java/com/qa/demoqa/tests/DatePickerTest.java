package com.qa.demoqa.tests;


/**
 * @author SurajAnand
 *
 */


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.DatePicker;
import com.qa.demoqa.pages.Widgets;

public class DatePickerTest extends BaseTest {
	
	public Widgets widgets;
	public DatePicker datePicker;
	
	@BeforeClass
	public void classSetUp() {
		widgets = homePage.doClickWidgets();
		datePicker = widgets.doClickDatePicker();
	}
	
	
	@Test
	public void selectDateAndTimeTest() {
		datePicker.selectDate("July", 1990, 14);
		datePicker.selectDateAndTime("July", 1991, 30, "23:00");
	}
	
	
	
}
