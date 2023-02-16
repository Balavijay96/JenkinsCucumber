package com.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration  {
	static Properties p;
	public Configuration() throws IOException {
		File f= new File("C:\\Users\\Bala\\study\\eclipse-workspace\\Maven_Practice\\Adactin.properties");
		FileInputStream fis = new FileInputStream(f);
		p= new Properties();
		p.load(fis);
	}
	public String getUrl() throws IOException {
	String url = p.getProperty("url");
	return url;
	}
	public String getUserName() throws IOException {
		
		String user = p.getProperty("user");
		return user;
	}
	public  String getPassword() throws IOException {
			String password = p.getProperty("pass");
			return password;
	}
	
	public String getLocation() {
			
		String location = p.getProperty("location");
		return location;
	}
	public String getHotels() {
		String hotel = p.getProperty("hotel");
		return hotel;
	}
	public  String getRoom() {
		String room = p.getProperty("rooms");
		return room;
	}
	public String getNums() {

		String num = p.getProperty("num");
		return num;
	}
	public String getIn() {
		String in = p.getProperty("in");
		return in;
	}
	public String getOut() {
		String out = p.getProperty("out");
		return out;
	}
	public String getAdult() {
		String adult = p.getProperty("adult");
		return adult;
	}
	public String getChild() {
		String child = p.getProperty("child");
		return child;
	}
	
	public String getFirst() {
		String first = p.getProperty("first");
		return first;
	}
	public String getLast() {
		String last = p.getProperty("last");
		return last;
	}
	public String getCc() {
		String card = p.getProperty("cc");
		return card;
	}
	public String getType() {
		String type = p.getProperty("type");
		return type;
	}
	public String getAddress() {
		String address = p.getProperty("address");
		return address;
	}
	public String getMonth() {
		String month = p.getProperty("month");
		return month;
	}
	public String getYear() {
		String year = p.getProperty("year");
		return year;
	}
	public String getCvv() {
		String cvv = p.getProperty("cvv");
		return cvv;
	}
	public String path() {
		String path = p.getProperty("path");
		return path;
	}
	
	
	
	
	
	
	
}
