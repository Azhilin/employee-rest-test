@employee
Feature: Employee test feature
  This feature is about testing employee rest service

  Scenario: Get all employees
    Given employee rest service is up and running
    When we send GET request to the 'employee/all' endpoint
    Then we get the list of 7 employees

  Scenario: Add new employee
    Given employee rest service is up and running
    When we add new employee:
      | id  | name | passportNumber | education |
      | 109 | July | JL159357       | College   |
    Then we get the list of 7 employees