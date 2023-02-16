package com.page;

import org.openqa.selenium.WebDriver;

import com.pom.Hotels;
import com.pom.Login;
import com.pom.Payment;
import com.pom.Search_Hotel;

public class Page_Object_Manager {
	
	public WebDriver driver;
	
	private Login l;
	
	private Search_Hotel search;
	
	private Hotels hotel;
	
	private Payment pay;
	
	public Hotels getHotel() {
		if(hotel==null) {
		hotel=new Hotels(driver);
		}
		return hotel;
	}
	public Search_Hotel getSearch() {
		if(search==null) {
		search= new Search_Hotel(driver);
		}
		return search;
	}
	public Login getL() {
		if(l==null) {
			l=new Login(driver);
		}
		return l;
	}
	
	public Payment getPay() {
		if(pay==null) {
		pay=new Payment(driver);
		}
		return pay;
	}
	public Page_Object_Manager(WebDriver driver) {
		this.driver=driver;
	}

}
