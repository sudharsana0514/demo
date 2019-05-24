#Author: your.email@your.domain.com

Feature: to test Add Tariff Plan to Customer Page.

    Scenario:  To test the sucess message.
    Given     The user is in Add Tariff Plan to Customer Page   
    When      The user fills in the Invalid Customer ID. 
    When      The user clicks the submit buttons  
    Then      The user shouid see the Please Input Your Correct Customer ID Message.