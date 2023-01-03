Feature: Free CRM create contacts

Scenario Outline: Free CRM create a contact Scenario

Given user is already on Login Page
When Title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user moves to new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then close the browser

Examples:
	| username             | password | firstname | lastname | position       |
	| vatsalnp96@gmail.com | Test@123 | Peter     | Parker   | Spiderman      |
	| vatsalnp96@gmail.com | Test@123 | Steve     | Rogers   | CaptainAmerica |
	