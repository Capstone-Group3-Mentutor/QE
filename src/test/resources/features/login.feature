Feature: Login users

  Background: : Login Admin
    Given User login with all valid data
    When Send request post login user
    And Set token to Mentor Token

  Scenario: Update profile Mentor with all valid data
    Given User set update profile data
    When User send request put update data
    Then Should return 201 Created
