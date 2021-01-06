package com.jbk.pages;

import org.openqa.selenium.WebDriver;

import com.jbk.objectRepository.AddUserPageRepository;


public class LoginPage_AddUser extends AddUserPageRepository {
	public LoginPage_AddUser(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void loginData() {
		email.sendKeys("kiran@gmail.com");
		pass.sendKeys("123456");
		signbtn.click();

	}
}
