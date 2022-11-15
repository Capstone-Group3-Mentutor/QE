Feature: Get All Status
  Background: Login As A Mentee
    Given User login as a mentee with valid data
    When Send request post login as a mentee
    And Set token as a mentee token

    @Tamara @positive #GetAllStatus_001
  Scenario: Get All Status with Authorization
      Given Get all status using valid path with authorization
      When send request get all status
      Then Should return status code 200 OK

    @Tamara @negative #GetAllStatus_002
  Scenario: Get All Status without Authorization
    Given Get all status using valid path without authorization
    When send request get all status
    Then Should return status code 400 Bad request


