package com.test_runner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import com.Maven_Practice.Baseclass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Bala\\study\\eclipse-workspace\\Maven_Lao\\src\\test\\java\\com\\cucumber\\Adactin.feature",
glue="com\\step_definition",
plugin={"json:Reports/jsonFile.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},



monochrome=true,

		dryRun=false)
public class Test_Runner  {
	
	public static WebDriver driver;
	@BeforeClass
	public static void setup() {
		
		//Baseclass.launch();
		driver=Baseclass.launch();
	
	}
	@AfterClass
	public static void exit() throws IOException, InterruptedException {
	
		driver.quit();
	}
	



}
