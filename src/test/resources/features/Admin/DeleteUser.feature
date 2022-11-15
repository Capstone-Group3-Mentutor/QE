Feature: Delete User Account
  Background: Login Admin
    Given User login with valid data
    When Send request post login user
    And Set token to Admin Token

  @Tamara @positive #DeleteUser_001
  Scenario Outline: Delete User Account with Valid Id
    Given Delete user with valid id <id>
    When Send request delete a user
    Then Should return status code 200 OK
    Examples:
      | id |
      | 26  |

  @Tamara @negative #DeleteUser_002
  Scenario Outline: Delete User Account without Authorized
    Given Delete user valid id <id> without authorized
    When Send request delete a user
    Then Should return status code 400 Bad request
    Examples:
      | id |
      | 7  |

  @Tamara @negative #DeleteUser_003
  Scenario Outline: Delete User Account With Unregistered Id
    Given Delete user unregistered Id <id>
    When Send request delete a user
    Then Should return status code 400 Bad request
    Examples:
      | id |
      | 200 |

  @Tamara @negative #DeleteUser_004
  Scenario Outline: Delete User Account With Invalid Id
    Given Delete user invalid Id "<id>"
    When Send request delete a user
    Then Should return status code 400 Bad request
    Examples:
      | id |
      | twelve |
      | @*@!*@ |

  @Tamara @negative #DeleteUser_005
  Scenario Outline: Delete User Account With Id has been deleted
    Given Delete user with Id <id> has been deleted
    When Send request delete a user
    Then Should return status code 400 Bad request
    Examples:
      | id |
      | 3 |
