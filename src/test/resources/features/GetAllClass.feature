Feature: Get All Class
  Background: Login Admin
    Given User login with all valid data
    When Send request post login user
    Then Should return 200 OK
    And Set token to Admin Token

  @Tamara
  Scenario: Get All Class with Authorization
    Given Get all class using valid path "classes" with authorization
    When Send request get all class
    Then Should return 200 OK

  @Tamara
  Scenario: Get All Class without Authorization
    Given Get all class using valid path "classes" without authorization
    When Send request get all class
    Then Should return 400 Bad request
