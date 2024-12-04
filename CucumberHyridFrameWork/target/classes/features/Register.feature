Feature: Registration functionality

Scenario: User creates an account only with mandatory credentials
Given user open register page
When User enters the details into below fields
|firstName|Puneeth							|
|lastName|VC									 	|
|email|puneethvcvivek@gmail.com	|
|telephone|1234590							|
|password|1234									|
And User select privacy policy
And User clicks on continue button
Then User account shold get created successful


Scenario: User creates an account with all the fields
Given User open register account page
When User enters the details into below fields
|firstName|Puneeth							|
|lastName|VC									 	|
|email|puneethvcvivek@gmail.com	|
|telephone|1234590							|
|password|1234									|
And User select Yes for Newsletter									
And User select privacy policy
And User clicks on continue button
Then User account should get your account has been created successful 

Scenario: User creates an duplicate account
Given User open register account page
When User enters the details into below fields
|firstName|Puneeth							|
|lastName|VC									 	|
|email|puneethvcvivek@gmail.com	|
|telephone|1234567890						|
|password|1234									|
And User select Yes for Newsletter									
And User select privacy policy
And User clicks on continue button
Then User account should get warning message  

Scenario: User creates an account without filling any fields
Given User open register account page
Then User dont enter any details fields
And click on Continue button
Then User should get proper warning meaasge for every mandatory field

