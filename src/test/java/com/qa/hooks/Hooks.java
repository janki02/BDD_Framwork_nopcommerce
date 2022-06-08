package com.qa.hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.Factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	private WebDriver driver;
	private Properties prop;
	private ConfigReader configReader;
	private DriverFactory driverFactory;
	@Before(order = 0)
	public void getproperties() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}

	@Before(order = 1)
	public void lounchBrowser() {
		String browser= prop.getProperty("browser");
	
		driverFactory = new DriverFactory();
		driver= driverFactory.init_driver(browser);
	}

	@After(order = 0)
	public void teardown() {
		driver.quit();
	}

	@After(order = 1)
	public void screenshot(Scenario scenario) {
		if (scenario.isFailed()) {
			String sc = scenario.getName().replace(" ", "_");
			byte b[] = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(b, "image/png", sc);
		}

	}
}
