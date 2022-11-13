Feature: Update User
  Background: Login Admin
    Given User login with valid data
    When Send request post login user
    And Set token to Admin Token

  @Tamara #UpdateUser_001
  Scenario Outline: Put update user with all valid data and authorization
    Given Update user with id <id> set request body name "<name>", email "<email>", password "<password>", images "<images>" and id_class <id_class>
    When Send request put update user
    Then Should return status code 201 created
    Examples:
      | id | name | email | password | images | id_class |
      | 1009 | Tuti Astuti | tuti.tutut@gmail.com | Tuti123$ | testImageValid.PNG | 2 |

  @Tamara #UpdateUser_002
  Scenario Outline: Put update user with all valid data and unauthorization
    Given Update user with id <id> set request body name "<name>", email "<email>", password "<password>", images "<images>" and id_class <id_class> without authorization
    When Send request put update user
    Then Should return status code 400 Bad request
    Examples:
      | id | name | email | password | images | id_class |
      | 1009 | Tuti Astuti | tuti.tutut@gmail.com | Tuti123$ | testImageValid.PNG | 2 |

  @Tamara #UpdateUser_003
  Scenario Outline: Put update user with input numeric name
    Given Put update user with id <id> and set name 1506670010
    When Send request put update user
    Then Should return status code 400 Bad request
    Examples:
      | id |
      | 1009 |

  @Tamara #UpdateUser_004
  Scenario Outline: Put update user with input special char name
    Given Put update user with id <id> and set name "@!@$!*!*"
    When Send request put update user
    Then Should return status code 400 Bad request
    Examples:
      | id |
      | 1009 |

  @Tamara #UpdateUser_005
  Scenario Outline: Put update user with invalid email
    Given Put update user with id <id> and set invalid email "<email>"
    When Send request put update user
    Then Should return status code 400 Bad request
    Examples:
      | id | email |
      | 1009 | cecilia.updategmail.com |
      | 1009 | cecilia.update@gmailcom |
      | 1009 | CECILIA>UPDATE@GMAIL.COM|

  @Tamara #UpdateUser_006
  Scenario Outline: Put update user with numeric password
    Given Put update user with id <id> and set password 12345678
    When Send request put update user
    Then Should return status code 400 Bad request
    Examples:
      | id |
      | 1009 |

  @Tamara #UpdateUser_007
  Scenario Outline: Put update user with invalid password
    Given Put update user with id <id> and set password "<password>"
    When Send request put update user
    Then Should return status code 400 Bad request
    Examples:
      | id | password |
      | 1009 | ceciliatester |
      | 1009 | @$%^&@*# |
      | 1009 | Cecil1$ |

  @Tamara #UpdateUser_008
  Scenario Outline: Put update user with invalid images extention
    Given Put update user with id <id> and set images "<file>"
    When Send request put update user
    Then Should return status code 400 Bad request
    Examples:
      | id | file |
      | 1009 | testImageInvalid.jpg |

  @Tamara #UpdateUser_009
  Scenario Outline: Put update user with id_class not registered
    Given Put update user with id <id> and set id_Class 100
    When Send request put update user
    Then Should return status code 400 Bad request
    Examples:
      | id |
      | 1009 |

  @Tamara #UpdateUser_010
  Scenario: Put update user with all empty data in body JSON
    Given Update user with id 1009 set request empty body name " ", email " ", password " ", images " " and id_class 0
    When Send request put update user
    Then Should return status code 400 Bad request


