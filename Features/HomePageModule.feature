Feature: Home Page Functionality 
  I want to Automate all HomePage related  test cases

  @smokeTest
  Scenario: TC-5 : Access to the Stock Items Page
    Given Open Browser and Launch Application "<url>"
    When Login with Valid "<username>" and "<password>"
    Then Navigate to the Stock Items page and Validate the page
    And Close the Browser
  
  Examples:
  | url                                    | username | password |
  | http://webapp.qedgetech.com/login.php  | admin    | master   |
  
  @smokeTest
  Scenario: TC-6 : Access to the Customers Page
    Given Open Browser and Launch Application "<url>"
    When Login with Valid "<username>" and "<password>"
    Then Navigate to the Customers Items page and Validate the page
    And Close the Browser
  
    Examples:
  | url                                    | username | password |
  | http://webapp.qedgetech.com/login.php  | admin    | master   |  
  