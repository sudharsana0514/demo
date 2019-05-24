$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/AddCustomer.feature");
formatter.feature({
  "name": "to test add customer functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@us1"
    },
    {
      "name": "@AddCustomerPlan"
    }
  ]
});
formatter.scenario({
  "name": "To test customer id is generated for valid customer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@us1"
    },
    {
      "name": "@AddCustomerPlan"
    },
    {
      "name": "@sprint1"
    }
  ]
});
formatter.step({
  "name": "The user is in add customer page.",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.the_user_is_in_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user fills in the valid customer details",
  "rows": [
    {
      "cells": [
        "sudha",
        "sw tester",
        "sudha@gmail.com",
        "chennai",
        "123456789"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Steps.the_user_fills_in_the_valid_customer_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks the submit button.",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.the_user_clicks_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user shouid see the customer ID generated.",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.the_user_shouid_see_the_customer_ID_generated()"
});
formatter.result({
  "status": "passed"
});
});