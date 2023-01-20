@GetCEOName
Feature: This feature is to get the CEO name from the OrangeHRM app
Scenario: This test is to verify the CEO name
Given the user is logged in successfully and is on Home Page
When the user clicks on the directory option from the Menu bar
And the user selects the job title as "CEO" from the drop down
And clicks the search button
Then the user Should see the CEO name as "<CEO_Name>"

