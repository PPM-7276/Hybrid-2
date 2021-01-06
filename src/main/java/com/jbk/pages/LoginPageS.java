package com.jbk.pages;

import java.rmi.activation.ActivateFailedException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*import org.testng.Assert;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.event.MSGestureEvent;*/
import com.jbk.objectRepository.LoginPageObjectRepository;

import okhttp3.internal.http.RetryAndFollowUpInterceptor;

public class LoginPageS extends LoginPageObjectRepository {
	public WebDriver driver;

	public LoginPageS(WebDriver driver) {
		PageFactory.initElements(driver, this);
		/* this.driver=driver; */
		boolean flag;
	}

	// For verifying JBK logo//
	public boolean verifyLogo(WebDriver driver) {

		return true;

	}

	// for checking text "Java By Kiran"//
	public boolean verifyJbkText(WebDriver driver) {

		String actText = jbktext.getText();
		String expText = "Java By Kiran";
		if (actText.equals(expText)) {
			return true;
		} else {
			return false;
		}

	}

	public boolean verifyJavaText(WebDriver driver) {

		String actText1 = jbktext1.getText();
		String expText1 = "JAVA | SELENIUM | PYTHON";

		if (actText1.equals(expText1)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifysigiintext(WebDriver driver) {

		String actText = signIn_text.getText();
		String expText = "Sign in to start your session";
		if (actText.equals(expText)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifyPlHolder(WebDriver driver) {

		WebElement plholder = driver.findElement(By.id("email"));
		String actplholder = plholder.getAttribute("placeholder");
		String expplholder = "Email";

		if (actplholder.equals(expplholder)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifyPlHolder1(WebDriver driver) {
		WebElement plholder1 = driver.findElement(By.id("password"));
		String actplholder1 = plholder1.getAttribute("placeholder");
		String expplholder1 = "Password";
		if (actplholder1.equals(expplholder1)) {
			return true;
		} else {
			return false;
		}

	}

	public Dashboardpage nevigeteToDashboard() {

		email_placeholder.sendKeys("kiran@gmail.com");
		password_placeholder.sendKeys("123456");
		button.click();
		return new Dashboardpage(driver);
	}

	public boolean loginCred(WebDriver driver) {

		email_placeholder.sendKeys("kiran@gmail.com");
		password_placeholder.sendKeys("123456");
		button.click();
		String expTitle = "JavaByKiran | Dashboard";
		String actTitle = driver.getTitle();
		if (actTitle.equals(expTitle)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean errorMsg(WebDriver driver) {

		email_placeholder.sendKeys("sanket@gmail.com");
		button.click();
		String actmsg = emailErrormsg.getText();
		System.out.println("actmsg is:" + actmsg);
		String expmsg = "Please enter email as kiran@gmail.com";
		if (actmsg.equals(expmsg)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean dashboardLogout(WebDriver driver) {
		driver.get(
				"file:///C:/Users/User/Desktop/JBK%20Documents/Offline%20website/Offline%20website/pages/examples/dashboard.html");
		driver.manage().window().maximize();
		log_out.click();

		String actmsg = logout_msg.getText();
		String expmsg = "Logout successfully";
		if (actmsg.equals(expmsg)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean errorMsg1(WebDriver driver) {
		password_placeholder.sendKeys("456132");
		button.click();
		String actmsg = passwordErrormsg.getText();
		System.out.println("actmsg is:" + actmsg);
		String expmsg = "Please enter password 123456";
		if (actmsg.equals(expmsg)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean errorMsgwithoutemail(WebDriver driver) {

		email_placeholder.sendKeys("");
		button.click();
		String actmsg = emailErrormsg.getText();
		System.out.println("act msg is:" + actmsg);
		String expmsg = "Please enter email.";
		if (actmsg.equals(expmsg)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean errorMsgwithoutpassword(WebDriver driver) {
		button.click();
		String actmsg = passwordErrormsg.getText();
		String expmsg = "Please enter password.";
		if (actmsg.equals(expmsg)) {
			return true;
		} else {
			return false;
		}

	}

	public boolean newRegLink(WebDriver driver) {
		regLink.click();
		driver.get(
				"file:///C:/Users/User/Desktop/JBK%20Documents/Offline%20website/Offline%20website/pages/examples/register.html");
		String expTitle = "JavaByKiran | Registration Page";
		String actTitle = driver.getTitle();
		if (actTitle.equals(expTitle)) {
			return true;
		} else {
			return false;
		}
	}

	// code written by Vishal

	boolean r;

	public boolean getText() {
		
		String Newgen = newRegLink.getText();
		String expectedtxt = "Register a new membership";
		System.out.println(Newgen);
		if (Newgen.equals(expectedtxt)) {
			r = true;
		} else
			r = false;

		return r;

	}

	public boolean clickBtn(WebDriver d) {
		newRegLink.click();
		String expectedurl = "file:///C:/Offline%20website/pages/examples/register.html";
		String acturl = d.getCurrentUrl();
		if (acturl.equals(expectedurl)) {
			r = true;
		} else
			r = false;

		return r;
	}

}
