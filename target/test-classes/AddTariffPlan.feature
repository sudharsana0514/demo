#Author: your.email@your.domain.com

@2regression  @us2 @addTariffPlan
Feature:  to test Add Tariff Plan.
  
@sprint1
    Scenario Outline:  To test the sucess message
    Given     The user is in Add Tariff Plan page.
    When      The user fills in the valid Plan details."<MonthRental>","<FreeLocMins>","<FreeIntMins>","<FreeSMS>","<LocCharges>","<IntCharges>","<SMSCharges>"
           
    When      The user clicks the submit buttons.  
    Then      The user shouid see the Sucess Message.
       
 Examples: 
         | MonthRental       |  FreeLocMins  |  FreeIntMins  |   FreeSMS   | LocCharges  |  IntCharges |  SMSCharges |
         | 1000              |  100          |  200          |  100        | 400         |  500        |  600        |   
         | 2000              |  200          |  300          |  120        | 500         |  600        |  700        |   
         | 3000              |  300          |  400          |  130        | 600         |  700        |  800        |   
         | 4000              |  400          |  500          |  140        | 700         |  800        |  800        |   

 @sprint2
    Scenario Outline:  To test the form is cleared after clicking Reset Button.
    Given     The user is in Add Tariff Plan page.
    When      The user fills in the valid Plan details."<MonthRental>","<FreeLocMins>","<FreeIntMins>","<FreeSMS>","<LocCharges>","<IntCharges>","<SMSCharges>"
           
    When      The user clicks the Reset button.  
    Then      The user shouid see the Form Cleared.
    
    Examples:
    
      | MonthRental       |  FreeLocMins  |  FreeIntMins  |   FreeSMS   | LocCharges  |  IntCharges |  SMSCharges |
      | 1000              |  100          |  200          |  100        | 400         |  500        |  600        |   
      | 1000              |  100          |  200          |  100        | 400         |  500        |  600        |   