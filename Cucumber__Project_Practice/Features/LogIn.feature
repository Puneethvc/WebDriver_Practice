Feature: LogIn

Scenario: Successfull Login with valid credentials
	Given User launch chrome browser
	When User opens URL "https://admin-demo.nopcommerce.com/login" 
	And User enters Email as "admin@yourstore.com" and Password as "admin"
	And User click on Login
	Then Page title should be "Dashboard / nopCommerce administraction"
	And Click on Logout link
	Then Page title should be"Your store. Login" 
	And close the browser
	