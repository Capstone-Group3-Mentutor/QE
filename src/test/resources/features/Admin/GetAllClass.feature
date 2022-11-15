Feature: Get All Class
  Background: Login Admin
    Given User login with valid data
    When Send request post login user
    And Set token to Admin Token

  @Tamara @positive  #GetAllClass_001
  Scenario: Get All Class with Authorization
    Given Get all class using valid path with authorization
    When Send request get all class
    Then Should return status code 200 OK

  @Tamara @negative  #GetAllClass_002
  Scenario: Get All Class without Authorization
    Given Get all class using valid path without authorization
    When Send request get all class
    Then Should return status code 400 Bad request
