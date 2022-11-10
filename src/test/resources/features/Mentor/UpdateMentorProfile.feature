Feature: Update Mentor Profile
  Background: Login Mentor
    Given User login with email "tester@gmail.com" password "Admin123$"
    When Send request post login user
    And Set token to Mentor Token

  Scenario: Update profile Mentor with all valid data
    Given Mentor set update profile data with Name "Akunnya dihapus", Email "testerqulity@gmail.com", Password "Admin123$", images "testImageInvalid.jpg"
    When User send request put update data
    Then Should return 201 Created

  Scenario: Update profile Mentor with Admin token
    Given Mentor set update profile data with Admin token
    When User send request put update data
    Then Should return 201 Created
  Scenario: Update name Mentor with Numeric
    Given Mentor set update profile data with Numeric name "123 12"
    When User send request put update data
    Then Should return 400 Bad Request

  Scenario: Update name Mentor with Special char
    Given Mentor set update profile data with Numeric name "!$% %%"
    When User send request put update data
    Then Should return 400 Bad Request
  Scenario: Update name Mentor with more than maximum char
    Given Mentor set update profile data with Numeric name "Jangan cobadibacantarmalahpusingsendirikanjadikasihandirilumendingdiskipajadehtakutnyamalahjadipusing"
    When User send request put update data
    Then Should return 400 Bad Request
  Scenario: Update email Mentor without '@'
    Given Mentor set update profile data with email "12 345"
    When User send request put update data
    Then Should return 400 Bad Request
  Scenario: Update email Mentor without '.'
    Given Mentor set update profile data with email "joni@gmail.com"
    When User send request put update data
    Then Should return 400 Bad Request
  Scenario: Update email Mentor with full numeric email address
    Given Mentor set update profile data with email "joni@gmail.com"
    When User send request put update data
    Then Should return 400 Bad Request
  Scenario: Update email Mentor with space email address
    Given Mentor set update profile data with email "jo ni@gmail.com"
    When User send request put update data
    Then Should return 400 Bad Request
  Scenario:  Update email Mentor with capital email address
    Given Mentor set update profile data with email "JONI@gmail.com"
    When User send request put update data
    Then Should return 400 Bad Request
  Scenario:  Update email Mentor with more than max char email name
    Given Mentor set update profile data with email "jangancobadibacantarmalahpusingsendirikanjadikasihandirilumendingdiskipajadehtakutnyamalahjadipusing@gmail.com"
    When User send request put update data
    Then Should return 400 Bad Request
  Scenario:  Update password Mentor space ( ) char
    Given Mentor set update profile data with password "Admin 123$"
    When User send request put update data
    Then Should return 201 Created
  Scenario:  Update password Mentor with numeric only
    Given Mentor set update profile data with password "Admin 123$"
    When User send request put update data
    Then Should return 201 Created
  Scenario:  Update password Mentor with string only
    Given Mentor set update profile data with password "Admin 123$"
    When User send request put update data
    Then Should return 201 Created
  Scenario:  Update password Mentor with special charakter only
    Given Mentor set update profile data with password "Admin 123$"
    When User send request put update data
    Then Should return 400 Bad Request
  Scenario:  Update Password Mentor with more than maximal character
    Given Mentor set update profile data with password "Admin 123$"
    When User send request put update data
    Then Should return 201 Created
  Scenario:  Update Password Mentor with less than minimum character
    Given Mentor set update profile data with password "Admin 123$"
    When User send request put update data
    Then Should return 400 Bad Request
  Scenario:  Update profile Images Mentor with invalid Images extension
    Given Mentor set update profile data with password "Admin 123$"
    When User send request put update data
    Then Should return 400 Bad Request
  Scenario:  Update profile Mentor with empty data
    When User send request put update data
    Then Should return 400 Bad Request
