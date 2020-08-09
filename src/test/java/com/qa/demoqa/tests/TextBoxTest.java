package com.qa.demoqa.tests;


/**
 * @author SurajAnand
 *
 */


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.Elements;
import com.qa.demoqa.pages.TextBox;

public class TextBoxTest extends BaseTest {
	
	public Elements elements;
	public TextBox textBox;
	
	
	@BeforeClass
	public void classSetUp() {
		elements = homePage.doClickElements();
		textBox = elements.doClickTextBoxSideSubMenu();
	}
	
	@Test
	public void textBoxTest() {
		textBox.enterTextBoxValue("Suraj Anand", "Suraj@gmail.com", "Patan", "Lagankkhel");
	}
}
