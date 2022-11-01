Feature: Register new user by admin

  As an admin,
  Ganteng want to _register new user_
  In order to ***create new user***

  Scenario: Verify POST register new user with valid data
    Given Admin set URL to register endpoint
    When he send request POST register new user
    Then Response is as expected

