package com.jbk.test;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 

import com.jbk.pages.LoginPageS;
import com.jbk.pages.RegsPage;

public class RegistrationPageTest extends BaseTest {
	WebDriver driver = null;
	LoginPageS lp;
	RegsPage rp;
	
	boolean r;
	
	 
	@BeforeMethod
	public void openBrowser() throws Exception {
		
		driver=initializedriver();
	driver.get("file:///C:/Offline%20website/index.html");
		lp = new LoginPageS(driver);
		rp = new RegsPage(driver);

	}

	@AfterMethod
	public void browserClose() {
		driver.close();
	}

	@Test(priority = 1)
	public void checkText() {		//Register a new membership Text Check..
		 
		r= lp.getText();
		Assert.assertEquals(r, true);
	}

	@Test(priority = 2)
	public void regnewdurl() {
		// URL check
		Assert.assertEquals(lp.clickBtn(driver), true);
	}

	@Test(priority = 3)
	public void dataWithoutName() {
		// without name
		lp.clickBtn(driver);
		// String Error =rp.withoutName();
		// Assert.assertEquals("Please enter Name.", Error);
		Assert.assertEquals(rp.withoutName(), true);
	}

	@Test(priority = 4)
	public void dataWithoutMobile() {
		// without Mobile
		lp.clickBtn(driver);
		// String Error =rp.withoutMobile();
		// Assert.assertEquals("Please enter Mobile.", Error);
		r = rp.withoutMobile();
		Assert.assertEquals(r, true);

	}

	@Test(priority = 5)
	public void dataWithoutEmail() {
		// without Email
		lp.clickBtn(driver);
		// String Error = rp.withoutEmail();
		// Assert.assertEquals("Please enter Email.", Error);
		r = rp.withoutEmail();
		Assert.assertEquals(r, true);
	}

	@Test(priority = 6)
	public void dataWithoutPassword() {
		// without password
		lp.clickBtn(driver);
		// String Error = rp.withoutPass();
		// Assert.assertEquals("Please enter Password.", Error);
		r = rp.withoutPass();
		Assert.assertEquals(r, true);
	}

	@Test(priority = 7)
	public void allData() throws Exception {
		// alldata
		lp.clickBtn(driver);
		rp.allData();
		rp.alerthandle(driver);
	}

	@Test(priority = 8)
	public void buttonTxt() { // SignIn Button Text Check
		lp.clickBtn(driver);
		r = rp.getSignButtonText();
		Assert.assertEquals(r, true);
	}

	@Test(priority = 9)
	public void jbkTextCheck() { // JavaByKiran TextCheck
		lp.clickBtn(driver);
		r = rp.getJbkHead();
		Assert.assertEquals(r, true);
	}

	@Test(priority = 10)
	public void txtCheck2() {
		// Register a new membership Text Check
		lp.clickBtn(driver);
		r = rp.getNewRegLabel();
		Assert.assertEquals(r, true);
	}

	@Test(priority = 11)
	public void txtCheck3() { // I already have a membership Text Check
		lp.clickBtn(driver);
		r = rp.getAlredyMemberLabel();
		Assert.assertEquals(r, true);
	}

	// Placeholder TEST
	@Test(priority = 12)
	public void verifyPlaceHoldersName() { // Name
		lp.clickBtn(driver);
		r = rp.getPlcaeholderName();
		Assert.assertEquals(r, true);
	}

	@Test(priority = 13)
	public void verifyPlaceHoldersMobile() { // Mobile
		lp.clickBtn(driver);
		r = rp.getPlcaeholderMobile();
		Assert.assertEquals(r, true);
	}

	@Test(priority = 14)
	public void verifyPlaceHoldersemail() { // Email
		lp.clickBtn(driver);
		r = rp.getPlcaeholderEmail();
		Assert.assertEquals(r, true);
	}

	@Test(priority = 15)
	public void verifyPlaceHolderspass() { // Password
		lp.clickBtn(driver);
		r = rp.getPlcaeholderPass();
		Assert.assertEquals(r, true);
	}

	@Test(priority = 16)
	public void verifyGoLinksWithWindowsHandles() {	//JBK new Page
		lp.clickBtn(driver);
		r=rp.logoPageCheck();
		Assert.assertEquals(r, true);
		driver.navigate().back();

	}

	@Test(priority = 17)
	public void mainPageUrl() {			//AlreadyMember click
		lp.clickBtn(driver);
		r = rp.alredyMemberClick();
		Assert.assertEquals(r, true);}
	
	
	@Test(priority = 18)
	public void check(){
		String url=prop.getProperty("url1");
		System.out.println(url);
		driver.get(url);
	}

}