package com.jbk.pages;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.jbk.objectRepository.RegPageRepository;
 

public class RegsPage extends RegPageRepository {

	WebDriver driver;
	boolean r;
	
	Logger logger = Logger.getLogger("RegsPage.class");
	
	public RegsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		}

	public Boolean getSignButtonText() {

		String Signtxt = signbtn.getText();
		String Expectedtext = "Sign In";
	
		logger.info(" Button Text : " + Signtxt);
		if (Signtxt.equals(Expectedtext)) {
			r = true;
		} else
			r = false;
	

		return r;
	}

	public boolean getJbkHead() {
		String jbtxt = jbktxt.getText();
		String Expectedtext = "Java By Kiran";
		logger.info("Heading Text : " + jbtxt);
		if (jbtxt.equals(Expectedtext)) {
			r = true;
		} else
			r = false;

		return r;
	}

	public boolean getNewRegLabel() {
		String newreglbl = newmwmtxt.getText();
		String Expectedtext = "Register a new membership";
		logger.info("Label Text : " + newreglbl);

		if (newreglbl.equals(Expectedtext)) {
			r = true;
		} else
			r = false;

		return r;
	}

	public boolean getAlredyMemberLabel() {
		String alabl = alredymemtxt.getText();
		String Expectedtext = "I already have a membership";
		logger.info("Label Text : " + alabl);
		if (alabl.equals(Expectedtext)) {
			r = true;
		} else
			r = false;

		return r;
	}

	// placeholder
	public boolean getPlcaeholderName() { // Name
		String naeval = unamePlctxt.getAttribute("Placeholder");
		String Expectedtext = "Name";
		logger.info("Plceholder Text : " + naeval);
		if (naeval.equals(Expectedtext)) {
			r = true;
		} else
			r = false;

		return r;
	}

	public boolean getPlcaeholderMobile() { // Mobile
		String Expectedtext = "Mobile";
		String naeval = mobilePlctxt.getAttribute("Placeholder");
		logger.info("Plceholder Text : " + naeval);
		if (naeval.equals(Expectedtext)) {
			r = true;
		} else
			r = false;

		return r;
	}

	public boolean getPlcaeholderEmail() { // Eamil
		String Expectedtext = "Email";
		String naeval = emailPlctxt.getAttribute("Placeholder");
		logger.info("Plceholder Text : " + naeval);
		if (naeval.equals(Expectedtext)) {
			r = true;
		} else
			r = false;

		return r;
	}

	public boolean getPlcaeholderPass() { // Password
		String Expectedtext = "Password";
		String naeval = passPlctxt.getAttribute("Placeholder");
		logger.info("Plceholder Text : " + naeval);
		if (naeval.equals(Expectedtext)) {
			r = true;
		} else
			r = false;

		return r;
	}

	public boolean withoutName() {
		mobilePlctxt.sendKeys("235698");
		emailPlctxt.sendKeys("visha@gmail.com");
		passPlctxt.sendKeys("1256");

		signbtn.click();

		String err = namerr.getText();
		System.out.print(err);
		String expectedError = "Please enter Name.";
		if (err.equals(expectedError)) {
			logger.info("Error msg Match");
			return true;
		} else {
			logger.info("Not match");

			return false;
		}

	}

	public Boolean withoutMobile() {
		unamePlctxt.sendKeys("Vishal");
		emailPlctxt.sendKeys("visha@gmail.com");
		passPlctxt.sendKeys("1256");
		Boolean r = null;
		signbtn.click();

		// String err = moberr.getText();
		// System.out.print(err);
		// return err;
		String err = moberr.getText();
		System.out.print(err);
		String expectedError = "Please enter Mobile.";
		if (err.equals(expectedError)) {
			logger.info("Error msg Match");
			r = true;
		} else {
			logger.info("Not match");

			r = false;
		}
		return r;

	}

	public Boolean withoutEmail() {

		unamePlctxt.sendKeys("Vishal");
		mobilePlctxt.sendKeys("235698");
		passPlctxt.sendKeys("1256");

		signbtn.click();
		Boolean r = null;
		String err = emailerr.getText();
		System.out.print(err);
		// return err;
		String expectedError = "Please enter Email.";
		if (err.equals(expectedError)) {
			logger.info("Error msg Match");
			r = true;
		} else {
			logger.info("Not match");

			r = false;
		}
		return r;
	}

	public Boolean withoutPass() {

		unamePlctxt.sendKeys("Vishal");
		mobilePlctxt.sendKeys("235698");
		emailPlctxt.sendKeys("visha@gmail.com");

		signbtn.click();
		Boolean r = null;
		String err = passerr.getText();
		System.out.print(err);
		// return err;
		String expectedError = "Please enter Password.";
		if (err.equals(expectedError)) {
			logger.info("Error msg Match");
			r = true;
		} else {
			logger.info("Not match");

			r = false;
		}
		return r;

	}

	public void allData() {
		unamePlctxt.sendKeys("Vishal");
		mobilePlctxt.sendKeys("235698");
		emailPlctxt.sendKeys("visha@gmail.com");
		passPlctxt.sendKeys("1256");

		signbtn.click();

	}

	public void alerthandle(WebDriver driver2) {
		Alert al = driver2.switchTo().alert();
		logger.info(" Alter Message :" + al.getText());
		al.accept();
	}

	public boolean logoPageCheck() {
		jbktxt.click();
		String url = "file:///C:/Offline%20website/index2.html";
		String expectedurl = driver.getCurrentUrl();
		logger.info(url + "  " + expectedurl);
		if (url.equals(expectedurl)) {
			r = true;
		} else
			r = false;

		return r;

	}

	public boolean alredyMemberClick() {
		alredymemtxt.click();
		String acturl = driver.getCurrentUrl();
		String expectedurl = "file:///C:/Offline%20website/index.html";
		logger.info(acturl + "  " + expectedurl);
		if (acturl.equals(expectedurl)) {
			r = true;
		} else
			r = false;

		return r;

	}

}