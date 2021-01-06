package com.jbk.test;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.Dashboardpage;
import com.jbk.pages.LoginPage;
import com.jbk.pages.LoginPageS;
import com.jbk.pages.UsefulLinksPage;



public class LoginPageTest extends BaseTest{
	
	public WebDriver driver;
    public	LoginPageS lp=null;
    LoginPage lP;

	@BeforeMethod
	public void loadurl() throws Exception {
		driver = initializedriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		LoginPageS lp = new LoginPageS(driver);
		lp.nevigeteToDashboard();
		Dashboardpage dp = new Dashboardpage(driver);
		dp.navigateToUsefulLinksPage();
		lP = new LoginPage(driver);
	}

	@AfterMethod
	public void closeDriver() {
		driver.close();
	}

	@Test(priority = 1)
	public void validateLogo() {

		Assert.assertTrue(lp.verifyLogo(driver));

	}

	@Test(priority = 2)
	public void validateJbkText() {

		Assert.assertTrue(lp.verifyJbkText(driver));
	}

	@Test(priority = 3)
	public void validateJavaText() {

		Assert.assertTrue(lp.verifyJavaText(driver));
	}

	@Test(priority = 4)
	public void validateSignInText() {

		Assert.assertTrue(lp.verifysigiintext(driver));
	}

	@Test(priority = 5)
	public void validatePlHolder() {

		Assert.assertTrue(lp.verifyPlHolder(driver));
	}

	@Test(priority = 6)
	public void validatePlHolder1() {

		Assert.assertTrue(lp.verifyPlHolder1(driver));
	}

	@Test(priority = 7)
	public void validateLoginCred() {
		Assert.assertTrue(lp.loginCred(driver));
	}

	@Test(priority = 7)
	public void validateLogoutmsg() {
		Assert.assertTrue(lp.dashboardLogout(driver));
	}

	@Test(priority = 8)
	public void validateEmailErrorMsg() {

		Assert.assertTrue(lp.errorMsg(driver));
	}

	@Test(priority = 9)
	public void validatePassErrorMsg() {

		Assert.assertTrue(lp.errorMsg1(driver));
	}

	@Test(priority = 10)
	public void validateErrorMsgWithoutEmail() {

		Assert.assertTrue(lp.errorMsgwithoutemail(driver));
	}

	@Test(priority = 11)
	public void validateErrorMsgWithoutPassword() {

		Assert.assertTrue(lp.errorMsgwithoutpassword(driver));
	}

	@Test(priority = 12)
	public void validateNewRegLink() {

		Assert.assertTrue(lp.newRegLink(driver));
	}
}
   
 
