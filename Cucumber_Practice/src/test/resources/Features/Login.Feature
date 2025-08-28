Feature: Login functionality
Scenario: Successful Login
  Given I open the browser and launch the login page
  When I login with username "<username>" and password "<password>"
  Then I should see the home page
  Examples: successful login
          |username | password |
          |Dhanu1   | Dhanu123 |
          |Shiv1    | Shiv123  |

   
 Scenario: Failed login
  Given I open the browser and launch the login page
  When I login with username "<username>" and password "<password>"
  Then I should see an error message
  Examples: Failed login
          |username | password |
          |Dhan1    | Dhau12   |
          |Shi1     | Shi23    |

  



 
