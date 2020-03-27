package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

public static WebDriver driver;
	

	public HomePage(WebDriver ldriver) {

		
		this.driver= ldriver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getSigin() {
		return sigin;
	}


	@FindBy(xpath="//a[@class='login']")
	private WebElement sigin;
	

	
}
