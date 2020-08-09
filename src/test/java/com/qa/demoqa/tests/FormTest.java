package com.qa.demoqa.tests;


/**
 * @author SurajAnand
 *
 */


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.Forms;

public class FormTest extends BaseTest{
	public Forms forms;
	
	@BeforeClass
	public void classSetUp() {
		forms = homePage.doClickForms();
	}
	
	@Test
	public void formClickTest() {
		forms.doClickPracticeForm();
	}
}
