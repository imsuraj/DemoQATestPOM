package com.qa.demoqa.tests;


/**
 * @author SurajAnand
 *
 */


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.CheckBox;
import com.qa.demoqa.pages.Elements;

public class CheckBoxTest extends BaseTest{
	
	public Elements elements;
	public CheckBox checkBox;
	
	@BeforeClass
	public void classSetUp() {
		elements = homePage.doClickElements();
		checkBox = elements.doClickCheckBoxSideSubMenu();
	}
	
	
	@Test
	public void verifyCheckBoxSelectTest() {
		checkBox.selectCheckBox("Private");
	}
}
