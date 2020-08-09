package com.qa.demoqa.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.AutoComplete;
import com.qa.demoqa.pages.Widgets;

public class AutoCompleteTest extends BaseTest {
	
	public Widgets widgets;
	public AutoComplete autoComplete;
	
	@BeforeClass
	public void classSetUp() {
		widgets = homePage.doClickWidgets();
		autoComplete = widgets.doClickAutoComplete();
				
	}
	
	
	@Test
	public void autoCompleteTest() {
		autoComplete.verifyMultiSelect("Red", "Green", "Purple");
		autoComplete.verifySingleSelect("Purple");
	}
	
	
	
}
