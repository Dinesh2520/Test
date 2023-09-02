
Feature: To validate the booking functionality of redbus application

Scenario: To validate every functionality by using valid search credentials 

Given user have entered redbus through chrome browser
When user have enter valid credentials in from, to textbox and calenderBox
And user have click the search bus button
When user have click the bus seats from the list of different buses
And user have to click the required seats which are shown available
When user have to click the boarding point and dropping point and click proceed to book
When user have to enter valid credentials in all textbox, radio button and age
And user have to click proceed to pay button
When user have to choose valid payment method
Then user have reach the valid credentials page