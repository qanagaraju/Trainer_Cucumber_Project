Feature: Scripts for facebook login page
 
 
  Scenario Outline: verify user login credentials
    Given user start facebook home page
    When user insert "<username>" and "<password>"
    Then user click submit button
    Then user close test
   
 

    Examples: 
      | username  | password  |
      | tester1 | admin123 |
      | tester2 | admin123  |
      | tester3 | admin123  |
      