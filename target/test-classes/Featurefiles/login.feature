
Feature: To validate the login functionality of amazon application

Background: user have entered amazon through chrome browser


Scenario: To validate login by using valid search credentials 

When user have enter valid username data in and Invalid pass data
|Dinesh123@gmail.com|Dinu123|Manoj123@gmail.com|mano123|
Then user have click the login button


Scenario: To validate login by using invalid search credentials 

When user have enter invalid username data and Invalid pass data
|Dinesh123@gmail.com|Dinu123|Manoj123@gmail.com|mano123|
|Greens@gmail.com|greens123|yasar123@gmail.com|yasar123|
|java123@gmail.com|java123|selenium123@gmail.com|1234567|
Then user have clicked the login button 


Scenario: To validate login by using single dimensional map search credentials 

When user have get valid datas from feature file
|Email|Dinesh123@gmail.com|
|Pass|Dinu123|
|Username|Manoj123@gmail.com|
Then user have click the login button after entering data

@login
Scenario: To validate login by using multi dimensional map search credentials 

When user have got the valid datas from feature file 
|Email|Phoneno|Username|
|Dinesh123@gmail.com|346475341354|mano123|
|Greens@gmail.com|687656876764|yasar123|
|java123@gmail.com|687652265|java123|
Then user have click the login button after entering"


