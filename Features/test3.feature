Feature: Calculator
  I want to use Implement simple math functions

  @smokeTest
  Scenario: Addition of Two Numbers given from data table
    Given User reads <a> and <b> values
    When User computes a+b
    Then Display the Results <expResult>
  
  Examples:
  |    a    |   b   | expResult |
  |   200   |  100  |   300     |
  |   100   |   50  |   150     |
  |    50   |  150  |   250     |
