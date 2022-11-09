Feature: Get Single User
  Background: Login Admin
    Given User login with all valid data
    When Send request post login user
    Then Should return 200 OK
    And Set token to Admin Token

  @Tamara
  Scenario Outline: Get Single User with Valid Id
    Given Get all user using valid id <id> with authorization
    When Send request get single user
    Then Should return 200 OK
    And Response body page should contain message "Success Get Profile"
    And Get single user json schema validator
    Examples:
    |id|
    |9 |
    |1002|

  @Tamara
  Scenario: Get Single User Using Valid Id without Authorization
    Given Get all user using valid path "user" without authorization
    When Send request get all user
    Then Should return 400 Bad request

  @Tamara
  Scenario: Get Single User with Invalid Id
    Given Get all user using valid path "user" with authorization
    When Send request get all user
    Then Should return 200 OK
