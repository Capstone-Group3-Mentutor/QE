Feature: AssignTask
  Background: Login Mentee
    Given Mentee login with all valid data
    When User send request post login user
    And Set token to base Mentee Token
  @positive
  Scenario: Assign task with valid task id and valid file data
    Given User set task id to 3 and file "testFileValid.pdf"
    When User send request post submit task
    Then Should return 201 Created
  Scenario: Assign task with invalid task id and valid file data
    Given User set task id to "test" and file "testFileValid.pdf"
    When User send request post submit task
    Then Should return 400 Bad Request
  Scenario: Assign task with unregistered task id and valid file data
    Given User set task id to 99999 and file "testFileValid.pdf"
    When User send request post submit task
    Then Should return 400 Bad Request
  Scenario: Assign task with valid task id and invalid file data
    Given User set task id to 88 and file "testImageValid.PNG"
    When User send request post submit task
    Then Should return 400 Bad Request
  Scenario: Assign task with valid task id and big file size
    Given User set task id to 88 and file "testFileInvalid.pdf"
    When User send request post submit task
    Then Should return 400 Bad Request
  Scenario: Assign task without Token
    Given User set task id to 88 and file "testFileValid.pdf" without token
    When User send request post submit task
    Then Should return 400 Bad Request
#  Scenario: Assign task with Mentor Token
#  Scenario: Assign task with Admin Token
#  Scenario: Assign  task with already submitted task id
#    Given User set task id to 3 and file "testFileValid.pdf"
#    When User send request post submit task
#    Then Should return 400 Bad Request
