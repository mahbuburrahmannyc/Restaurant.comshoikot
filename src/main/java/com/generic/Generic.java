package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.pagelist.Pagelist;

public class Generic {
	WebDriver driver;
	Pagelist pf;
	public void getSetup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		pf=PageFactory.initElements(driver,Pagelist.class);
		driver.get(pf.getUrl());
		driver.manage().window().maximize();}
		
	public void signin() {
	pf.getClickSignInButton().click();
	pf.getUnameBox().sendKeys(pf.getUname());
	pf.getUpassBox().sendKeys(pf.getUpass());
	pf.getClickSignIn().click();
	
		
		
		
	
	}
	
	
}
