$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Featurefiles/new.feature");
formatter.feature({
  "name": "To validate the forgotten functional",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "To validate the forgotten fun",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
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
formatter.step({
  "name": "user have to check forgot",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.userHaveToCheckForgot()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have click the forgotten pass",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.userHaveClickTheForgottenPass()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have enter email add",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.userHaveEnterEmailAdd()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have click the search",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.userHaveClickTheSearch()"
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