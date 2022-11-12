Feature: Get All Task by Class
  Background: Login Mentee
    Given Mentee login with all valid data
    When User send request post login user
#    Then Should return 200 OK
    And Set token to base Mentor Token

  Scenario: Add mentee comment with valid forum id and valid caption
  Scenario: Add mentee comment with invalid forum id and valid caption
  Scenario: Add mentee comment with unregistered forum  id and valid caption
  Scenario: Add mentee comment without forum id and valid caption
  Scenario: Add mentee comment with valid forum id and int caption
  Scenario: Add mentee comment with valid forum id and float caption
  Scenario: Add mentee comment with valid forum id and more than max caption char
  Scenario: Add mentee comment with valid forum id and special char caption
  Scenario: Add mentee comment with valid forum id and empty data