Feature: Search Functionality

Scenario: User Search for a valid product
Given User opens the application 
When User enters valid product "HP" into search box field
And User clicks on search button
Then User should get valid product displayed in search results

Scenario: User search for an invalid product
Given User opens the application 
When User enters valid product "Honda" into search box field
And User clicks on search button
Then User should get a msg about no products matching