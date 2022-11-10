Feature: Register New User
  Background: Login Admin
    Given User login with all valid data
    When Send request post login user
    Then Should return 200 OK
    And Set token to Admin Token

