@employee
  Feature: Employee test feature
    This feature is about testing employee rest service

  Scenario: Get all employees
    Given employee rest service is up and running
#    When we send 'GET' request to the 'employee/app' endpoint
    Then we get the list of 7 employees