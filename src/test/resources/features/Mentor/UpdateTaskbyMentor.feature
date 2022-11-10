Feature: Update Mentor Profile
  Background: Login Mentor
    Given Mentor login with all valid data
    When Send request post login user
    And Set token to Mentor Token

  Scenario: Update task with valid task id and valid data
    Given mentor set parameter task id to 70
    And Mentor set update task data with id 70 Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
    When User send request put update task
    Then Should return 201 Created
#  Scenario: Update task with invalid task id and valid data
#    Given Mentor set update task data with id 1 Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
#    When User send request put update task
#    Then Should return 201 Created
#  Scenario: Update task with unregistered task id and valid data
#    Given Mentor set update task data with id 1 Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
#    When User send request put update task
#    Then Should return 201 Created
#  Scenario: Update task without task id and valid data
#    Given Mentor set update task data with id 1 Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
#    When User send request put update task
#    Then Should return 201 Created
#  Scenario: Update Task with valId Id and  numeric title
#    Given Mentor set update task data with id 1 Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
#    When User send request put update task
#    Then Should return 201 Created
#  Scenario: Update Task with valId Id and  Special Character title
#    Given Mentor set update task data with id 1 Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
#    When User send request put update task
#    Then Should return 201 Created
#  Scenario: Update Task with valId Id and  more than max character title
#    Given Mentor set update task data with id 1 Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
#    When User send request put update task
#    Then Should return 201 Created
#  Scenario: Update Task with valId Id and  numeric description
#    Given Mentor set update task data with id 1 Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
#    When User send request put update task
#    Then Should return 201 Created
#  Scenario: Update Task with valId Id and  Special Character description
#    Given Mentor set update task data with id 1 Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
#    When User send request put update task
#    Then Should return 201 Created
#  Scenario: Update Task with valId Id and  more than max character description
#    Given Mentor set update task data with id 1 Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
#    When User send request put update task
#    Then Should return 201 Created
#  Scenario: Update Task with valId Id and  invalid Images extension
#    Given Mentor set update task data with id 1 Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
#    When User send request put update task
#    Then Should return 201 Created
#  Scenario: Update Task with valId Id and  invalid file extension
#    Given Mentor set update task data with id 1 Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
#    When User send request put update task
#    Then Should return 201 Created
#  Scenario: Update Task with valId Id and  big file size
#    Given Mentor set update task data with id 1 Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
#    When User send request put update task
#    Then Should return 201 Created
#  Scenario: Update Task with valId Id and  invalid and  time format
#    Given Mentor set update task data with id 1 Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
#    When User send request put update task
#    Then Should return 201 Created
#  Scenario: Update task with Mentee Token
#    Given Mentor set update task data with id 1 Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
#    When User send request put update task
#    Then Should return 201 Created
#  Scenario: Update task with Admin Token
#    Given Mentor set update task data with id 1 Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
#    When User send request put update task
#    Then Should return 201 Created
#  Scenario: Update task without Token
#    Given Mentor set update task data with id 1 Title "Trial Intelej", Description "Percobaan di intelej", Time "2022-12-05"
#    When User send request put update task
#    Then Should return 201 Created
