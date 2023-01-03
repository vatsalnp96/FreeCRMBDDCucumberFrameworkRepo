Feature: Deals data creation

Scenario: Free CRM create a new deal Scenario

Given user is already on Login Page
When Title of login page is Free CRM
Then user enters username and password
| vatsalnp96@gmail.com | Test@123 |

Then user clicks on login button
Then user is on home page
Then user moves to new deal page
Then user enters deal details
| test deal | 1000 | 50 |10 |

Then close the browser