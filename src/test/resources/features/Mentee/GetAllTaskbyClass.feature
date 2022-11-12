Feature: Get All Task by Class
  Background: Login Mentee
    Given Mentee login with all valid data
    When User send request post login user
    Then Should return 200 OK
    And Set token to base Mentor Token
  Scenario: Get all task with valid class id
    Given Mentee set token to Mentee Token
    When User send request get all class task
    Then Should return 201 Created
  Scenario: Get all task by class without Token
    When User send request get all task
    Then Should return 201 Created
#  Scenario: Get all task when class is deleted
#  Scenario: Get all task by class with Admin Token
