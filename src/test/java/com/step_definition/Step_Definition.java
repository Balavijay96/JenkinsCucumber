package com.step_definition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Maven_Practice.Baseclass;
import com.page.Page_Object_Manager;
import com.property.Reader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Step_Definition extends Baseclass {
	Page_Object_Manager pom= new Page_Object_Manager(driver);
	
	@Before
	public void beforeHooks(Scenario s) {
		String name = s.getName();
		System.out.println(name);
	}
	@After
	public void afterHooks(Scenario s) throws IOException, InterruptedException {
		System.out.println(s.getStatus());
		Thread.sleep(5000);
		if(s.isFailed()) {
			TakesScreenshot screen= (TakesScreenshot) driver;
			byte[] screenshotAs = screen.getScreenshotAs(OutputType.BYTES);
			s.attach(screenshotAs, "image/png", "error screen");
		}
		}

	@Given("^user Must Enter The Url Before Login$")
	public void user_Must_Enter_The_Url_Before_Login() throws IOException {
		url(Reader.getInstance().getUrl());
		
	}
	@When("user Enter the {string} Username In Username Field")
	public void user_enter_the_username_in_username_field(String username) {
		
		sent(pom.getL().getUsername(), username);

		
	}
	@When("user Enter the {string} Password In Password Field")
	public void user_enter_the_password_in_password_field(String password) {
		sent(pom.getL().getPassword(),password);
	}

	@Then("^user Clicks The Login It Navigates To The Search Hotel$")
	public void user_Clicks_The_Login_It_Navigates_To_The_Search_Hotel() {
		String title = driver.getTitle();
		click(pom.getL().getLogin());
		String title1 = driver.getTitle();
		Assert.assertNotEquals(title, title1);
	}
	@When("user Select The Location In Dropdown Box")
	public void user_select_the_location_in_dropdown_box() throws IOException {
		selectValue(Reader.getInstance().getLocation(),pom.getSearch().getLocation());	
	}
	@When("user Select The Hotels In Dropdown Box")
	public void user_select_the_hotels_in_dropdown_box() throws IOException {
		selectValue(Reader.getInstance().getHotels(), pom.getSearch().getHotels());
	}
	@When("user Select The RoomType In Dropdown Box")
	public void user_select_the_room_type_in_dropdown_box() throws IOException {
		selectValue(Reader.getInstance().getRoom(), pom.getSearch().getRoom());
	}
	@When("user Select The Numbers Of Room In Dropdown Box")
	public void user_select_the_numbers_of_room_in_dropdown_box() throws IOException {
		selectVisibleText( pom.getSearch().getNum(),Reader.getInstance().getNums() );
	}
	@When("user Enters The Check-In Date In CheckIn Date Field")
	public void user_enters_the_check_in_date_in_check_in_date_field() throws IOException {
		sent(pom.getSearch().getIn(), Reader.getInstance().getIn());
	}
	@When("user Enters The Check-Out Date In CheckOut Date Field")
	public void user_enters_the_check_out_date_in_check_out_date_field() throws IOException {
		sent(pom.getSearch().getOut(), Reader.getInstance().getOut());
	}
	@When("user Select The Adults Per Room In Dropdown Box")
	public void user_select_the_adults_per_room_in_dropdown_box() throws IOException {
		selectVisibleText(pom.getSearch().getAdult(),Reader.getInstance().getAdult());
	}
	@When("user Select The Children Per Room In Dropdown Box")
	public void user_select_the_children_per_room_in_dropdown_box() throws IOException {
		selectValue(Reader.getInstance().getChild(), pom.getSearch().getChild());
	}
	@Then("user Clicks Search")
	public void user_clicks_search() {
		click(pom.getSearch().getSearch());
	}
	@When("user Select The Hotel Using Radiobutton")
	public void user_select_the_hotel_using_radiobutton() {
		click(pom.getHotel().getRadio());
	
	
	}
	@Then("user Clicks Continue It Navigates To The Payment Page")
	public void user_clicks_continue_it_navigates_to_the_payment_page() {
		click(pom.getHotel().getContinues());
	}

	@When("user Enters The First Name")
	public void user_enters_the_first_name() throws IOException {
		sent(pom.getPay().getFirst(), Reader.getInstance().getFirst());
		
		
		
		
		
		
		
		
	}
	@When("user Enters The Last Name")
	public void user_enters_the_last_name() throws IOException {
		sent(pom.getPay().getLast(), Reader.getInstance().getLast());
	}
	@When("user Enters The Billing Address")
	public void user_enters_the_billing_address() throws IOException {
		sent(pom.getPay().getAddress(), Reader.getInstance().getAddress());
	}
	@When("user Enters The Credit Card No")
	public void user_enters_the_credit_card_no() throws IOException {
		sent(pom.getPay().getCc(),Reader.getInstance().getCc());
	}
	@When("user Enters Credit Card Type")
	public void user_enters_credit_card_type() throws IOException {
		selectValue(Reader.getInstance().getType(), pom.getPay().getType());
	}
	@When("user Select Expiry Date")
	public void user_select_expiry_date() throws IOException {
		selectValue(Reader.getInstance().getMonth(), pom.getPay().getMonth());
		selectValue(Reader.getInstance().getYear(), pom.getPay().getYear());
	}
	@When("user Enters CVV")
	public void user_enters_cvv() throws IOException {
		sent(pom.getPay().getCvv(), Reader.getInstance().getCvv());
	}
	@Then("user Clicks Book_Now Button")
	public void user_clicks_book_now_button() {
		click(pom.getPay().getBook());
	}


}
