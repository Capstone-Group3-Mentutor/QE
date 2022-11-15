Feature: Get Single User
  Background: Login Admin
    Given User login with valid data
    When Send request post login user
    And Set token to Admin Token

  @Tamara @positive #GetSingleUser_001
  Scenario Outline: Get Single User with Valid Id User
    Given Get single user using valid id <id> with authorization
    When Send request get single user
    Then Should return status code 200 OK
    And Get single user with valid id json schema validator
    Examples:
    |id|
    |1005 |

  @Tamara @negative #GetSingleUser_002
  Scenario Outline: Get Single User Using Valid Id User without Authorization
    Given Get single user using valid id <id> without authorization
    When Send request get single user
    Then Should return status code 400 Bad request
    And Get single user without authorization json schema validator
    Examples:
      |id|
      |1005 |

  @Tamara @negative #GetSingleUser_003
  Scenario Outline: Get Single User with Unregistered Id User
    Given Get single user with unregistered id <id>
    When Send request get single user
    Then Should return status code 400 Bad request
    And Get single user with unregister id json schema validator
    Examples:
      |id|
      |500 |

  @Tamara @negative #GetSingleUser_004
  Scenario Outline: Get Single User with Invalid Id User
    Given Get single user with invalid id "<id>"
    When Send request get single user
    Then Should return status code 400 Bad request
    And Get single user with invalid id json schema validator
    Examples:
      |id|
      |@!$@ |
      |one  |

  @Tamara @negative #GetSingleUser_005
  Scenario Outline: Get Single User with Id User has been Deleted
    Given Get single user with id <id> has been deleted
    When Send request get single user
    Then Should return status code 400 Bad request
    And Get single user with Id User has been Deleted json schema validator
    Examples:
      |id|
      |1007 |

