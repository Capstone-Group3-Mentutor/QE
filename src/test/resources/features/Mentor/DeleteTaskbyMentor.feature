Feature: Update Mentor Profile
  Background: Login Mentor
    Given Mentor login with all valid data
    When User send request post login user
    And Set token to base Mentor Token
  @positive
  Scenario: Delete task with valid task id
    Given Mentor set task id to 104
    When User send request delete task
    Then Should return 201 Created
  @negative
  Scenario: Delete task with invalid task id
    Given Mentor set task id to "test"
    When User send request delete task
    Then Should return 400 Bad Request
  @negative
#    BUG
  Scenario: Delete task with unregistered task id
    Given Mentor set task id to 9999999
    When User send request delete task
    Then Should return 404 Not Found
  @negative
  Scenario: Delete task without task id
    Given Mentor set mentor token without set task id
    When User send request delete task
    Then Should return 400 Bad Request
  @negative
  Scenario: Delete task without Token
    Given Mentor set task id to 87 without token
    When User send request delete task
    Then Should return 400 Bad Request
#  Scenario: Delete task with Mentee Token
#  Scenario: Delete task with Admin Token