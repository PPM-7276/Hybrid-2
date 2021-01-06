package com.jbk.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.Dashboardpage;
import com.jbk.pages.LoginPageS;

public class DashboardTest extends BaseTest {

	Dashboardpage dp;
	WebDriver driver;
	//driver
	@BeforeMethod
	public void setUp() throws Exception {
	
		driver = initializedriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		LoginPageS lp=new LoginPageS(driver);
		lp.nevigeteToDashboard();
		dp=new Dashboardpage(driver);
		}
	
	@Test(priority = 1)
	  public void validCourses() {
		  Assert.assertTrue(dp.checkCourses(driver));
	  }
	
	@Test(priority = 2)
	public void SubCourses() {
		Assert.assertTrue(dp.checkSubCourses());
	}

	@Test(priority = 3)
	public void IsClickable() {
		Assert.assertTrue(dp.buttonIsClickable());
	}

	@Test(priority = 4)
	public void WithWindowsHandles() {
		Assert.assertTrue(dp.verifyMoreInfoWithWindowsHandles());
	}

	@Test(priority = 5)
	public void logoutButton() {
		Assert.assertTrue(dp.logoutButtonWorking());
	}

	@Test(priority = 6)
	public void checkUrl() {
		Assert.assertTrue(dp.checkDashboardUrl());
	}
	
	@Test(priority = 7)
	public void navigationToUser() {
		dp.navigateToUserPage();
	}
	
	@Test(priority = 8)
	public void navigationToOperator() {
		dp.navigateToOperatorsPage();
	}
	
	@Test(priority = 9)
	public void navigationToUsefulLinks() {
		dp.navigateToUsefulLinksPage();
	}
	
	@Test(priority = 10)
	public void navigationToDownload() {
		dp.navigateToDownloadsPage();
	}
	
	@Test(priority = 11)
	public void navigationToHome() {
		dp.navigateHomePage();
	}
	
	/*
	 * @Test(priority = 11) public void dashboardTest() { dp.sidebarList(); }
	 */
	
	@AfterMethod
	public void closeBrowser()
	{
		if(null!=driver)
		{
			driver.close();
			driver.quit();
		}
	}
	
}
