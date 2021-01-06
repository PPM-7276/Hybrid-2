package com.jbk.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjectRepository {
	@FindBy(xpath="//img")
	public WebElement verifyLogo;
	
	@FindBy(xpath="//b")
	 public WebElement jbktext;
	
	@FindBy(xpath="//h4")
	public WebElement jbktext1;
	
	@FindBy(xpath="//p")
	public WebElement signIn_text;
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement email_placeholder;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement password_placeholder;
	
	@FindBy(xpath="//button")
	public WebElement button;
	
	@FindBy(xpath="//a[text()='LOGOUT']")
	public WebElement log_out;
	
	@FindBy(xpath="//p[text()='Logout successfully']")
	public WebElement logout_msg;
	
	@FindBy(xpath="//div[@id='email_error']")
	public WebElement emailErrormsg;
	
	@FindBy(xpath="//div[@id='password_error']")
	public WebElement passwordErrormsg;
	
	@FindBy(xpath="//a[contains(text(),'Reg')]")
	public WebElement regLink;
	
	@FindBy(xpath="//a[contains(text(),'Register a new membership')]")
	public WebElement newRegLink;
	
}
//showing error in LoginPageJava as the X-path is removed//