Feature: Update Mentee Profile
  Background: Login Mentee
    Given Mentee login with all valid data
    When User send request post login user
#    Then Should return 200 OK
    And Set token to Mentor Token

  Scenario: Update profile Mentee with all valid data
    Given Mentee set update profile data with Name "Jangan Dihapus", Email "jago.tester@gmail.com", Password "Admin123$", images "testImageInvalid.jpg"
    When User send request put update data
    Then Should return 201 Created
  Scenario: Update name Mentee with Numeric
    Given Mentee set update profile data with Numeric name "123 12"
    When User send request put update data
    Then Should return 400 Bad Request

  Scenario: Update name Mentee with Special char
    Given Mentee set update profile data with Numeric name "!$% %%"
    When User send request put update data
    Then Should return 400 Bad Request

  Scenario: Update name Mentee with more than maximum char
    Given Mentee set update profile data with Numeric name "Jangan cobadibacantarmalahpusingsendirikanjadikasihandirilumendingdiskipajadehtakutnyamalahjadipusing"
    When User send request put update data
    Then Should return 400 Bad Request

  Scenario: Update email Mentee without '@'
    Given Mentee set update profile data with email "jonigmail.com"
    When User send request put update data
    Then Should return 400 Bad Request

  Scenario: Update email Mentee without '.'
    Given Mentee set update profile data with email "joni@gmailcom"
    When User send request put update data
#    Then Should return 400 Bad Request

  Scenario: Update email Mentee with full numeric email address
    Given Mentee set update profile data with email "214124"
    When User send request put update data
    Then Should return 400 Bad Request

  Scenario: Update email Mentee with space email address
    Given Mentee set update profile data with email "jo ni@gmail.com"
    When User send request put update data
    Then Should return 400 Bad Request

  Scenario:  Update email Mentee with capital email address
    Given Mentee set update profile data with email "TESTERQUALITY@gmail.com"
    When User send request put update data
    Then Should return 201 Created

  Scenario:  Update email Mentee with more than max char email name
    Given Mentee set update profile data with email "jangancobadibacantarmalahpusingsendirikanjadikasihandirilumendingdiskipajadehtakutnyamalahjadipusing@gmail.com"
    When User send request put update data
    Then Should return 400 Bad Request

  Scenario:  Update password Mentee space ( ) char
    Given Mentee set update profile data with password "Admin 123$"
    When User send request put update data
    Then Should return 201 Created

  Scenario:  Update password Mentee with numeric only
    Given Mentee set update profile data with password "24561233"
    When User send request put update data
    Then Should return 400 Bad Request

  Scenario:  Update password Mentee with string only
    Given Mentee set update profile data with password "Katanyasih"
    When User send request put update data
    Then Should return 400 Bad Request

  Scenario:  Update password Mentee with special character only
    Given Mentee set update profile data with password "!$%@$@$#"
    When User send request put update data
    Then Should return 400 Bad Request

  Scenario:  Update Password Mentee with more than maximal character
    Given Mentee set update profile data with password "jangancobadibacantarmalahpusingsendirikanjadikasihandirilumendingdiskipajadehtakutnyamalahjadipusing"
    When User send request put update data
    Then Should return 201 Created

  Scenario:  Update Password Mentee with less than minimum character
    Given Mentee set update profile data with password "T3$t"
    When User send request put update data
    Then Should return 400 Bad Request

  Scenario:  Update profile Images Mentee with invalid Images extension
    Given Mentee set update profile data with images "testFileValid.pdf"
    When User send request put update data
    Then Should return 400 Bad Request

  Scenario:  Update profile Mentee with empty data
    When User send request put update data
    Then Should return 400 Bad Request

#  Scenario: Update profile Mentee with Admin token
#    Given Mentee set update profile data with Admin token
#    When User send request put update data
#    Then Should return 201 Created