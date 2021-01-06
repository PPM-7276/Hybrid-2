package com.jbk.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.UsersPage;
import com.jbk.utility.UserspageDataProvider;

public class UserTest {
     public  WebDriver driver=null;
     UsersPage up=new UsersPage(driver);
	
	 @BeforeMethod
	 public void browserOpen(){
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		    driver=new ChromeDriver();
			driver.get("file:///D:/Offline%20website/Offline%20website/index.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
			
			driver.findElement(By.id("password")).sendKeys("123456");
			
			driver.findElement(By.xpath("//button")).click();
			driver.findElement(By.xpath("//span[text()='Users']")).click();
			
	 }
	 
	 @AfterMethod
	 public void browserClose(){
		 
		 driver.close();
	 }
	
	 @Test(priority = 1)
	 public void testTitle() throws InterruptedException{
			Assert.assertTrue(up.checkTitle(driver));
		 
	 }
	 
	 @Test(priority = 2)
	 public void userPage() throws InterruptedException {
			Assert.assertTrue(up.checkUsesrPage(driver));
	 }
      
	 
	 @Test(priority = 3)
		public void texCopyright() {
		 Assert.assertTrue(up.isCopyRightTextValid(driver));
		    }
		
		@Test(priority = 4)
		public void textDesignedForSelenium() {
			 Assert.assertTrue(up.isDesignForTextValid(driver));
		    }
		
		@Test(priority = 5)
		public void buttonClick() throws InterruptedException {
			 Assert.assertTrue(up.checkAddUserbtn());
		    }
		
		@Test(priority = 6)
		public void checkLink() throws InterruptedException {
			 Assert.assertTrue(up.checkJavaByKiranLink(driver));
		    }
		
		@Test(priority = 7)
		public void checkHeaders() throws InterruptedException {
			 Assert.assertTrue(up.checkTableHeading());
		    }
		
		@Test(priority = 8)
		public void checkurl() throws InterruptedException {
			 Assert.assertTrue(up.checkHomeLinkUserPage(driver));
		    }
		
		@Test(priority = 9)
		public void chkClickable() {
			Assert.assertTrue(up.buttonIsClickable());
		}

		@Test(priority = 10)

		public void chklogoutButton() {
			Assert.assertTrue(up.logoutButtonWorking());
		}
		
		@Test(priority = 11)
		public void chkNoOfDeleteButton() throws InterruptedException {
			 Assert.assertTrue(up.checkNoOfDeleteButtons());
		    }
		
		@Test(priority = 12)
		public void chkNoOfRows() throws InterruptedException {
			 Assert.assertTrue(up.checkNoOfRows());
		    }
		
		@Test(priority = 13)
		public void validateHeader() {
		 Assert.assertTrue(up.checkHeaderCount(driver));
		    }
		
		@Test(priority = 14)
		public void emailSuffix() {
		 Assert.assertTrue(up.checkEmailSuffix(driver));
		    }
		
		@Test(priority = 15 , dataProviderClass=UserspageDataProvider.class, dataProvider="spanData")
		public void checkHeaders(String expHeader) throws Exception {
		 Assert.assertTrue(up.verifyHeader(expHeader));
		    }
		

		@Test(priority = 16 , dataProviderClass=UserspageDataProvider.class, dataProvider="headerData")
		public void checkHeaders(String srNum,String name, String email, String mobile, String course, String gender, String state) throws Exception {
		 Assert.assertTrue(up.verifyUserData(srNum, name, email, mobile, course, gender, state));
		    }
		
		}


