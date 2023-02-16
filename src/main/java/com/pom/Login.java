package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public WebDriver a;

	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement login;
	
	public WebElement getUsername() {
		return user;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	public Login(WebDriver driver2) {
		this.a=driver2;
		PageFactory.initElements(driver2, this);
	}
	
}
