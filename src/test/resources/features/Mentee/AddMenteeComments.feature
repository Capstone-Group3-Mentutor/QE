Feature: Add Mentee Comment
  Background: Login Mentee
    Given Mentee login with all valid data
    When User send request post login user
    And Set token to base Mentee Token
  @positive
  Scenario: Add Mentee comment with valid forum id and valid caption
    Given User set forum id to 1 and comment "Sip deh"
    When User send request post add comment
    Then Should return 201 Created
  @negative
    # BUG
  Scenario: Add Mentee comment with invalid forum id and valid caption
    Given User set forum id to "test" and comment "saya sih yes"
    When User send request post add comment
    Then Should return 400 Bad Request

  @negative
    # BUG
  Scenario: Add Mentee comment with unregistered forum  id and valid caption
    Given User set forum id to 9999999 and comment "saya sih yes"
    When User send request post add comment
    Then Should return 404 Not Found
#  Scenario: Add Mentee comment without forum id and valid caption
#    Given User set comment "saya sih yes"
#    When User send request post add comment
#    Then Should return 404 Not Found
  Scenario: Add Mentee comment with valid forum id and int caption
    Given User set forum id to 1 and comment 2141512
    When User send request post add comment
    Then Should return 201 Created
  Scenario: Add Mentee comment with valid forum id and float caption
    Given User set forum id to 1 and comment to 21.245
    When User send request post add comment
    Then Should return 201 Created

  @negative
    # BUG
  Scenario: Add Mentee comment with valid forum id and more than max caption char
    Given User set forum id to 1 and comment "asfdarewfvadgvaefraoicnasovhafhasocnaodivfnawpdijawspfcjapoifnaoisfnasvoinafoashas0ioasoidnasoidoioasijdaosidjasiojasdasdoiajdoiasjaiwporjaoiwdjasonaksdjapsiodjoaisndoasidjjdadjasoidjasdoinasoiasncoiisanfoaisjdaosidjaasdaroinsfciuasfaoisjdoaisdjasoidasoidjasoidjassidjasdachar"
    When User send request post add comment
    Then Should return 201 Created
  Scenario: Add Mentee comment with valid forum id and special char caption
    Given User set forum id to 1 and comment "!@$$%@%#$"
    When User send request post add comment
    Then Should return 201 Created

  @negative
    # BUG
  Scenario: Add Mentee comment with valid forum id and empty data
    Given User set forum id to 1
    When User send request post add comment
    Then Should return 201 Created