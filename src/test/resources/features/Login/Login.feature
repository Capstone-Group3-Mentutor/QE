Feature: Login All users
  Scenario: Login user with valid data
    Given User login with all valid data
    When Send request post login user
    Then Should return 200 OK
    And Response body massage is "login successful"
    And Response body should contain id user 1, name "Admin", email "admin.mentutor@gmail.com", class "" and role "admin"
  Scenario:Login user with unregistered email
    Given User set login data wit unregistered email
    When Send request post login user
    Then Should return 404 Not Found
#    And Response body massage error is "user not found"
  Scenario:Login user with invalid email
    Given User login with invalid email
    When Send request post login user
    Then Should return 400 Bad Request
#    And Response body massage error is "Invalid Input From Client"
  Scenario:Login user with invalid password
    Given User login with invalid Password
    When Send request post login user
    Then Should return 400 Bad Request
  Scenario:Login user with all invalid data
    Given User login with all invalid data
    When Send request post login user
    Then Should return 400 Bad Request
  Scenario:Login user with empty email
    Given User login with empty email
    When Send request post login user
    Then Should return 400 Bad Request
  Scenario:Login user with empty password
    Given User login with empty password
    When Send request post login user
    Then Should return 400 Bad Request
  Scenario:Login user with all empty data
    Given User login with all empty data
    When Send request post login user
    Then Should return 400 Bad Request