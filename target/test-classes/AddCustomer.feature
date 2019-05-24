#Author: your.email@your.domain.com
@smoke @us1 @AddCustomerPlan
Feature:  to test add customer functionality
  
@sprint1
    Scenario:  To test customer id is generated for valid customer
    Given     The user is in add customer page.
    When      The user fills in the valid customer details
         | sudha | sw tester | sudha@gmail.com | chennai | 123456789 |
    When      The user clicks the submit button.  
    Then      The user shouid see the customer ID generated.
    

 