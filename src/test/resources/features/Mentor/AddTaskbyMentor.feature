Feature: Add Task by Mentor
  Background: Login Mentor
    Given Mentor login with all valid data
    When User send request post login user
    And Set token to base Mentor Token
  @positive
  Scenario Outline: Create Task with all valid data
    Given Mentor set create task data with Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
    When User send request post create task
    Then Should return 201 Created
    Examples:
      | Title          | Description   | Images            | File              | Time        |
      | percobaan aut  | matematika    | testImageValid.PNG| testFileValid.pdf | 2024-11-05  |
  @positive
  Scenario Outline: Create Task with numeric title
    Given Mentor set create task data with Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
    When User send request post create task
    Then Should return 201 Created
    Examples:
      | Title  | Description   | Images            | File              | Time        |
      | 12314  | matematika    | testImageValid.PNG| testFileValid.pdf | 2022-11-05  |
  @positive
  Scenario Outline: Create Task with Special Character title
    Given Mentor set create task data with Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
    When User send request post create task
    Then Should return 201 Created
    Examples:
      | Title  | Description   | Images            | File              | Time        |
      | !@#$@  | matematika    | testImageValid.PNG| testFileValid.pdf | 2022-11-05  |
  @positive @negative
  Scenario Outline: Create Task with more than 255 character title
    Given Mentor set create task data with Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
    When User send request post create task
    Then Should return 400 Bad Request
    Examples:
      | Description  | Images             | File              | Time       |Title           |
      | matematika   | testImageValid.PNG | testFileValid.pdf | 2022-11-05 |jangancobadibacantarmalahpusingsendirikanjadikasihandirilumendingdiskipajadehtakutnyamalahjadipusingdirilusendirikanmalahjadimasalahhooomalahngeyeltetepajadibacadasarsusahdibilanginkanpusingjadinyalugimanarasanyaudahpusingbelumklobelumyabaguslahtapigakadagunanyajugasihinilubacawkwkwk |
      | matematika   | testImageValid.PNG | testFileValid.pdf | 2022-11-05 |jangancobadibacantarmalahpusingsendirikanjadikasihandirilumendingdiskipajadehtakutnyamalahjadipusingdirilusendirikanmalahjadimasalahhooomalahngeyeltetepajadibacadasarsusahdibilanginkanpusingjadinyalugimanarasanyaudahpusingbelumklobelumyabaguslahtapigakadagunanyajugasihinilubacawkwkwkjangancobadibacantarmalahpusingsendirikanjadikasihandirilumendingdiskipajadehtakutnyamalahjadipusingdirilusendirikanmalahjadimasalahhooomalahngeyeltetepajadibacadasarsusahdibilanginkanpusingjadinyalugimanarasanyaudahpusingbelumklobelumyabaguslahtapigakadagunanyajugasihinilubacawkwkwkjangancobadibacantarmalahpusingsendirikanjadikasihandirilumendingdiskipajadehtakutnyamalahjadipusingdirilusendirikanmalahjadimasalahhooomalahngeyeltetepajadibacadasarsusahdibilanginkanpusingjadinyalugimanarasanyaudahpusingbelumklobelumyabaguslahtapigakadagunanyajugasihinilubacawkwkwk |
  @positive
  Scenario Outline: Create Task with numeric description
    Given Mentor set create task data with Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
    When User send request post create task
    Then Should return 201 Created
    Examples:
      | Title          | Description  | Images      | File       | Time       |
      | bilangan prima | 1241422142   | testImageValid.PNG    | testFileValid.pdf  | 2022-11-05 |
  @positive
  Scenario Outline: Create Task with Special Character description
    Given Mentor set create task data with Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
    When User send request post create task
    Then Should return 201 Created
    Examples:
      | Title          | Description  | Images      | File       | Time       |
      | bilangan prima | !#@#@$#$#@   | testImageValid.PNG    | testFileValid.pdf  | 2022-11-05 |
  @positive @negative
  Scenario Outline: Create Task with more than 255 character description
    Given Mentor set create task data with Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
    When User send request post create task
    Then Should return 400 Bad Request
    Examples:
      | Title          |  Images      | File       | Time       | Description  |
      | bilangan prima |  testImageValid.PNG    | testFileValid.pdf  | 2022-11-05 | jangancobadibacantarmalahpusingsendirikanjadikasihandirilumendingdiskipajadehtakutnyamalahjadipusingdirilusendirikanmalahjadimasalahhooomalahngeyeltetepajadibacadasarsusahdibilanginkanpusingjadinyalugimanarasanyaudahpusingbelumklobelumyabaguslahtapigakadagunanyajugasihinilubacawkwkwk |
      | bilangan prima |  testImageValid.PNG    | testFileValid.pdf  | 2022-11-05 | jangancobadibacantarmalahpusingsendirikanjadikasihandirilumendingdiskipajadehtakutnyamalahjadipusingdirilusendirikanmalahjadimasalahhooomalahngeyeltetepajadibacadasarsusahdibilanginkanpusingjadinyalugimanarasanyaudahpusingbelumklobelumyabaguslahtapigakadagunanyajugasihinilubacawkwkwkjangancobadibacantarmalahpusingsendirikanjadikasihandirilumendingdiskipajadehtakutnyamalahjadipusingdirilusendirikanmalahjadimasalahhooomalahngeyeltetepajadibacadasarsusahdibilanginkanpusingjadinyalugimanarasanyaudahpusingbelumklobelumyabaguslahtapigakadagunanyajugasihinilubacawkwkwkjangancobadibacantarmalahpusingsendirikanjadikasihandirilumendingdiskipajadehtakutnyamalahjadipusingdirilusendirikanmalahjadimasalahhooomalahngeyeltetepajadibacadasarsusahdibilanginkanpusingjadinyalugimanarasanyaudahpusingbelumklobelumyabaguslahtapigakadagunanyajugasihinilubacawkwkwk |
  @negative
  Scenario Outline: Create Task with invalid Images extension
    Given Mentor set create task data with Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
    When User send request post create task
    Then Should return 400 Bad Request
    Examples:
      | Title          | Description  | Images      | File       | Time       |
      | bilangan prima | matematika   | testFileValid.pdf    | testFileValid.pdf  | 2022-11-05 |
  @negative
  Scenario Outline: Create Task with invalid file extension
    Given Mentor set create task data with Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
    When User send request post create task
    Then Should return 400 Bad Request
    Examples:
      | Title          | Description  | Images                | File                | Time       |
      | bilangan prima | matematika   | testImageValid.PNG    | testImageValid.PNG  | 2022-11-05 |
  @negative
  Scenario Outline: Create Task with big file size
    Given Mentor set create task data with Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
    When User send request post create task
    Then Should return 400 Bad Request
    Examples:
      | Title          | Description  | Images                | File                | Time       |
      | bilangan prima | matematika   | testImageInvalid.jpg  | testFileValid.pdf   | 2022-11-05 |
      | bilangan prima | matematika   | testImageValid.PNG    | testFileInvalid.pdf | 2022-11-05 |
  @negative
  Scenario Outline: Create Task with invalid time format
    Given Mentor set create task data with Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
    When User send request post create task
    Then Should return 400 Bad Request
    Examples:
      | Title          | Description  | Images                | File                | Time              |
      | bilangan prima | matematika   | testImageValid.PNG    | testFileValid.pdf   | 05-11-2023        |
      | bilangan prima | matematika   | testImageValid.PNG    | testFileValid.pdf   | 05/11/2023        |
      | bilangan prima | matematika   | testImageValid.PNG    | testFileValid.pdf   | 05-November-2023  |
  @negative
  Scenario Outline: Create Task with incomplete data
    Given Mentor set create task data with Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
    When User send request post create task
    Then Should return 400 Bad Request
    Examples:
      | Title          | Description   | Images               | File               | Time       |
      |                | matematika    | testImageValid.PNG   | testFileValid.pdf  | 2022-11-05 |
      | bilangan prima |               | testImageValid.PNG   | testFileValid.pdf  | 2022-11-05 |
      |                |               | testImageValid.PNG   | testFileValid.pdf  | 2022-11-05 |
      | bilangan prima | matematika    |                      | testFileValid.pdf  | 2022-11-05 |
      | bilangan prima | matematika    | testImageValid.PNG   |                    | 2022-11-05 |
      | bilangan prima | matematika    | testImageValid.PNG   | testFileValid.pdf  |            |


  @negative
  Scenario Outline: Create Task with empty data
    Given Mentor set create task data with Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
    When User send request post create task
    Then Should return 400 Bad Request
    Examples:
      | Title | Description | Images  | File  | Time  |
      |       |             |         |       |       |
  @negative
  Scenario Outline: Create Task without Token
    Given Mentor set create task data with Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>" without token
    When User send request post create task
    Then Should return 400 Bad Request
    Examples:
      | Title          | Description  | Images      | File       | Time       |
      | bilangan prima | matematika   | testImageValid.PNG    | testFileValid.pdf  | 2022-11-05 |
#  Scenario Outline: Create Task with Mentee Token
#    Given Mentor set create task data with Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
#    When User send request post create task
#    Then Should return 201 Created
#    Examples:
#      | Title          | Description  | Images      | File       | Time       |
#      | bilangan prima | matematika   | testImageValid.PNG    | testFileValid.pdf  | 2022-11-05 |
#  Scenario Outline: Create Task with Admin Token
#    Given Mentor set create task data with Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
#    When User send request post create task
#    Then Should return 201 Created
#    Examples:
#      | Title          | Description  | Images      | File       | Time       |
#      | bilangan prima | matematika   | testImageValid.PNG    | testFileValid.pdf  | 2022-11-05 |
