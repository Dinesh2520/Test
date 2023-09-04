$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Featurefiles/login.feature");
formatter.feature({
  "name": "To validate the login functionality of amazon application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "user have entered amazon through chrome browser",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login by using multi dimensional map search credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "user have got the valid datas from feature file",
  "rows": [
    {
      "cells": [
        "Email",
        "Phoneno",
        "Username"
      ]
    },
    {
      "cells": [
        "Dinesh123@gmail.com",
        "346475341354",
        "mano123"
      ]
    },
    {
      "cells": [
        "Greens@gmail.com",
        "687656876764",
        "yasar123"
      ]
    },
    {
      "cells": [
        "java123@gmail.com",
        "687652265",
        "java123"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_have_got_the_valid_datas_from_feature_file(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have click the login button after entering\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_have_click_the_login_button_after_entering()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});