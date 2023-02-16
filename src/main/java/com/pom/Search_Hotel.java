package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
			WebDriver b;
		@FindBy(id="location")
		private WebElement location;

		@FindBy(id="hotels")
		private WebElement hotels;
		

		@FindBy(id="room_type")
		private WebElement room;


		@FindBy(id="datepick_in")
		private WebElement in;

		@FindBy(id="datepick_out")
		private WebElement out;
		
		@FindBy(id="adult_room")
		private WebElement adult;
		
		@FindBy(id="child_room")
		private WebElement child;
		
		@FindBy(id="Submit")
		private WebElement search;
		
		@FindBy(id="room_nos")
		private WebElement num;

	
		public WebElement getNum() {
			return num;
		}

		public WebElement getLocation() {
			return location;
		}

		public WebElement getHotels() {
			return hotels;
		}

		public WebElement getRoom() {
			return room;
		}
		
		public WebElement getIn() {
			return in;
		}

		public WebElement getOut() {
			return out;
		}

		public WebElement getAdult() {
			return adult;
		}

		public WebElement getChild() {
			return child;
		}

		public WebElement getSearch() {
			return search;
		}

		public Search_Hotel(WebDriver dr) {
			this.b=dr;
			PageFactory.initElements(dr, this);
		}
	}


