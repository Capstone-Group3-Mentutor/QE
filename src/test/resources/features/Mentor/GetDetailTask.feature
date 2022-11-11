Feature: Update Mentor Profile
  Background: Login Mentor
    Given Mentor login with all valid data
    When Send request post login user
    And Set token to Mentor Token

  Scenario: Get task with valid task id
    Given Mentor set task id to 73
    When User send request get detail task
    Then Should return 201 Created
  Scenario: Get task with invalid task id
    Given Mentor set invalid task id to "test"
    When User send request get detail task
    Then Should return 400 Bad Request
  Scenario: Get task with unregistered task id
    Given Mentor set task id to 999999999
    When User send request get detail task
    Then Should return 404 Not Found
#  Scenario: Get detail task with valid task id with Mentee Token
#  Scenario: Get detail task with valid task id with Admin Token
#  Scenario: Get detail task with valid task id without Token
