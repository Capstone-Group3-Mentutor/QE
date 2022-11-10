Feature: Update Mentor Profile
  Background: Login Mentor
    Given Mentor login with all valid data
    When Send request post login user
    And Set token to Mentor Token

    Scenario: Add task score with valid task id and valid score
    Add task score with invalid task id and valid score
    Add task score with unregisted task id and valid score
    Add task score without task id and valid score
    Add task score with valid task id and string score
    Add task score with valid task id and float score
    Add task score with valid task id and more than max score
    Add task score with valid task id and special char score
    Add task score with valid task id and empty score
    Add task score with Mentee Token
    Add task score with Admin Token
    Add task score without Token
