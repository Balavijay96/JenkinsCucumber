package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	
	WebDriver driver;

	@FindBy(id="first_name")
	private WebElement first;
	@FindBy(id="last_name")
	private WebElement last;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement cc;
	@FindBy(id="cc_type")
	private WebElement type;
	@FindBy(id="cc_exp_month")
	private WebElement month;
	@FindBy(id="cc_exp_year")
	private WebElement year;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement book;
	public WebElement getFirst() {
		return first;
	}
	public WebElement getLast() {
		return last;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCc() {
		return cc;
	}
	public WebElement getType() {
		return type;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBook() {
		return book;
	}
	
	public Payment(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
	}
	
}
