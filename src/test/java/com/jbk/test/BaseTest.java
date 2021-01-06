package com.jbk.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.jbk.factory.BrowserFactory;
import com.jbk.utility.LoadPropertyWithSingleton;

public class BaseTest {
	public static WebDriver wd;
	public Properties prop;

	public WebDriver initializedriver() throws Exception {

		String browserName = LoadPropertyWithSingleton.someobject().getValueForANyProperty("username");
		System.out.println(browserName);

		WebDriver driver = BrowserFactory.browserInstance(browserName);
		
		return driver;
	}
}
