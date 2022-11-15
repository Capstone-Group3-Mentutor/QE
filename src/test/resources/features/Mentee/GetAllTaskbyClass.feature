Feature: Get All Task by Class
  Background: Login Mentee
    Given Mentee login with all valid data
    When User send request post login user
    And Set token to base Mentee Token
  Scenario: Get all task with valid class id
    Given Mentee set token to Mentee Token
    When User send request get all class task
    Then Should return 200 OK
  Scenario: Get all task by class without Token
    When User send request get all task
    Then Should return 400 Bad Request
