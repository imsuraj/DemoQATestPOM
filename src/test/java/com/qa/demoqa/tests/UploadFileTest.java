package com.qa.demoqa.tests;


/**
 * @author SurajAnand
 *
 */


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.Elements;
import com.qa.demoqa.pages.Upload;

public class UploadFileTest extends BaseTest{

	
	
	public Elements elements;
	public Upload upload;

	@BeforeClass
	public void classSetUp() {
		elements = homePage.doClickElements();
		upload = elements.doClickUploadSubMenu();
	}

	@Test (priority = 1, enabled = true)
	public void testDoubleClick() throws InterruptedException {
		upload.uploadFile("./sampleFile.jpeg");
	}


	
}
