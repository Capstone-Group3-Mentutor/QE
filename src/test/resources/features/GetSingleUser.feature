Feature: Get Single User
  Background: Login Admin
    Given User login with all valid data
    When Send request post login user
    Then Should return 200 OK
    And Set token to Admin Token

  @Tamara #GetSingleUser_001
  Scenario Outline: Get Single User with Valid Id User
    Given Get single user using valid id <id> with authorization
    When Send request get single user
    Then Should return status code 200 OK
    And Response body should contain message "Success Get Profile"
    And Get single user json schema validator
    Examples:
    |id|
    |9 |

  @Tamara #GetSingleUser_002
  Scenario Outline: Get Single User Using Valid Id User without Authorization
    Given Get single user using valid id <id> without authorization
    When Send request get single user
    Then Should return status code 400 Bad request
    And Response body should contain message "Invalid Input from Client"
    And Get single user json schema validator
    Examples:
      |id|
      |9 |

  @Tamara #GetSingleUser_003
  Scenario Outline: Get Single User with Unregistered Id User
    Given Get single user with unregistered id <id>
    When Send request get single user
    Then Should return status code 405 Method Not Allowed
    And Response body should contain message "Method Not Allowed"
    And Get single user json schema validator
    Examples:
      |id|
      |9 |

  @Tamara #GetSingleUser_004
  Scenario Outline: Get Single User with Invalid Id User
    Given Get single user with invalid id "<id>"
    When Send request get single user
    Then Should return status code 400 Bad request
    And Response body should contain message "Invalid Input from Client"
    And Get single user json schema validator
    Examples:
      |id|
      |@!$@ |
      |one  |

  @Tamara #GetSingleUser_005
  Scenario Outline: Get Single User with Id User has been Deleted
    Given Get single user with id <id> has been deleted
    When Send request get single user
    Then Should return status code 400 Bad request
    And Response body should contain message "Invalid Input from Client"
    And Get single user json schema validator
    Examples:
      |id|
      |5 |

