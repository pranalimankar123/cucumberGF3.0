Feature: create test for registration - Demowebshop

Scenario: Registration test

Given user should navigates to demowebshop on chrome browser
When users should click on register link
And user selexts gender
And user enter with first name
And user enter with last name
And user enter with email
And user enter with passwpord
And user enter with confirm password
And user clicks on register button
Then user should verify registration success
 