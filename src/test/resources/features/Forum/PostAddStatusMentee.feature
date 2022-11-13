Feature: Get All Status
  Background: Login As A Mentee
    Given User login as a mentee with valid data
    When Send request post login as a mentee
    And Set token as a mentee token

  @Tamara #AddStatus_001
  Scenario: Post add status using valid data with authorization
    Given Post add status with set request body caption "Bagaimana hari ini" and images "testImageValid.PNG"
    When Send request post add status
    Then Should return status code 201 created

  @Tamara #AddStatus_002
  Scenario: Post add status using valid data without authorization
    Given Post add status set request body caption "Bagaimana hari ini" and images "testImageValid.PNG" without auth
    When Send request post add status
    Then Should return status code 400 Bad request

  @Tamara #AddStatus_003
  Scenario: Post add status using numeric caption in body JSON
    Given Post add status with set request body caption 123456789 and images "testImageValid.PNG"
    When Send request post add status
    Then Should return status code 201 created

  @Tamara #AddStatus_004
  Scenario: Post add status using special char caption in body JSON
    Given Post add status with set request body caption "Test @!@$!" and images "testImageValid.PNG"
    When Send request post add status
    Then Should return status code 201 created

  @Tamara #AddStatus_005
  Scenario: Post add status with empty caption in body JSON
    Given Post add status with set request body caption " " and images "testImageValid.PNG"
    When Send request post add status
    Then Should return status code 400 Bad request

  @Tamara #AddStatus_006
  Scenario: Post add status with invalid images extention
    Given Post add status with set request body caption "Testing hari ini" and images "testImageInvalid.jpg"
    When Send request post add status
    Then Should return status code 400 Bad request

  @Tamara #AddStatus_007
  Scenario: Post add status with empty images
    Given Post add status with set request body caption "dag dig dug" and images " "
    When Send request post add status
    Then Should return status code 400 Bad request

