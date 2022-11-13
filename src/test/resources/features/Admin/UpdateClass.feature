Feature: Update Class
  Background: Login Admin
    Given User login with valid data
    When Send request post login user
    And Set token to Admin Token

  @Tamara #UpdateClass_001
  Scenario Outline: Put update class with valid class_name
    Given Put update class with id <id> and set class_name "Bahasa kalbu"
    When Send request put update class
    Then Should return status code 201 created
    Examples:
      | id |
      | 17 |

  @Tamara #UpdateClass_002
  Scenario Outline: Put update class with valid status
    Given Put update class with id <id> and set status "non_active"
    When Send request put update class
    Then Should return status code 201 created
    Examples:
      | id |
      | 17 |

  @Tamara #UpdateClass_003
  Scenario Outline: Put update class without authorization
    Given Put update class with id <id> unAuthorization
    When Send request put update class
    Then Should return status code 400 Bad request
    Examples:
      | id |
      | 17 |

  @Tamara #UpdateClass_004
  Scenario Outline: Put update class with all data empty in body JSON
    Given Put update class with id <id> all data empty
    When Send request put update class
    Then Should return status code 400 Bad request
    Examples:
      | id |
      | 17 |

  @Tamara #UpdateClass_005
  Scenario Outline: Put Update with Numeric Class Name in Body JSON
    Given Put update class with id <id> and class_name 654321
    When Send request put update class
    Then Should return status code 400 Bad request
    Examples:
      | id |
      | 17 |

  @Tamara #UpdateClass_006
  Scenario Outline: Put Update with Special char in Body JSON
    Given Put update class with id <id> and class_name "@!$%^*"
    When Send request put update class
    Then Should return status code 400 Bad request
    Examples:
      | id |
      | 17 |

#  @Tamara #UpdateClass_007
#  Scenario Outline: Put Update with Class Name more than max character in Body JSON
#    Given Put update class with id <id> and class_name "@!$%^*"
#    When Send request put update class
#    Then Should return status code 201 created
#    Examples:
#      | id |
#      | 41 |

  @Tamara #UpdateClass_008
  Scenario Outline: Put Update with Numeric Status in Body JSON
    Given Put update class with id <id> and status 123456
    When Send request put update class
    Then Should return status code 400 Bad request
    Examples:
      | id |
      | 17 |

  @Tamara #UpdateClass_009
  Scenario Outline: Put Update with Special Char Status in Body JSON
    Given Put update class with id <id> and status "@#$%&"
    When Send request put update class
    Then Should return status code 400 Bad request
    Examples:
      | id |
      | 17 |



