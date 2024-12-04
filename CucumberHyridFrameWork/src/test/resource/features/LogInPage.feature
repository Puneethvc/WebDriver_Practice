Feature: Login functionality

Scenario: Login with valid credentials
Given User navigate to login page
When User has enteres valid email address "puneethvcvivek@gmail.com" into email field
And User has enterd valid password "Puneeth@4441" into password field
And User click on Login button
Then User get Successfully Logged in

Scenario: Login with invalid credentials
Given User navigatated login page
When User has enteres invalid email address "puneethvivek@gmail.com" into email field
And User has enterd invalid password "puneeth@4441" into password field
And User click on Login button
Then User should get proper warning message about credentials missmatch 

Scenario: Login with valid email and invalid credentials
Given User navigated to login page
When User enters valid email addres "puneethvcvivek@gmail.com" into email field
And User enters invalid password "password@4441" into password field
And User click on login button 
Then User should get proper warning message about credentials missmatch 

Scenario: Login with invalid email and valid credentials
Given User navigated to login page
When User enters invalid email addres "puneethvivek@gmail.com" into email field
And User enters invalid password "Password@4441" into password field
And User click on login button 
Then User should get proper warning message about credentials missmatch 

Scenario: Login without providing any credentials
Given User navigated to login page
When User does not enter email addres into email field
And User does not enter password into password field
And User click on login button 
Then User should get proper warning message about credentials missmatch 


