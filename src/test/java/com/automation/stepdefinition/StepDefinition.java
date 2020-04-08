package com.automation.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.baseclass.BaseClass;
import com.automation.helper.FileReaderManager;
import com.automation.pom.PageObjectManager;
import com.automation.runner.Runner;

import cucumber.api.Scenario;
import cucumber.api.java.*;
import cucumber.api.java.en.*;
import junit.framework.Assert;


public class StepDefinition extends BaseClass {

	//public static WebDriver driver = Runner.driver;
	//public static PageObjectManager pom = new PageObjectManager(driver);

	public static WebDriver driver=Runner.driver;
	public static PageObjectManager pom=new PageObjectManager(driver);
	
	/*
	 * @Before public void beforeHooks(Scenario scenario) {
	 * 
	 * String name=scenario.getName(); System.out.println("Scenario is "+name);
	 * 
	 * }
	 * 
	 * @After public void afterHooks(Scenario scenario) { String
	 * status=scenario.getStatus();
	 * 
	 * if(scenario.isFailed()) { System.out.println("Failed scenario "+status); } }
	 */

	@Given("^user to launch the broswer$")
	public void user_to_launch_the_broswer() throws Throwable {
		System.out.println("Application Launched");

	}

	@Then("^user to launch the applicattion$")
	public void user_to_launch_the_applicattion() throws Throwable {
		System.out.println("Login SucessFull");
	}

	@Given("^user launch the application$")
	public void user_launch_the_application() throws IOException, InterruptedException {

		String url = FileReaderManager.getInstance().getCrInstance().getUrl();
		driver.get(url);
		Thread.sleep(5000);

		mouseclick(pom.getHp().getSigin());
		Thread.sleep(5000);
	}

	@When("^user enter the valid username \"([^\"]*)\" in username field$")
	public void user_enter_the_valid_username_in_username_field(String arg1) throws Throwable {
		inputtoWebElement(pom.getSp().getMail(), arg1);
		Thread.sleep(3000);

	}

	@When("^user enter the valid password \"([^\"]*)\" in password field$")
	public void user_enter_the_valid_password_in_password_field(String arg1) throws Throwable {
		inputtoWebElement(pom.getSp().getPassword(), arg1);
		Thread.sleep(3000);
	}

	/*
	 * @When("^user enter the valid username in username field$") public void
	 * user_enter_the_valid_username_in_username_field() throws Throwable {
	 * 
	 * inputtoWebElement(pom.getSp().getMail(), "lsmuthu488@gmail.com");
	 * Thread.sleep(3000); }
	 * 
	 * @When("^user enter the valid password in password field$") public void
	 * user_enter_the_valid_password_in_password_field() throws Throwable {
	 * inputtoWebElement(pom.getSp().getPassword(), "India79865");
	 * Thread.sleep(3000);
	 * 
	 * }
	 * 
	 * 
	 * @When("^user enter the valid username \"([^\"]*)\" in username field$")
	 * public void user_enter_the_valid_username_in_username_field(String arg1)
	 * throws Throwable { //inputtoWebElement(pom.getSp().getMail(), arg1);
	 * //WebElement mail = pom.getSp().getMail(); //mail.sendKeys(arg1);
	 * 
	 * }
	 * 
	 * @When("^user enter the valid password \"([^\"]*)\" in password field$")
	 * public void user_enter_the_valid_password_in_password_field(String arg1)
	 * throws Throwable {
	 * 
	 * }
	 */

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		mouseclick(pom.getSp().getSign());
		Thread.sleep(5000);

	}

	@Then("^user confirm it navigates to the  homepage$")
	public void user_confirm_it_navigates_to_the_homepage() throws Throwable {

	}

	@Given("^user navigates to tshirt in women option$")
	public void user_navigates_to_tshirt_in_women_option() throws Throwable {

		actionMethod(pom.getBo().getWomen(), pom.getBo().getTshirt(), "element");
		Thread.sleep(7000);
	}

	@When("^user click on tshirt image to be booked$")
	public void user_click_on_tshirt_image_to_be_booked() throws Throwable {
		mouseclick(pom.getBo().getEmg());
		Thread.sleep(2000);
		// driver.switchTo().frame(0);
		frameswitch();
		Thread.sleep(7000);

	}

	@When("^user choose the quantity of the tshirt$")
	public void user_choose_the_quantity_of_the_tshirt() throws Throwable {
		mouseclick(pom.getBo().getIplus());
		Thread.sleep(3000);
	}

	@When("^user choose the size of the tshirt$")
	public void user_choose_the_size_of_the_tshirt() throws Throwable {
		dropDownMethod(pom.getBo().getSize(), "value", "3");
		Thread.sleep(3000);
	}

	@When("^user choose the addchart to hold the booking$")
	public void user_choose_the_addchart_to_hold_the_booking() throws Throwable {
		mouseclick(pom.getBo().getAdca());
		Thread.sleep(3000);
	}

	@When("^user to proceed to checkout$")
	public void user_to_proceed_to_checkout() throws Throwable {
		mouseclick(pom.getBo().getProc());
		Thread.sleep(3000);

	}

	@Then("^user verifies selection of tshirt is done$")
	public void user_verifies_selection_of_tshirt_is_done() throws Throwable {

	}

	@Given("^user navigates to summary page$")
	public void user_navigates_to_summary_page() throws Throwable {
		mouseclick(pom.getPo().getProc1());
		Thread.sleep(3000);

	}

	@When("^user checks for delivery order and billing address$")
	public void user_checks_for_delivery_order_and_billing_address() throws Throwable {
		mouseclick(pom.getPo().getPadr());
		Thread.sleep(3000);
	}

	@When("^user confirm the booking by agreeing the terms and conditions$")
	public void user_confirm_the_booking_by_agreeing_the_terms_and_conditions() throws Throwable {
		mouseclick(pom.getPo().getChk());
		Thread.sleep(3000);
		mouseclick(pom.getPo().getProc2());
		Thread.sleep(3000);

	}

	@When("^user to proceed for payment$")
	public void user_to_proceed_for_payment() throws Throwable {
		mouseclick(pom.getPo().getPb());
		Thread.sleep(3000);
	}

	@When("^user confirm the order$")
	public void user_confirm_the_order() throws Throwable {
		mouseclick(pom.getPo().getCon());
		Thread.sleep(3000);

	}

	@Then("^user verify order placed successfully$")
	public void user_verify_order_placed_successfully() throws Throwable {
	}

}
