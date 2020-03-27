package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SiginPage {

	public static WebDriver driver;

	public SiginPage(WebDriver ldriver) {

		this.driver = ldriver;
		PageFactory.initElements(driver, this);

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSign() {
		return sign;
	}

	@FindBy(id="email")
	private WebElement mail;

	@FindBy(id = "passwd")
	private WebElement password;

	@FindBy(id = "SubmitLogin")
	private WebElement sign;

	
}
