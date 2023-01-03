Feature: Deals data creation

Scenario: Free CRM create a new deal Scenario

Given user is already on Login Page
When Title of login page is Free CRM
Then user enters username and password
|username              |password  |
| vatsalnp96@gmail.com | Test@123 |

Then user clicks on login button
Then user is on home page
Then user moves to new deal page
Then user enters deal details
| title      | amount | probability | commission |
| test deal1 | 1000   | 50          |10          |
| test deal2 | 2000   | 60          |20          |
| test deal3 | 3000   | 70          |30          |

Then close the browser