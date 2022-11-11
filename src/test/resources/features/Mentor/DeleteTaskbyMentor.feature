Feature: Update Mentor Profile
  Background: Login Mentor
    Given Mentor login with all valid data
    When Send request post login user
    And Set token to Mentor Token

  Scenario: Delete task with valid task id
    Given Mentor set task id to 73
    When User send request delete task
    Then Should return 201 Created
  Scenario: Delete task with invalid task id
    Given Mentor set task id to 73
    When User send request delete task
    Then Should return 201 Created
  Scenario: Delete task with unregistered task id
  Scenario: Delete task without task id
  Scenario: Delete task with Mentee Token
  Scenario: Delete task with Admin Token
  Scenario: Delete task without Token
