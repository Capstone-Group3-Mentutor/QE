Feature: Login users

  Background: : Login Admin
    Given User login with all valid data
    When Send request post login user

    Then Should return 200 OK
    And Set token to Mentor Token

#  Scenario: Register New User with Authorization and Valid Data
#    Given Admin register new mentor
#    When Admin send request post new user
#    Then Should return 200 OK

  Scenario: Update profile Mentor with all valid data
    Given User set update profile data
    When User send request put update data
    Then Should return 201 Created
