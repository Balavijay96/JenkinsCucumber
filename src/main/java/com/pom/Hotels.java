package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotels {
	public WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	
	@FindBy(id="continue")
	private WebElement continues;

	public WebElement getRadio() {
		
		return radio;
	}

	public WebElement getContinues() {
		return continues;
	}
	
	public Hotels(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
	}
	

}
