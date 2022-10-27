Feature: Validation of AdactinHotels Web Application

  Background: 
    Given User launch adactin web Application
    Then User verify login page is displayed

  Scenario: AD01_Validation of Book A Hotel with Valid crentials
    When User enters Valid UserId and Password
    And User clicks Login button
    Then User verify Search Hotel Page is displayed
    When User enters 	valid Location,Hotels and Room type
    And User click Search Hotel button
    Then User verify Select Hotel Page is displayed
    When User clicks Radio button
    And User  clicks continue button
    Then User verify Book A Hotel Page is displayed
    When User enters valid First Name,Last Name,Billing Address,Credit Card,Credit Card Type,Month,Year and CVV
    And User clicks Book Now button
    Then User Verify Order ID is displayed

  #Scenario Outline: AD02_Validation of Book A Hotel with Multiple Valid crentials
    #When User enters Valid "<userid>" and "<password>"
    #And User clicks Login button
    #Then User verify Search Hotel Page is displayed
    #When User enters 	valid "<location>" ,"<hotels>" and "<roomtype>"
    #And User click Search Hotel button
    #Then User verify Select Hotel Page is displayed
    #When User clicks Radio button
    #And User  clicks continue button
    #Then User verify Book A Hotel Page is displayed
    #When User enters valid "<firstname>","<lastname>","<billingaddress>","<creditcard>","<creditcardtype>","<month>","<year>" and "<cvv>"
    #And User clicks Book Now button
    #Then User Verify Order ID is displayed
#
    #Examples: 
      #| userid   | password  | location  | hotels         | roomtype     | firstname | lastname | billingaddress                     | creditcard       | creditcardtype   | month    | year | cvv |
      #| ajimax03 | Ajimax03* | Sydney    | Hotel Creek    | Standard     | Ajith     | Maxwell  | N0 - 24, 4th Street , Padi, Ch -47 | 3432543364324350 | American Express | January  | 2020 | 321 |
      #| ajimax03 | Ajimax03* | Melbourne | Hotel Sunshine | Double       | John      | Maxwell  | No, 43, Koyambedu , Ch - 107       | 2345325324534530 | VISA             | February | 2020 | 456 |
      #| ajimax03 | Ajimax03* | Brisbane  | Hotel Hervey   | Deluxe       | Ajith     | S        | No - 55,Mogappair - Ch - 37        | 2342543523525650 | Master Card      | March    | 2020 | 677 |
      #| ajimax03 | Ajimax03* | Adelaide  | Hotel Cornice  | Super Deluxe | S         | Ajith    | No 33, Anna Nagar west - Ch - 32   | 4564365474754730 | Other            | April    | 2020 | 213 |
