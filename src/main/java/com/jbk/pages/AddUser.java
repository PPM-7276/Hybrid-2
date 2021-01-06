package com.jbk.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.jbk.objectRepository.AddUserPageRepository;


public class AddUser extends AddUserPageRepository {
	WebDriver driver = null;
	int cityData = 0;
	List<WebElement> radio;
	String gender = "Male";
	
	Logger logger = Logger.getLogger("java");

	public AddUser(WebDriver driver) {
		super(driver);
		
	}

	public void userPage() {
		users.click();
	}

	public void addUserPage() {
		adduser.click();
		logger.info("inside Add user file");
	}

	// all Lable Methods
   // all text area check
	public String addUserTextCheck() {
	
		String adduserText = addUserText.getText();
		logger.info("Add user text check...");
		return adduserText;
	}

	public String usernameLableCheck() {
		String unameLab = unameLable.getText();
		return unameLab;
	}

	public String mobileLableCheck() {
		String mobileLab = mobileLable.getText();
		return mobileLab;
	}

	public String emailLableCheck() {
		String emailLab = emailLable.getText();
		return emailLab;
	}

	public String courseLableCheck() {
		String courseLab = courseLable.getText();
		return courseLab;
	}

	public String genderLableCheck() {
		String gendereLab = genderLable.getText();
		return gendereLab;
	}

	public String stateLableCheck() {
		String stateLab = stateLable.getText();
		return stateLab;
	}

	public String passLableCheck() {
		String passwordLab = passLable.getText();
		return passwordLab;
	}

	// all Placeholder Methods
	public String getPlcaeholderUserName() {
		String username = usernamePlctxt.getAttribute("Placeholder");
		usernamePlctxt.sendKeys("Tushar");
		//System.out.println("Plceholder Text : " + username);
		logger.info("Plceholder Text : " + username);
		return username;
	}

	public String getPlcaeholderMobile() {
		String mob = mobilePlctxt.getAttribute("Placeholder");
		mobilePlctxt.sendKeys("9021475448");
		//System.out.println("Plceholder Text : " + mob);
		logger.info("Plceholder Text : " + mob);

		return mob;
	}

	public String getPlcaeholderEmail() {
		String email = emailPlctxt.getAttribute("Placeholder");
		emailPlctxt.sendKeys("tushar@gmail.com");
		//System.out.println("Plceholder Text : " + email);
		logger.info("Plceholder Text : " + email);
		return email;
	}

	public String getPlcaeholderCourses() {
		String courses = coursesPlctxt.getAttribute("Placeholder");
		coursesPlctxt.sendKeys("Seleneum");
		//System.out.println("Plceholder Text : " + courses);

		logger.info("Plceholder Text : " + courses);

		return courses;
	}

	public String getPlcaeholderPassword() {
		String password = passPlctxt.getAttribute("Placeholder");
		passPlctxt.sendKeys("123456");
		//System.out.println("Plceholder Text : " + password);

		logger.info("Plceholder Text : " + password);

		return password;
	}
	public String genderCheck(){
		radio_Gender.click();
		return gender;		
}
}
