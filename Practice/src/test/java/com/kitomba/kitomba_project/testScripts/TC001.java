package com.kitomba.kitomba_project.testScripts;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.kitomba.kitomba_project.pageActions.LoginPage;

import testBase.TestBase;

public class TC001 extends TestBase{

static LoginPage loginpage;


@BeforeClass

public void testSetUp() throws IOException{
	
	init();
	loginpage=new LoginPage(wd);
	}

@Test

public void loginTest(){
loginpage.enterEmail(email_value);
loginpage.enterPassword(password_value);
}


@AfterClass

public  void loginTestShutdown(){
	
	closeBrowser();



}}





