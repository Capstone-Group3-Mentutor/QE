Feature: Update Mentor Profile
  Background: Login Mentor
    Given Mentor login with all valid data
    When User send request post login user
    And Set token to base Mentor Token
  @positive
  Scenario: Add task score with valid task id and valid score
    Given Mentor set task id to 85, submission id to 15, and score 90
    When User send request post submit score
    Then Should return 201 Created
  @negative
  Scenario: Add task score with invalid task id and valid score
    Given Mentor set task id to "test", submission id to 15, and score 90
    When User send request post submit score
    Then Should return 400 Bad Request
  @negative
#    BUG
  Scenario: Add task score with unregister task id and valid score
    Given Mentor set task id to 99999, submission id to 15, and score 90
    When User send request post submit score
    Then Should return 404 Not Found
  @negative
  Scenario: Add task score without task id and valid score
    Given Mentor set submission id to 15, and score 90
    When User send request post submit score
    Then Should return 400 Bad Request
  @negative
  Scenario: Add task score with valid task id and string score
    Given Mentor set task id to 85, submission id to 15, and score "seratus"
    When User send request post submit score
    Then Should return 400 Bad Request
  @negative
  Scenario: Add task score with valid task id and decimal score
    Given Mentor set task id to 85, submission id to 15, and decimal score 12.5
    When User send request post submit score
    Then Should return 400 Bad Request
  @negative
  Scenario: Add task score with valid task id and more than max score
    Given Mentor set task id to 85, submission id to 15, and score 1234
    When User send request post submit score
    Then Should return 400 Bad Request
  @negative
  Scenario: Add task score with valid task id and special char score
    Given Mentor set task id to 85, submission id to 15, and score "!@!#$"
    When User send request post submit score
    Then Should return 400 Bad Request
  @negative
  Scenario: Add task score with valid task id and empty score
    Given Mentor set task id to 85, submission id to 15
    When User send request post submit score
    Then Should return 400 Bad Request
  @negative
  Scenario: Add task score without Token
    Given Mentor set task id to 85, submission id to 15, and score 90 without token
    When User send request post submit score
    Then Should return 400 Bad Request
#  @positive @negative
##    BUG
#  Scenario: Add task score with Mentee Token
#    Given Mentor set task id to 85, submission id to 15, and score 90
#    When User send request post submit score
#    Then Should return 201 Created
#  @positive @negative
##    BUG
#  Scenario: Add task score with Admin Token
