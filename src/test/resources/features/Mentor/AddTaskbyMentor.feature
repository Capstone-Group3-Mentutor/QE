Feature: Add Task by Mentor
  Background: Login Mentor
    Given Mentor login with all valid data
    When Send request post login user
    And Set token to Mentor Token

  Scenario: Create Task with all valid data
    Given Mentor set create task data with Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
    When User send request post create task
    Then Should return 201 Created
  Scenario: Create Task with numeric title
    Given Mentor set create task data with Title "12324", Description "Percobaan di intelej", Time "2022-12-05"
    When User send request post create task
    Then Should return 201 Created
  Scenario: Create Task with Special Character title
    Given Mentor set create task data with Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
    When User send request post create task
    Then Should return 201 Created
  Scenario: Create Task with more than max character title
    Given Mentor set create task data with Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
    When User send request post create task
    Then Should return 201 Created
  Scenario: Create Task with numeric description
    Given Mentor set create task data with Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
    When User send request post create task
    Then Should return 201 Created
  Scenario: Create Task with Special Character description
    Given Mentor set create task data with Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
    When User send request post create task
    Then Should return 201 Created
  Scenario: Create Task with more than max character description
    Given Mentor set create task data with Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
    When User send request post create task
    Then Should return 201 Created
  Scenario: Create Task with invalid Images extension
    Given Mentor set create task data with Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
    When User send request post create task
    Then Should return 201 Created
  Scenario: Create Task with invalid file extension
    Given Mentor set create task data with Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
    When User send request post create task
    Then Should return 201 Created
  Scenario: Create Task with big file size
    Given Mentor set create task data with Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
    When User send request post create task
    Then Should return 201 Created
  Scenario: Create Task with invalid time format
    Given Mentor set create task data with Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
    When User send request post create task
    Then Should return 201 Created
  Scenario: Create Task with incomplete data
    Given Mentor set create task data with Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
    When User send request post create task
    Then Should return 201 Created
  Scenario: Create Task with empty data
    Given Mentor set create task data with Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
    When User send request post create task
    Then Should return 201 Created
  Scenario: Create Task with Mentee Token
    Given Mentor set create task data with Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
    When User send request post create task
    Then Should return 201 Created
  Scenario: Create Task with Admin Token
    Given Mentor set create task data with Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
    When User send request post create task
    Then Should return 201 Created
  Scenario: Create Task without Token
    Given Mentor set create task data with Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
    When User send request post create task
    Then Should return 201 Created