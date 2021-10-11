@buy
Feature: DemoBlaze Buy Function


Scenario: Test AddTo Cart Button
   Given User is on HomePage  
   When User Selects Product
   Then User Clicks AddCart Button
   
  Scenario: Test Buy PopUp Window
  Given User is into cart
  When User clicks PlaceOrder
  Then User Gets Popup For Details  
   
  Scenario: Test online Payment Fuction
  Given User is on cart and Clicks PlaceOrder 
  When User is on Popup Details of buy item 
  And User Enters Name
  And User Enters Country
  And User Enters City
  And User Enters CreditCard
  And User Enters Month
  And User Enters Year
  Then User Clicks Purchase
  
  
  
 Scenario: Test Buy Fuction for Invalid CreditCard
  Given User is on cart and Clicks PlaceOrder
  When User Enters Name
  And User Enters Country
  And User Enters City
  And User Enters Invalid CreditCard
  And User Enters Month
  And User Enters Year
  Then User Clicks Purchase
  
  Scenario: Test Buy Fuction for Invalid Address
  Given User is on cart and Clicks PlaceOrder 
  When User Enters Name
  And User Enters  Invalid Country
  And User Enters Invalid City
  And User Enters Invalid CreditCard
  And User Enters Month
  And User Enters Year
  Then User Clicks Purchase
  
 