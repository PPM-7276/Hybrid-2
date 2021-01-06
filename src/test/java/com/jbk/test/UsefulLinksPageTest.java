package com.jbk.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.jbk.pages.Dashboardpage;

import com.jbk.pages.LoginPageS;
import com.jbk.pages.UsefulLinksPage;
import com.jbk.utility.ExtentReporterNG;


public class UsefulLinksPageTest extends BaseTest  {
	
	ExtentReports extent=ExtentReporterNG.getObject("UsefulLinksPage");
	ExtentTest test2;
	UsefulLinksPage up;
	Dashboardpage dp;
	LoginPageS lp;

	@BeforeMethod
	public void initialise() throws Exception {

		wd = initializedriver();
		wd.get(prop.getProperty("url"));
		wd.manage().window().maximize();
		LoginPageS lp = new LoginPageS(wd);
		lp.nevigeteToDashboard();
		Dashboardpage dp = new Dashboardpage(wd);
		dp.navigateToUsefulLinksPage();
		up = new UsefulLinksPage(wd);
	}

	@BeforeClass
	public void createnode() {
		test2 = extent.createTest("useful links page");
		test2.createNode("Test cases for useful links page");
	}

	@Test(priority = 0)
	public void pageTitle() {

		ExtentTest test = test2.createNode("pageTitle");
		Assert.assertTrue(up.ispageTitleValid(test));
		extent.flush();
	}

	@Test(priority = 1)
	public void text_usefulLinks() {

		ExtentTest test = test2.createNode("text_usefulLinks");
		Assert.assertTrue(up.isUsefulLinkTextValid(test));
		extent.flush();
	}

	@Test(priority = 2)
	public void text_internetRequired() {

		ExtentTest test = test2.createNode("text_internetRequired");
		Assert.assertTrue(up.isInternetRequiredTextValid(test));
		extent.flush();
	}

	@Test(priority = 3)
	public void text_copyright() {

		ExtentTest test = test2.createNode("text_copyright");
		Assert.assertTrue(up.isCopyRightTextValid(test));
		extent.flush();
	}

	@Test(priority = 4)
	public void text_designedForSelenium() {

		ExtentTest test = test2.createNode("pageTitle");
		Assert.assertTrue(up.isDesignForTextValid(test));
		extent.flush();
	}

	@Test(priority = 5)
	public void LinksTitle() {

		ExtentTest test = test2.createNode("LinksTitle");
		Assert.assertTrue(up.isTitleofLinksValid(test));
		extent.flush();
	}

	@Test(priority = 6)
	public void totalLinks() {

		ExtentTest test = test2.createNode("totalLinks");
		Assert.assertTrue(up.isTotalNumberOfLinksValid(test));
		extent.flush();
	}

	@Test(priority = 7)
	public void brokenLinks() {

		ExtentTest test = test2.createNode("brokenLinks");
		Assert.assertFalse(up.isThereanyBrokenLink(test));
		extent.flush();
	}

	@Test(priority = 8)
	public void headers() {

		ExtentTest test = test2.createNode("headers");
		Assert.assertTrue(up.isheadersValid(test));
		extent.flush();
	}

	@Test(priority = 9)
	public void rowsData() {

		ExtentTest test = test2.createNode("rowsData");
		Assert.assertTrue(up.isRowDataValid(test));
		extent.flush();
	}

	@AfterMethod
	public void terardown() {
		wd.close();
	}
}
