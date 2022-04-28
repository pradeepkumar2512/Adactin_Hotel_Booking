package com.Runner;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import AdactinBase.Base_Class;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\Adaction_Hotel_Booking" , glue = "com\\StepDefinition")
public class Adactin_Runner {
public static WebDriver driver;
	@Before
	public void setUp() {
	Base_Class.getBrowesr("chrome");
					
		
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
	
}
