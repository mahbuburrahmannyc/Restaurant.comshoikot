package com.pagelist;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pagelist {
	
	private String url=("https://www.restaurant.com/");
	private String uname=("alamsam476@gmail.com");
	private String upass=("zunaira2015");
	
	@FindBy(xpath="//*[@class=\"signIn\"]")
	private WebElement ClickSignInButton;
	@FindBy(xpath="//*[@id=\"email\"]")
	private WebElement UnameBox;
	@FindBy(xpath="//*[@id=\"password\"]")
	private WebElement UpassBox;
	@FindBy(xpath="//*[@class=\"btn btn-success has-spinner button green\"]")
	private WebElement ClickSignIn;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public WebElement getClickSignInButton() {
		return ClickSignInButton;
	}
	public void setClickSignInButton(WebElement clickSignInButton) {
		ClickSignInButton = clickSignInButton;
	}
	public WebElement getUnameBox() {
		return UnameBox;
	}
	public void setUnameBox(WebElement unameBox) {
		UnameBox = unameBox;
	}
	public WebElement getUpassBox() {
		return UpassBox;
	}
	public void setUpassBox(WebElement upassBox) {
		UpassBox = upassBox;
	}
	public WebElement getClickSignIn() {
		return ClickSignIn;
	}
	public void setClickSignIn(WebElement clickSignIn) {
		ClickSignIn = clickSignIn;
	}
	
	
	
	
			
			
			
	
	
}
