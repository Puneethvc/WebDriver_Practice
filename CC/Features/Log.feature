Feature: Login

Scenario: Successful Login with Valid credentials
    Given User Launch chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And click on Login
    When User click on Log Out link"
    And close the browser
