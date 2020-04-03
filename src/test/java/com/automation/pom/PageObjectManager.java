package com.automation.pom;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public static WebDriver driver;

	public static HomePage hp;

	public static SiginPage sp;

	public static BookOrder bo;

	public static PlaceOrder po;




	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;

	}

	public static HomePage getHp() {
		HomePage hp = new HomePage(driver);
		return hp;
	}

	public SiginPage getSp() {
		SiginPage sp = new SiginPage(driver);
		return sp;
	}

	public static BookOrder getBo() {
		BookOrder bo = new BookOrder(driver);
		return bo;
	}

	public static PlaceOrder getPo() {
		PlaceOrder po = new PlaceOrder(driver);
		return po;
	}
	/*
	 * public static SignInAgain getSia() { SignInAgain sia= new
	 * SignInAgain(driver);
	 * 
	 * return sia; }
	 * 
	 * public static HomePageAgain getHpa() { HomePageAgain hpa= new
	 * HomePageAgain(driver); return hpa; }
	 */
	
}
