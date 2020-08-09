package com.qa.demoqa.tests;


/**
 * @author SurajAnand
 *
 */


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.Elements;
import com.qa.demoqa.pages.RadioButton;

public class RadioButtonTest extends BaseTest{
	
	public Elements elements;
	public RadioButton radioButton;
	
	@BeforeClass
	public void classSetUp() {
		elements = homePage.doClickElements();
		radioButton = elements.doClickRadioButtonSideSubMenu();
	}
	
	
	@Test
	public void verifyRadioButtonTest() {
		radioButton.testRadioButton("Yes", "Impressive");
	}
}
