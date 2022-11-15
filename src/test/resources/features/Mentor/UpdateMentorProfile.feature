Feature: Update Mentor Profile
  Background: Login Mentor
    Given Mentor login with all valid data
    When User send request post login user
    And Set token to base Mentor Token
  @positive
  Scenario: Update profile Mentor with all valid data
    Given Mentor set update profile data with Name "Base Mentor", Email "setmentor@gmail.com", Password "Admin123$", images "testImageValid.PNG"
    When User send request put update data
    Then Should return 201 Created
    And Reset mentor profile
  @negative
  Scenario: Update name Mentor with Numeric
    Given Mentor set update profile data with Numeric name "123 12"
    When User send request put update data
    Then Should return 400 Bad Request
    And Reset mentor profile
  @negative
  Scenario: Update name Mentor with Special char
    Given Mentor set update profile data with Numeric name "!$% %%"
    When User send request put update data
    Then Should return 400 Bad Request
    And Reset mentor profile
  @negative
  Scenario: Update name Mentor with more than maximum char
    Given Mentor set update profile data with Numeric name "Jangan cobadibacantarmalahpusingsendirikanjadikasihandirilumendingdiskipajadehtakutnyamalahjadipusing"
    When User send request put update data
    Then Should return 400 Bad Request
    And Reset mentor profile
  @negative
  Scenario: Update email Mentor without '@'
    Given Mentor set update profile data with email "jonigmail.com"
    When User send request put update data
    Then Should return 400 Bad Request
    And Reset mentor profile
  @negative
  Scenario: Update email Mentor with full numeric email address
    Given Mentor set update profile data with email "214124"
    When User send request put update data
    Then Should return 400 Bad Request
    And Reset mentor profile
  @negative
  Scenario: Update email Mentor with space email address
    Given Mentor set update profile data with email "jo ni@gmail.com"
    When User send request put update data
    Then Should return 400 Bad Request
    And Reset mentor profile
  @positive
  Scenario:  Update email Mentor with capital email address
    Given Mentor set update profile data with email "SETMENTOR@gmail.com"
    When User send request put update data
    Then Should return 201 Created
    And Reset mentor profile
  @negative
  Scenario:  Update email Mentor with more than max char email name
    Given Mentor set update profile data with email "jangancobadibacantarmalahpusingsendirikanjadikasihandirilumendingdiskipajadehtakutnyamalahjadipusing@gmail.com"
    When User send request put update data
    Then Should return 400 Bad Request
    And Reset mentor profile
  @negative
  Scenario:  Update password Mentor with numeric only
    Given Mentor set update profile data with password "24561233"
    When User send request put update data
    Then Should return 400 Bad Request
    And Reset mentor profile
  @negative
  Scenario:  Update password Mentor with string only
    Given Mentor set update profile data with password "Katanyasih"
    When User send request put update data
    Then Should return 400 Bad Request
    And Reset mentor profile
  @negative
  Scenario:  Update password Mentor with special character only
    Given Mentor set update profile data with password "!$%@$@$#"
    When User send request put update data
    Then Should return 400 Bad Request
    And Reset mentor profile
  @negative
  Scenario:  Update Password Mentor with more than maximal character
    Given Mentor set update profile data with password "jangancobadibacantarmalahpusingsendirikanjadikasihandirilumendingdiskipajadehtakutnyamalahjadipusing"
    When User send request put update data
    Then Should return 400 Bad Request
    And Reset mentor profile
  @negative
  Scenario:  Update Password Mentor with less than minimum character
    Given Mentor set update profile data with password "T3$t"
    When User send request put update data
    Then Should return 400 Bad Request
    And Reset mentor profile
  @negative
  Scenario:  Update profile Images Mentor with invalid Images extension
    Given Mentor set update profile data with images "testFileValid.pdf"
    When User send request put update data
    Then Should return 400 Bad Request
    And Reset mentor profile
  @negative
  Scenario:  Update profile Mentor with empty data
    When User send request put update data
    Then Should return 400 Bad Request
    And Reset mentor profile
  @negative
  Scenario: Update email Mentor without '.'
    Given Mentor set update profile data with email "joni@gmailcom"
    When User send request put update data
    Then Should return 400 Bad Request
    And Reset mentor profile
  @positive
  Scenario:  Update password Mentor space ( ) char
    Given Mentor set update profile data with password "Admin 123$"
    When User send request put update data
    Then Should return 201 Created
    And Reset mentor profile

