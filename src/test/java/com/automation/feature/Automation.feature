Feature: Testing login functionality on automation application

Background:
Given user to launch the broswer
Then user to launch the applicattion
@login
Scenario Outline: user checking the login function using valid username and valid password
Given user launch the application
When user enter the valid username "<username>" in username field
And user enter the valid password "<password>" in password field
And user click on login button
Then user confirm it navigates to the  homepage
Examples:
|username|password|
|lsmuthu488@gmail.com|India79865|



Scenario: user to select a tshrit for booking a order 
Given user navigates to tshirt in women option
When user click on tshirt image to be booked
And user choose the quantity of the tshirt
And user choose the size of the tshirt
And user choose the addchart to hold the booking
And user to proceed to checkout
Then user verifies selection of tshirt is done



Scenario: user proceed for payment to place the order
Given user navigates to summary page
When user checks for delivery order and billing address
And user confirm the booking by agreeing the terms and conditions
And user to proceed for payment 
And user confirm the order 
Then user verify order placed successfully


