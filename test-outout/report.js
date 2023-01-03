$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Selenium_Workspace/FreeCRMBDDCucumberFramework/src/main/java/Features/dealsmap.feature");
formatter.feature({
  "line": 1,
  "name": "Deals data creation",
  "description": "",
  "id": "deals-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM create a new deal Scenario",
  "description": "",
  "id": "deals-data-creation;free-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "vatsalnp96@gmail.com",
        "Test@123"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "title",
        "amount",
        "probability",
        "commission"
      ],
      "line": 15
    },
    {
      "cells": [
        "test deal1",
        "1000",
        "50",
        "10"
      ],
      "line": 16
    },
    {
      "cells": [
        "test deal2",
        "2000",
        "60",
        "20"
      ],
      "line": 17
    },
    {
      "cells": [
        "test deal3",
        "3000",
        "70",
        "30"
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealStepwithMapsDefinition.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 3843744300,
  "status": "passed"
});
formatter.match({
  "location": "DealStepwithMapsDefinition.title_of_login_page_is_free_crm()"
});
formatter.result({
  "duration": 8547200,
  "status": "passed"
});
formatter.match({
  "location": "DealStepwithMapsDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 252664400,
  "status": "passed"
});
formatter.match({
  "location": "DealStepwithMapsDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 29095900,
  "status": "passed"
});
formatter.match({
  "location": "DealStepwithMapsDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 3342400,
  "status": "passed"
});
formatter.match({
  "location": "DealStepwithMapsDefinition.user_moves_to_new_deal_page()"
});
formatter.result({
  "duration": 1154456100,
  "status": "passed"
});
formatter.match({
  "location": "DealStepwithMapsDefinition.user_enters_deal_details(DataTable)"
});
formatter.result({
  "duration": 20492237600,
  "status": "passed"
});
formatter.match({
  "location": "DealStepwithMapsDefinition.close_the_browser()"
});
formatter.result({
  "duration": 731900500,
  "status": "passed"
});
});