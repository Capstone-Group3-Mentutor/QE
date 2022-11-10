Feature: Update Mentor Profile
  Background: Login Mentor
    Given Mentor login with all valid data
    When Send request post login user
    And Set token to Mentor Token
Scenario: Add mentor comment with valid forum id and valid caption
Add mentor comment with invalid forum id and valid caption
Add mentor comment with unregistered forum  id and valid caption
Add mentor comment without forum id and valid caption
Add mentor comment with valid forum id and int caption
Add mentor comment with valid forum id and float caption
Add mentor comment with valid forum id and more than max caption char
Add mentor comment with valid forum id and special char caption
Add mentor comment with valid forum id and empty data