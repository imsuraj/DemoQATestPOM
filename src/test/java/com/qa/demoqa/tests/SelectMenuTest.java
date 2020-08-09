package com.qa.demoqa.tests;


/**
 * @author SurajAnand
 *
 */


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.SelectMenu;
import com.qa.demoqa.pages.Widgets;

public class SelectMenuTest extends BaseTest {
	
	public Widgets widgets;
	public SelectMenu selectMenu;
	
	@BeforeClass
	public void classSetUp() {
		widgets = homePage.doClickWidgets();
		selectMenu = widgets.doClickSelectMenu();
	}
	
	
	@Test
	public void selectMenuTest() throws InterruptedException {
		selectMenu.selectOldStyleSelectMenu("Aqua");
		selectMenu.selectValue();
		selectMenu.selectOne();
		
	}
	
	
	
}
