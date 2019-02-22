package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.pagelist.Pagelist;
import com.testpage.Testpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef {
	
	WebDriver driver;
	Pagelist pf;
	@Given("^logged in  homepage$")
	public void logged_in_homepage() throws Throwable {
		
		
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			driver=new ChromeDriver();
			pf=PageFactory.initElements(driver,Pagelist.class);
			driver.get(pf.getUrl());
			driver.manage().window().maximize();}
			
	}
	

	@When("^i click signin button$")
	public void i_click_signin_button() throws Throwable {
		
		pf.getClickSignInButton().click();
	}

	@When("^i enter valid username$")
	public void i_enter_valid_username() throws Throwable {
		
		pf.getUnameBox().sendKeys(pf.getUname());
	   
	}

	@When("^i enter valid password$")
	public void i_enter_valid_password() throws Throwable {
	
		pf.getUpassBox().sendKeys(pf.getUpass());
	}

	@When("^i click signin$")
	public void i_click_signin() throws Throwable {
		
		pf.getClickSignIn().click();
	}

	@Then("^i succesfully signed in restaurant\\.com$")
	public void i_succesfully_signed_in_restaurant_com() throws Throwable {
		
		  
	}



}
