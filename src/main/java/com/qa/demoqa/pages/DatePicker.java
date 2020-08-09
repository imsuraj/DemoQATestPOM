package com.qa.demoqa.pages;


/**
 * @author SurajAnand
 *
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.demoqa.base.BasePage;
import com.qa.demoqa.util.ElementUtil;

public class DatePicker extends BasePage{
	private WebDriver driver;

	public DatePicker(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
	}


	By datePickerMonthYearInput = By.id("datePickerMonthYearInput");
	By dateAndTimePickerInput = By.id("dateAndTimePickerInput");
	By month = By.xpath("//select[@class='react-datepicker__month-select']");
	By year = By.xpath("//select[@class='react-datepicker__year-select']");
	By date = By.xpath("//div[@class='react-datepicker__week']//div");
	By mnth = By.xpath("//div[@class='react-datepicker__month-dropdown']//div");
	By yr = By.xpath("//div[@class='react-datepicker__year-dropdown']//div");
	By time = By.xpath("//ul[@class='react-datepicker__time-list']//li");

	
	
	public void selectDate(String month, int year, int date) {
		eu.doClick(datePickerMonthYearInput);
		eu.doSelectByVisibleText(this.month, month);
		eu.doSelectByVisibleText(this.year, String.valueOf(year));
		eu.selectDropDownValueWithoutSelect(this.date, String.valueOf(date));
	}
	
	public void selectDateAndTime(String month, int year, int date, String time) {
		eu.doClick(dateAndTimePickerInput);
		
		eu.selectDropDownValueWithoutSelect(mnth, month);
		eu.selectDropDownValueWithoutSelect(yr, String.valueOf(year));
		eu.selectDropDownValueWithoutSelect(this.date, String.valueOf(date));
		eu.selectDropDownValueWithoutSelect(this.time, time);
	}
}




