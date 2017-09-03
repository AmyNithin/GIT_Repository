package com.kitomba.kitomba_project.pageActions;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testBase.TestBase;

public class LoginPage extends TestBase {
	
	WebDriver wd;
	
	public static Logger log=Logger.getLogger(LoginPage.class.getName());
	
	By Email=By.id("email");
	By Password=By.id("pass");



public LoginPage(WebDriver wd){
	
	this.wd=wd;
	
}

public void enterEmail(String email){
	
	log.info("clearing email field");
	wd.findElement(Email).clear();

	
	log.info("entering data to email field");
	wd.findElement(Email).sendKeys(email);
	
	
}

public void enterPassword(String password){
	
	log.info("clearing email field");
	wd.findElement(Email).clear();
	
	log.info("entering data to email field");
	wd.findElement(Password).sendKeys(password);
	
	
}







}