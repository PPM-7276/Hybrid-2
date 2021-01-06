package com.jbk.objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRepository {
	
	@FindBy(xpath="//a[contains(@href,'add_user.html'//button")
	public WebElement addButton ;
	
	@FindBy(xpath="/html/body/div[1]/footer/strong/a")
	public WebElement link ;
	
	@FindBy(xpath="//a[@href='#']")
	public WebElement url;

	@FindBy(xpath="//table/tbody/tr/td[3])")
	public List<WebElement> emailColumn;

	@FindBy(xpath="//tbody/tr/th")
	public WebElement header;
	
	@FindBy(xpath="//th")
	public List<WebElement> hd;
	
	@FindBy(xpath="//table/tbody/tr/td[8]")
	public List<WebElement> deleteButtonNo;
	
	@FindBy(xpath="//table/tbody/tr")
	public List<WebElement> noOfRows;
	
	@FindBy(xpath="//a[text()='LOGOUT']")
	public WebElement logoutButton;
	
	@FindBy(xpath="//a[text()='LOGOUT']")
	public WebElement buttonIsClickable;
	
	@FindBy(xpath="//footer/strong[1]")
	public WebElement textCopyright;
	
	@FindBy(xpath="//footer[@class='main-footer']/div")
	public WebElement textDesignedForSelenium;
	
	
	

}
 