Feature: Get All Task by Class
  Background: Login Mentee
    Given Mentee login with all valid data
    When User send request post login user
#    Then Should return 200 OK
    And Set token to base Mentor Token

  Scenario: Get all task with valid class id
  Scenario: Get all task when mentor is deleted
  Scenario: Get all task by class with Admin Token
  Scenario: Get all task by class without Token
