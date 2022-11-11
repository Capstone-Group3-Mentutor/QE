Feature: Delete User Account
  Background: Login Admin
    Given User login with all valid data
    When Send request post login user
    Then Should return 200 OK
    And Set token to Admin Token

  @Tamara #DeleteUser_001
  Scenario Outline: Delete User Account with Valid Id
    Given Delete user with valid id <id>
    When Send request delete a user
    Then Should return status code 200 OK
    And Response body should contain message "Success Delete Class"
    Examples:
      | id |
      | 9 |
      | 10 |

  @Tamara #DeleteUser_002
  Scenario Outline: Delete User Account without Authorized
    Given Delete user valid id <id> without authorized
    When Send request delete a user
    Then Should return status code 400 Bad request
    And Response body should contain message "Invalid Input from Client"
    Examples:
      | id |
      | 9 |
      | 10 |

  @Tamara #DeleteUser_003
  Scenario Outline: Delete User Account With Unregistered Id
    Given Delete user unregistered Id <id>
    When Send request delete a user
    Then Should return status code 405 Method Not Allowed
    And Response body should contain message "Method Not Allowed"
    Examples:
      | id |
      | 200 |
      | 300 |

  @Tamara #DeleteUser_004
  Scenario Outline: Delete User Account With Invalid Id
    Given Delete user unregistered Id "<id>"
    When Send request delete a user
    Then Should return status code 400 Bad request
    And Response body should contain message "Invalid Input from Client"
    Examples:
      | id |
      | twelve |
      | @*@!*@ |

  @Tamara #DeleteUser_005
  Scenario Outline: Delete User Account With Id has been deleted
    Given Delete user with Id <id> has been deleted
    When Send request delete a user
    Then Should return status code 400 Bad request
    And Response body should contain message "Invalid Input from Client"
    Examples:
      | id |
      | 22 |
      | 21 |
