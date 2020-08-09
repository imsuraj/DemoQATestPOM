package com.qa.demoqa.base;

/**
 * @author SurajAnand
 *
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.qa.demoqa.util.ElementUtil;
import com.qa.demoqa.util.JavaScriptUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	WebDriver driver;
	public Properties prop;
	public ElementUtil eu;
	public JavaScriptUtil js;



	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();

	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}


	public WebDriver init_driver(Properties prop) {

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			//driver = new ChromeDriver();

			tlDriver.set(new ChromeDriver());

		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			//driver = new FirefoxDriver();
			tlDriver.set(new FirefoxDriver());

		} else if (browserName.equalsIgnoreCase("safari")) {
			WebDriverManager.getInstance(SafariDriver.class).setup();
			//driver = new SafariDriver();
			tlDriver.set(new SafariDriver());
		}

		//driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		//driver.get(prop.getProperty("url"));

		getDriver().get(prop.getProperty("url"));

		//return driver;

		return getDriver();

	}


	public Properties init_prop() {
		prop = new Properties();
		String path = "./src/main/java/com/qa/demoqa/config/config.properties";

		try {

			FileInputStream ip = new FileInputStream(path);
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;
	}

	/**
	 * this method will take the screenshot
	 */
	public String getScreenshot() {

		File src = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "/screenshots/" + System.currentTimeMillis() + ".png";
		File destination = new File(path);
		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return path;

	}

}
