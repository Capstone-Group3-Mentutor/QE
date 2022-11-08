Feature: Update Mentor Profile
  Background: Login Mentor
    Given User login with all valid data
    When Send request post login user
    Then Should return 200 OK

    And Set token to Mentor Token

  Scenario: Update profile Mentor with all valid data
    Given Mentor set update profile data
    When User send request put update data
    Then Should return 201 Created