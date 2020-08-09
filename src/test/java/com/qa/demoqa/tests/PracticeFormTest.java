package com.qa.demoqa.tests;


/**
 * @author SurajAnand
 *
 */


import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.Forms;
import com.qa.demoqa.pages.PracticeForm;
import com.qa.demoqa.util.ExcelUtil;

public class PracticeFormTest extends BaseTest{
	
	public Forms forms;
	public PracticeForm practiceForm;
	
	
	
	@BeforeClass
	
	public void classSetUp() {
		forms = homePage.doClickForms();
		practiceForm = forms.doClickPracticeForm();
	}
	
	@Test(enabled = false)
	public void practiceFormTest() throws InterruptedException {
		practiceForm.enterValueInPracticeForm("Suraj", "Anand", "surya@gmail.com", "9810100822", "1990", "0", "27");
	}
	
	
	@DataProvider
	public Object[][] getDataFromExcel() {
		Object[][] data = ExcelUtil.getTestData("Sheet1");
		return data;
	}
	
	@Test(dataProvider = "getDataFromExcel")
	public void practiceFormTestDDT(String firstname, String lastname, String email, String mobile, String year, String month, String date ) throws InterruptedException {
		practiceForm.enterValueInPracticeForm(firstname, lastname, email, mobile, year, month, date);
	}
	
}
