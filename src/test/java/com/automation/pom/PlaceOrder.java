package com.automation.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PlaceOrder {


public static WebDriver driver;
	
public PlaceOrder(WebDriver ldriver) {

	this.driver=ldriver;
	PageFactory.initElements(driver, this);
	
	
}



public WebElement getProc1() {
	return proc1;
}

public WebElement getPadr() {
	return padr;
}

public WebElement getChk() {
	return chk;
}

public WebElement getProc2() {
	return proc2;
}

public WebElement getPb() {
	return pb;
}

public WebElement getCon() {
	return con;
}



@FindBy(xpath="(//a[contains(@title,'Proceed to checkout')])[2]")
private WebElement proc1;

@FindBy(xpath="//button[@name='processAddress']")
private WebElement padr;

@FindBy(xpath="//input[@type='checkbox']")
private WebElement chk;

@FindBy(xpath="//button[@name='processCarrier']")
private WebElement proc2;

@FindBy(xpath="//a[@class='bankwire']")
private WebElement pb;

@FindBy(xpath="(//button[@type='submit'])[2]")
private WebElement con;







	
}
