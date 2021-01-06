package com.jbk.test;


import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.jbk.pages.Dashboardpage;
import com.jbk.pages.LoginPageS;
import com.jbk.pages.OperatorPage;
import com.jbk.pages.UsefulLinksPage;
import com.jbk.utility.ExtentReporterNG;
import com.jbk.utility.OperatorPageDataProvider;

public class OperatorPageTestCases extends BaseTest{
	ExtentReports extent=ExtentReporterNG.getObject("OperatorPage");
	ExtentTest test;
	WebDriver wd;
    OperatorPage op;
    Dashboardpage dp;
	LoginPageS lp;
	
	@BeforeMethod
	public void openBrowser() throws Exception {
		wd= initializedriver();
		wd.get(prop.getProperty("url"));
		wd.manage().window().maximize();
		LoginPageS lp = new LoginPageS(wd);
		lp.nevigeteToDashboard();
		Dashboardpage dp = new Dashboardpage(wd);
		dp.navigateToOperatorsPage();
		op=new OperatorPage(wd);
    }
	
	@BeforeClass
	public void createnode(){
		test=extent.createTest("Operator  page");
		test.createNode("Test cases for Operator  page");
	}
	
	@Test(priority=1)
	public void verifyPageHeading() {
		ExtentTest test1=test.createNode("verifyPageHeading");
		Assert.assertTrue(op.isValidHeading());
		extent.flush();
	}
	
	@Test(priority=2)
	public void verifyTableHeaderCount() {
		ExtentTest test1=test.createNode("verifyTableHeaderCount");
		Assert.assertTrue(op.isHeaderCountValid());
		extent.flush();
	}
	
	@Test(dataProviderClass=OperatorPageDataProvider.class,dataProvider="getHeaderData",priority=3)
	public void verifyTableHeaders(String id, String person, String reason, String wayOfConnect, String contact,
			String timing) throws Exception {
		List<String> expHeader = new ArrayList<String>();
		expHeader.add(id);
		expHeader.add(person);
		expHeader.add(reason);
		expHeader.add(wayOfConnect);
		expHeader.add(contact);
		expHeader.add(timing);
		ExtentTest test1=test.createNode("verifyTableHeaders");
		Assert.assertEquals(op.getTableHeaders(), expHeader);
		extent.flush();
	}
	
	@Test(priority=4)
	public void validateMobileNoSize() {
		ExtentTest test1=test.createNode("validateMobileNoSize");
		Assert.assertTrue(op.isMobileNoSizeValid());
		extent.flush();
	}
	
	@Test(priority=5)
	public void verifyPageHeader() {
		ExtentTest test1=test.createNode("verifyPageHeader");
		Assert.assertTrue(op.isValidPageHeading());
		extent.flush();
	}
	
	@Test(priority=6)
	public void verifyTableHeading() {
		ExtentTest test1=test.createNode("verifyTableHeading");
		Assert.assertTrue(op.isValidTableHeading());
		extent.flush();
	}
	
	@Test(priority=7)
	public void validateTableHeader() throws Exception {
		ExtentTest test1=test.createNode("validateTableHeader");
        Assert.assertTrue(op.isValidTableHeader());
		extent.flush();
	}
	
	@Test(priority=8)
	public void validateTableData() throws Exception {
		ExtentTest test1=test.createNode("validateTableData");
		Assert.assertTrue(op.isValidTableData());
		extent.flush();
	}
	
	@Test(priority=9)
	public void validatePersonNames() throws Exception {
		ExtentTest test1=test.createNode("validatePersonNames");
		Assert.assertTrue(op.isValidPersonNames());
		extent.flush();
	}
	
	@Test(priority=10)
	public void validateTableSize() throws Exception {
		ExtentTest test1=test.createNode("validateTableSize");
		Assert.assertTrue(op.isValidTableSize());
		extent.flush();
	}

	@AfterMethod
	public void closeBrowser() {
		wd.close();
	}
}


