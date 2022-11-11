Feature: Update Mentor Profile
  Background: Login Mentor
#    Given Admin reset Mentor data
    Given Mentor login with all valid data
    When Send request post login user
    And Set token to Mentor Token
    @positive
  Scenario: Add mentor comment with valid forum id and valid caption
  Given Mentor set forum id to 1 and comment "saya sih yes"
  When User send request post add comment
  Then Should return 201 Created
      @negative
  Scenario: Add mentor comment with invalid forum id and valid caption
    Given Mentor set forum id to "test" and comment "saya sih yes"
    When User send request post add comment
    Then Should return 400 Bad Request
  Scenario: Add mentor comment with unregistered forum  id and valid caption
    Given Mentor set forum id to 9999999 and comment "saya sih yes"
    When User send request post add comment
    Then Should return 404 Not Found
  Scenario: Add mentor comment without forum id and valid caption
    Given Mentor set comment "saya sih yes"
    When User send request post add comment
    Then Should return 404 Not Found
  Scenario: Add mentor comment with valid forum id and int caption
    Given Mentor set forum id to 1 and comment 2141512
    When User send request post add comment
    Then Should return 201 Created
  Scenario: Add mentor comment with valid forum id and float caption
    Given Mentor set forum id to 1 and comment to 21.245
    When User send request post add comment
    Then Should return 201 Created
  Scenario: Add mentor comment with valid forum id and more than max caption char
    Given Mentor set forum id to 1 and comment "asfdarewfvadgvaefraoicnasovhafhasocnaodivfnawpdijawspfcjapoifnaoisfnasvoinafoashas0ioasoidnasoidoioasijdaosidjasiojasdasdoiajdoiasjaiwporjaoiwdjasonaksdjapsiodjoaisndoasidjjdadjasoidjasdoinasoiasncoiisanfoaisjdaosidjaasdaroinsfciuasfaoisjdoaisdjasoidasoidjasoidjassidjasdachar"
    When User send request post add comment
    Then Should return 201 Created
  Scenario: Add mentor comment with valid forum id and special char caption
    Given Mentor set forum id to 1 and comment "!@$$%@%#$"
    When User send request post add comment
    Then Should return 201 Created
  Scenario: Add mentor comment with valid forum id and empty data
    Given Mentor set forum id to 1
    When User send request post add comment
    Then Should return 201 Created