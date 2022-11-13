Feature: Delete a class
  Background: Login Admin
    Given User login with valid data
    When Send request post login user
    And Set token to Admin Token

  @Tamara #DeleteClass_001
  Scenario Outline: Delete Exiting Class with Valid Id
    Given Delete class with valid id <id>
    When Send request delete a class
    Then Should return status code 200 OK
    Examples:
    | id |
    | 21 |


  @Tamara #DeleteClass_002
  Scenario Outline: Delete Exiting Class without Authorized
    Given Delete class valid id <id> without authorized
    When Send request delete a class
    Then Should return status code 400 Bad request
    Examples:
      | id |
      | 19 |


  @Tamara #DeleteClass_003
  Scenario Outline: Delete Exiting Class With Unregistered Id
    Given Delete class unregistered Id <id>
    When Send request delete a class
    Then Should return status code 400 Bad request
    Examples:
      | id |
      | 500 |

  @Tamara #DeleteClass_004
  Scenario Outline: Delete Exiting Class With Invalid Id
    Given Delete class invalid Id "<id>"
    When Send request delete a class
    Then Should return status code 400 Bad request
    Examples:
      | id |
      | twelve |
      | @*@!*@ |

  @Tamara
  Scenario Outline: Delete Exiting Class With Id has been deleted
    Given Delete class with Id <id> has been deleted
    When Send request delete a class
    Then Should return status code 400 Bad request
    Examples:
      | id |
      | 5 |

