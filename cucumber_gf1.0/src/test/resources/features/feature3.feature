Feature: create test for registration - Demowebshop

Scenario Outline: Registration test

Given user should navigates to demowebshop on chrome browser
When users should click on register link
And user selexts gender
And user enter with first name as "<fn>"
And user enter with last name as "<ln>"
And user enter with email as "<email>"
And user enter with passwpord "<pwd>"
And user enter with confirm password as "<confirmpwd>"
And user clicks on register button
Then user should verify registration success

Examples:

|fn||ln||email||pwd||confirmpwd|
|pranali||mankar||ppm@gmail.com||pwd@123||pwd@123| 
|pranali1||mankar1||ppm1@gmail.com||pwd1@123||pwd1@123| 
 