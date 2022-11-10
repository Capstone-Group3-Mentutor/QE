Feature: Update Mentor Profile
  Background: Login Mentor
    Given Mentor login with all valid data
    When Send request post login user
    And Set token to Mentor Token

Scenario: Get all task with valid mentor id
  Given Mentor set token to Mentor Token
  When User send request get all task
  Then Should return 201 Created
#Scenario: Get all task use mentor id with Admin Token
#  Given Mentor set token to Admin Token
#  When User send request get all task
#  Then Should return 400 Bad Request
#Scenario: Get all task use mentor id with Mentee Token
#  Given Mentor set token to Mentor Token
#  When User send request get all task
#  Then Should return 400 Bad Request
Scenario: Get all task use mentor id without Token
  When User send request get all task
  Then Should return 400 Bad Request
