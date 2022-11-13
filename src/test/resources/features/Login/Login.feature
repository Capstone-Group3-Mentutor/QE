Feature: Login All users
  @positive
  Scenario Outline: Login user with valid data
    Given User login with email "<email>" and password "<passowrd>"
    When User send request post login user
    Then Should return 200 OK
    And Response body massage is "login successful"
    Examples:
    |email                    |passowrd   |
    |admin.mentutor@gmail.com |Admin123$  |
  @negative
  Scenario Outline: Login user with unregistered email
    Given User login with email "<email>" and password "<passowrd>"
    When User send request post login user
    Then Should return 404 Not Found
    Examples:
      |email                    |passowrd   |
      |harusnyakosong@gmail.com |Admin123$  |
  @negative
#    BUG
  Scenario Outline: Login user with invalid email
    Given User login with email "<email>" and password "<passowrd>"
    When User send request post login user
    Then Should return 400 Bad Request
    Examples:
      |email                    |passowrd   |
      |1241234                  |Admin123$  |
      |!#@#@$                   |Admin123$  |
      |adminmentutor           |Admin123$  |
#  BUG incosisten respon code
#      |admin.mentutorgmail.com  |Admin123$  |
#      |admin.mentutor@gmailcom  |Admin123$  |
  @negative
  Scenario Outline: Login user with invalid password
    Given User login with email "<email>" and password "<passowrd>"
    When User send request post login user
    Then Should return 400 Bad Request
    Examples:
      |email                    |passowrd   |
      |admin.mentutor@gmail.com |214123454  |
      |admin.mentutor@gmail.com |!@!!#@$#$  |
      |admin.mentutor@gmail.com |ataweasdr  |
  @negative
  Scenario Outline: Login user with all invalid data
    Given User login with email "<email>" and password "<passowrd>"
    When User send request post login user
    Then Should return 400 Bad Request
    Examples:
      |email         |passowrd    |
      |adminmentutor |213213      |
  @negative
  Scenario Outline: Login user with empty email
    Given User login with email "<email>" and password "<passowrd>"
    When User send request post login user
    Then Should return 400 Bad Request
    Examples:
      |email  |passowrd   |
      |       |Admin123$  |
  @negative
  Scenario Outline: Login user with empty password
    Given User login with email "<email>" and password "<passowrd>"
    When User send request post login user
    Then Should return 400 Bad Request
    Examples:
      |email                    |passowrd   |
      |admin.mentutor@gmail.com |           |
  @negative
  Scenario Outline: Login user with all empty data
    Given User login with email "<email>" and password "<passowrd>"
    When User send request post login user
    Then Should return 400 Bad Request
    Examples:
      |email|passowrd|
      |     |        |
  #    And Response body should contain id user 1, name "Admin", email "admin.mentutor@gmail.com", class "" and role "admin"
#    And Response body massage error is "user not found"
#    And Response body massage error is "Invalid Input From Client"