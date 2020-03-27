package com.automation.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class BookOrder {

public static WebDriver driver;
	
	public BookOrder(WebDriver ldriver)
	{
		
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
		
			
	}
	
	public WebElement getWomen() {
		return women;
	}

	public WebElement getTshirt() {
		return tshirt;
	}

	public WebElement getEmg() {
		return emg;
	}

	public WebElement getIplus() {
		return iplus;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getAdca() {
		return adca;
	}

	public WebElement getProc() {
		return proc;
	}

/*	public WebElement getProc1() {
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

*/
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;
	
	@FindBy(xpath="//a[@title='T-shirts']")
	private WebElement tshirt;
		
	@FindBy(xpath="//i[@class='icon-eye-open']")
	private WebElement emg;
	
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement iplus;
		
	@FindBy(xpath="//select[@name='group_1']")
	private WebElement size;
		
	@FindBy(xpath="//button[@type='submit']")
	private WebElement adca;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proc;
		
	
}
