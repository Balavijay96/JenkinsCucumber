package com.Maven_Practice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	static public WebDriver driver;
	public static WebDriver launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bala\\study\\eclipse-workspace\\Maven_Lao\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public static void url(String url) {
		
			driver.get(url);
	}
	
	public static void get(String name) {
		
		 if(name.equals("title")) {
			String s = driver.getTitle();
			System.out.println("title :"+ s);
		}
		else if(name.equals("pagesourse")) {
			String pos = driver.getPageSource();
		System.out.println("page:" +pos);
		}
	
	}
	public static void sent(WebElement element,String input) {
			element.sendKeys(input);
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void close() {
			driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public static void navigate(String navigate) {
		if (navigate.equalsIgnoreCase("forward")) {
			driver.navigate().forward();			
	}
		else if (navigate.equalsIgnoreCase("backward")) {
			driver.navigate().back();
			

		}
		else {
			driver.navigate().refresh();
		}
		
}
	public static void navigateTo(String url) {
			driver.navigate().to(url);
	}
	public static void screenshot(String name) throws IOException {
			TakesScreenshot s= (TakesScreenshot) driver;
			File src= s.getScreenshotAs(OutputType.FILE);
			File des= new File(name);
			FileUtils.copyFile(src, des);
			
	}
	
	public static void selectValue(String value,WebElement element ) {
		Select s= new Select(element);
			s.selectByValue(value);
		}
	public static void selectIndex(int index,WebElement element ) {
		Select s= new Select(element);
			s.selectByIndex(index);
		}
	public static void selectVisibleText(WebElement element,String text ) {
		Select s= new Select(element);
			s.selectByVisibleText(text);
		}
	public static void getOptions(WebElement element , String name) {
		Select s= new Select(element);
		List <WebElement> r=s.getOptions();
		if(name.equals("options")) {
		for (WebElement gettext : r) {
			System.out.println(gettext.getText());
		}
		}
		else if (name.equalsIgnoreCase("first")) {
		WebElement f = s.getFirstSelectedOption();
		System.out.println(f.getText());
			
		}
		else if(name.equalsIgnoreCase("all")) {
			List<WebElement> all = s.getAllSelectedOptions();
			for (WebElement web : all) {
				System.out.println(web.getText());
			}
		}
	}
			public static void alert(String name) {
					Alert a= driver.switchTo().alert();
					if(name.equals("accept")) {
						a.accept();
					}
					if (name.equals("dismiss")){
						a.dismiss();
					}
			}
			public static void prompt(String name) {
					Alert a= driver.switchTo().alert();
					a.sendKeys(name);
			}
}