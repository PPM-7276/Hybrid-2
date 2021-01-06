package com.jbk.objectRepository;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPageRepository {

	public WebDriver driver;
	String namvalue;

	public AddUserPageRepository(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(id = "email")
	public WebElement email;

	@FindBy(id = "password")
	public WebElement pass;

	@FindBy(xpath = "//button[contains(text(),'Sign In')]")
	public WebElement signbtn;

	@FindBy(xpath = "//span[text()='Users']")
	public WebElement users;

	@FindBy(xpath = "//button[text()='Add User']")
	public WebElement adduser;

	// all labels

	@FindBy(xpath = "//h1[text()='Add User']")
	public WebElement addUserText;

	@FindBy(xpath = "//h1[text()='Add User']")
	public WebElement addUserText1;

	@FindBy(xpath = "//label[text()='Username']")
	public WebElement unameLable;

	@FindBy(xpath = "//label[text()='Mobile']")
	public WebElement mobileLable;

	@FindBy(xpath = "//label[text()='Email']")
	public WebElement emailLable;

	@FindBy(xpath = "//label[text()='Courses']")
	public WebElement courseLable;

	@FindBy(xpath = "//label[text()='Gender']")
	public WebElement genderLable;

	@FindBy(xpath = "//input[@name='gender' and @type='radio']")
	public WebElement radio_Gender;

	/*
	 * @FindBy(xpath = "//label[text()='Gender']") public WebElement
	 * genderMaleRadio;
	 */

	@FindBy(xpath = "//label[text()='State']")
	public WebElement stateLable;

	@FindBy(xpath = "//label[text()='Password']")
	public WebElement passLable;

	// place holder

	@FindBy(id = "username")
	public WebElement usernamePlctxt;

	@FindBy(id = "mobile")
	public WebElement mobilePlctxt;

	@FindBy(id = "email")
	public WebElement emailPlctxt;

	@FindBy(id = "course")
	public WebElement coursesPlctxt;

	@FindBy(id = "Male")
	public WebElement malePlctxt;

	@FindBy(xpath = "//select//option")
	public WebElement selectPlctxt;

	@FindBy(id = "password")
	public WebElement passPlctxt;

}