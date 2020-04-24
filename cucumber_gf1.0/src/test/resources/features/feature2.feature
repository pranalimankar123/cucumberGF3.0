Feature: create test for registration - Demowebshop

Scenario: Registration test

Given user should navigates to demowebshop on chrome browser
When users should click on register link
And user selexts gender
And user enter with first name as "pranali"
And user enter with last name as "mankar"
And user enter with email as "ppm@gmail.com"
And user enter with passwpord "pwd@123"
And user enter with confirm password as "pwd@123"
And user clicks on register button
Then user should verify registration success
 