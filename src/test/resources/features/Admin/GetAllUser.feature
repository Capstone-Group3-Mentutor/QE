Feature: Get All User
  Background: Login Admin
    Given User login with valid data
    When Send request post login user
    And Set token to Admin Token

  @Tamara @positive #GetAllUser_001
  Scenario: Get All User with Authorization
    Given Get all user using valid path with authorization
    When Send request get all user
    Then Should return status code 200 OK

  @Tamara @negative #GetALlUser_002
  Scenario: Get All User without Authorization
    Given Get all user using valid path without authorization
    When Send request get all user
    Then Should return status code 400 Bad request
