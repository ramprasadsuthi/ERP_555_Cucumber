Feature: Login Functionality 
  I want to Automate all login test cases

  @smokeTest
  Scenario: TC-1 : Verify admin user is able to login with valid login credentials
    Given Open Browser and Launch Application "<url>"
    When Login with Valid "<username>" and "<password>"
    Then Validate the ERP HomePage
    And Close the Browser
  
  Examples:
  | url                                    | username | password |
  | http://webapp.qedgetech.com/login.php  | admin    | master   |
  
  @smokeTest
  Scenario: TC-2 : Verify admin user is able to logout successfully
    Given Open Browser and Launch Application "<url>"
    When Login with Valid "<username>" and "<password>"
    Then Validate the ERP HomePage
    Then Logout ERP Application 
    And Close the Browser
  
    Examples:
  | url                                    | username | password |
  | http://webapp.qedgetech.com/login.php  | admin    | master   |  
  