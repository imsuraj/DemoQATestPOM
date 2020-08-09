package com.qa.demoqa.tests;


/**
 * @author SurajAnand
 *
 */


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.Interactions;
import com.qa.demoqa.pages.Sortable;

public class SortableTest extends BaseTest {
	
	public Interactions interactions;
	public Sortable sortable;
	
	@BeforeClass
	public void classSetUp() {
		interactions = homePage.doClickInteractions();
		sortable =interactions.doClickSortable();
	}
	
	
	@Test
	public void sortableTest() throws InterruptedException {
	
		sortable.verifySortableList(0, 3);
		sortable.clickGridTab();
		sortable.verifySortableGrid(0, 3);
	}
	
	
	
}
