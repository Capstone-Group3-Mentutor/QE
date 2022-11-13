Feature: Register New User
  Background: Login Admin
    Given User login with valid data
    When Send request post login user
    And Set token to Admin Token

  @Tamara #RegisterNewUser_001
  Scenario: Post create new user using valid data with authorization
    Given Post create new user with valid data
    When Send request post create new user
    Then Should return status code 201 created
#    And Post create new user with valid data json schema validator

  @Tamara #RegisterNewUser_002
  Scenario: Post create new user using valid data without authorization
    Given Post create new user without authorization
    When Send request post create new user
    Then Should return status code 400 Bad request
#    And Post create new user without authorization json schema validator

  @Tamara #RegisterNewUser_003
  Scenario: Post create new user with Empty Name in Body JSON
    Given Post create new user with empty name
    When Send request post create new user
    Then Should return status code 400 Bad request

  @Tamara #RegisterNewUser_004
  Scenario: Post create new user with Empty Email in Body JSON
    Given Post create new user with empty email
    When Send request post create new user
    Then Should return status code 400 Bad request

  @Tamara #RegisterNewUser_005
  Scenario: Post create new user with Empty Password in Body JSON
    Given Post create new user with empty password
    When Send request post create new user
    Then Should return status code 400 Bad request

  @Tamara #RegisterNewUser_006
  Scenario: Post create new user with Empty Id_Class in Body JSON
    Given Post create new user with empty id_class
    When Send request post create new user
    Then Should return status code 400 Bad request

  @Tamara #RegisterNewUser_007
  Scenario: Post create new user with Empty Role in Body JSON
    Given Post create new user with empty Role
    When Send request post create new user
    Then Should return status code 400 Bad request

  @Tamara #RegisterNewUser_008
  Scenario: Post create new user input name with more than 2 word name in body JSON
    Given Post create new user with name more than two word name
    When Send request post create new user
    Then Should return status code 400 Bad request
#    And Post create new user json schema validator

  @Tamara #RegisterNewUser_009
  Scenario: Post create new user input name with special char in body JSON
    Given Post create new user with special char in name
    When Send request post create new user
    Then Should return status code 400 Bad request
#    And Post create new user json schema validator

  @Tamara #RegisterNewUser_010
  Scenario: Post create new user input name with numeric in body JSON
    Given Post create new user with numeric in name
    When Send request post create new user
    Then Should return status code 400 Bad request
#    And Post create new user json schema validator

  @Tamara #RegisterNewUser_011
  Scenario: Post create new user input invalid email in body JSON
    Given Post create new user with invalid email
    When Send request post create new user
    Then Should return status code 400 Bad request
#    And Post create new user json schema validator

  @Tamara #RegisterNewUser_012
  Scenario: Post create new user input deleted email in body JSON
    Given Post create new user with deleted email
    When Send request post create new user
    Then Should return status code 400 Bad request
#    And Post create new user json schema validator

  @Tamara #RegisterNewUser_013
  Scenario: Post create new user input password with alphabet in body JSON
    Given Post create new user with alphabet password
    When Send request post create new user
    Then Should return status code 400 Bad request
#    And Post create new user json schema validator

  @Tamara #RegisterNewUser_014
  Scenario: Post create new user input password with numeric in body JSON
    Given Post create new user with numeric password
    When Send request post create new user
    Then Should return status code 400 Bad request
#    And Post create new user json schema validator

  @Tamara #RegisterNewUser_015
  Scenario: Post create new user input password with special char in body JSON
    Given Post create new user with special char password
    When Send request post create new user
    Then Should return status code 400 Bad request
#    And Post create new user json schema validator

  @Tamara #RegisterNewUser_016
  Scenario: Post create new user input invalid id class in body JSON
    Given Post create new user with invalid id class
    When Send request post create new user
    Then Should return status code 400 Bad request
#    And Post create new user json schema validator

  @Tamara #RegisterNewUser_017
  Scenario: Post create new user input invalid id role in body JSON
    Given Post create new user with invalid role
    When Send request post create new user
    Then Should return status code 400 Bad request
#    And Post create new user json schema validator