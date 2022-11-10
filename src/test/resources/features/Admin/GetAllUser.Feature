Feature: Get All User
  Background: Login Admin
    Given User login with all valid data
    When Send request post login user
    Then Should return 200 OK
    And Set token to Admin Token

  @Tamara #GetAllUser_001
  Scenario: Get All User with Authorization
    Given Get all user using valid path "users" with authorization
    When Send request get all user
    Then Should return status code 200 OK

  @Tamara #GetALlUser_002
  Scenario: Get All User without Authorization
    Given Get all user using valid path "users" without authorization
    When Send request get all user
    Then Should return status code 400 Bad request
