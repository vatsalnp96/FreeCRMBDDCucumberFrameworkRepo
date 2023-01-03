Feature: Free CRM Login Feature

#Without Examples keyword
#Scenario: Free CRM Login Test Scenario

#Given user is already on Login Page
#When Title of login page is Free CRM
#Then user enters "vatsalnp96@gmail.com" and "Test@123"
#Then user clicks on login button
#Then user is on home page


#With Examples keyword
Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
When Title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page

Examples:
	| username             | password |
	| vatsalnp96@gmail.com | Test@123 |
	| tome                 | test@456 |
