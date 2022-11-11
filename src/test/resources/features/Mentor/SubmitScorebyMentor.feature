Feature: Update Mentor Profile
  Background: Login Mentor
    Given Mentor login with all valid data
    When User send request post login user
    And Set token to Mentor Token

  Scenario: Add task score with valid task id and valid score
    Given Mentor set task id to 85, submission id to 15, and score 90
    When User send request post submit score
    Then Should return 201 Created
  Scenario: Add task score with invalid task id and valid score
    Given Mentor set task id to 85, submission id to 15, and score 90
    When User send request post submit score
    Then Should return 201 Created
  Scenario: Add task score with unregisted task id and valid score
  Scenario: Add task score without task id and valid score
  Scenario: Add task score with valid task id and string score
  Scenario: Add task score with valid task id and float score
  Scenario: Add task score with valid task id and more than max score
  Scenario: Add task score with valid task id and special char score
  Scenario: Add task score with valid task id and empty score
  Scenario: Add task score with Mentee Token
  Scenario: Add task score with Admin Token
  Scenario: Add task score without Token
