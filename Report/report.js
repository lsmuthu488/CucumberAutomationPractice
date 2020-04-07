$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/automation/feature/automation.feature");
formatter.feature({
  "line": 1,
  "name": "Testing login functionality on automation application",
  "description": "",
  "id": "testing-login-functionality-on-automation-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "user checking the login function using valid username and valid password",
  "description": "",
  "id": "testing-login-functionality-on-automation-application;user-checking-the-login-function-using-valid-username-and-valid-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user enter the valid username \"\u003cusername\u003e\" in username field",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user enter the valid password \"\u003cpassword\u003e\" in password field",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user confirm it navigates to the  homepage",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "testing-login-functionality-on-automation-application;user-checking-the-login-function-using-valid-username-and-valid-password;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 14,
      "id": "testing-login-functionality-on-automation-application;user-checking-the-login-function-using-valid-username-and-valid-password;;1"
    },
    {
      "cells": [
        "lsmuthu488@gmail.com",
        "India79865"
      ],
      "line": 15,
      "id": "testing-login-functionality-on-automation-application;user-checking-the-login-function-using-valid-username-and-valid-password;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 948558,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user to launch the broswer",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user to launch the applicattion",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_to_launch_the_broswer()"
});
formatter.result({
  "duration": 644429698,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_launch_the_applicattion()"
});
formatter.result({
  "duration": 664346,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "user checking the login function using valid username and valid password",
  "description": "",
  "id": "testing-login-functionality-on-automation-application;user-checking-the-login-function-using-valid-username-and-valid-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user enter the valid username \"lsmuthu488@gmail.com\" in username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user enter the valid password \"India79865\" in password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user confirm it navigates to the  homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_application()"
});
formatter.result({
  "duration": 47077596228,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lsmuthu488@gmail.com",
      "offset": 31
    }
  ],
  "location": "StepDefinition.user_enter_the_valid_username_in_username_field(String)"
});
formatter.result({
  "duration": 4315580865,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "India79865",
      "offset": 31
    }
  ],
  "location": "StepDefinition.user_enter_the_valid_password_in_password_field(String)"
});
formatter.result({
  "duration": 3904463275,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 8694236296,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_confirm_it_navigates_to_the_homepage()"
});
formatter.result({
  "duration": 64342,
  "status": "passed"
});
formatter.after({
  "duration": 1368560,
  "status": "passed"
});
formatter.before({
  "duration": 169738,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user to launch the broswer",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user to launch the applicattion",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_to_launch_the_broswer()"
});
formatter.result({
  "duration": 156317,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_launch_the_applicattion()"
});
formatter.result({
  "duration": 107764,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "user to select a tshrit for booking a order",
  "description": "",
  "id": "testing-login-functionality-on-automation-application;user-to-select-a-tshrit-for-booking-a-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "user navigates to tshirt in women option",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "user click on tshirt image to be booked",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user choose the quantity of the tshirt",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user choose the size of the tshirt",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user choose the addchart to hold the booking",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user to proceed to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user verifies selection of tshirt is done",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_navigates_to_tshirt_in_women_option()"
});
formatter.result({
  "duration": 15359295454,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_tshirt_image_to_be_booked()"
});
formatter.result({
  "duration": 12219163082,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_choose_the_quantity_of_the_tshirt()"
});
formatter.result({
  "duration": 3695962095,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_choose_the_size_of_the_tshirt()"
});
formatter.result({
  "duration": 3847398215,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_choose_the_addchart_to_hold_the_booking()"
});
formatter.result({
  "duration": 3319449702,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_proceed_to_checkout()"
});
formatter.result({
  "duration": 7137012354,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_selection_of_tshirt_is_done()"
});
formatter.result({
  "duration": 56053,
  "status": "passed"
});
formatter.after({
  "duration": 192633,
  "status": "passed"
});
formatter.before({
  "duration": 182370,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user to launch the broswer",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user to launch the applicattion",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_to_launch_the_broswer()"
});
formatter.result({
  "duration": 119211,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_launch_the_applicattion()"
});
formatter.result({
  "duration": 259343,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "user proceed for payment to place the order",
  "description": "",
  "id": "testing-login-functionality-on-automation-application;user-proceed-for-payment-to-place-the-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "user navigates to summary page",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "user checks for delivery order and billing address",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user confirm the booking by agreeing the terms and conditions",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user to proceed for payment",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user confirm the order",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user verify order placed successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_navigates_to_summary_page()"
});
formatter.result({
  "duration": 6861278426,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_checks_for_delivery_order_and_billing_address()"
});
formatter.result({
  "duration": 6119224227,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_confirm_the_booking_by_agreeing_the_terms_and_conditions()"
});
formatter.result({
  "duration": 8431431257,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_proceed_for_payment()"
});
formatter.result({
  "duration": 5281347907,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_confirm_the_order()"
});
formatter.result({
  "duration": 6720526709,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verify_order_placed_successfully()"
});
formatter.result({
  "duration": 53205695,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[]\u003e but was:\u003c[   ]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat com.automation.stepdefinition.StepDefinition.user_verify_order_placed_successfully(StepDefinition.java:200)\r\n\tat ✽.Then user verify order placed successfully(src/test/java/com/automation/feature/automation.feature:36)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 223423,
  "status": "passed"
});
});