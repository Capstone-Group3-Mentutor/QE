Feature: Update Mentor Profile
  Background: Login Mentor
    Given Mentor login with all valid data
    When Send request post login user
    And Set token to Mentor Token
  Scenario: Add mentor comment with valid forum id and valid caption
  Given Mentor set forum id to 1 and comment "saya sih yes"
  When User send request post add comment
  Then Should return 201 Created
  Scenario: Add mentor comment with invalid forum id and valid caption
  Scenario: Add mentor comment with unregistered forum  id and valid caption
  Scenario: Add mentor comment without forum id and valid caption
  Scenario: Add mentor comment with valid forum id and int caption
  Scenario: Add mentor comment with valid forum id and float caption
  Scenario: Add mentor comment with valid forum id and more than max caption char
  Scenario: Add mentor comment with valid forum id and special char caption
  Scenario: Add mentor comment with valid forum id and empty data