Feature: Update Task
  Background: Login Mentor
    Given Mentor login with all valid data
    When User send request post login user
    And Set token to base Mentor Token
  @positive
  Scenario Outline: Update task with valid task id and valid data
    Given Mentor set update task data with Id <id>, Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
    When User send request put update task
    Then Should return 201 Created
    Examples:
    | id  | Title               | Description   | Images            | File              | Time        |
    | 9   | percobaan diintelej | matematika    | testImageValid.PNG| testFileValid.pdf | 2022-11-05  |

  @negative
  Scenario Outline: Update task with invalid task id and valid data
    Given Mentor set update task data with Id "<id>", Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
    When User send request put update task
    Then Should return 400 Bad Request
    Examples:
      | id    | Title          | Description   | Images            | File              | Time        |
      | test  | percobaan aja  | matematika    | testImageValid.PNG| testFileValid.pdf | 2022-11-05  |
  @negative
#    BUG RC
  Scenario Outline: Update task with unregistered task id and valid data
    Given Mentor set update task data with Id <id>, Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
    When User send request put update task
    Then Should return 400 Bad Request
    Examples:
      | id     | Title          | Description   | Images            | File              | Time        |
      | 999999 | percobaan aja  | matematika    | testImageValid.PNG| testFileValid.pdf | 2022-11-05  |
  @negative
#    BUG & fixing about id
  Scenario Outline: Update task without task id and valid data
    Given Mentor set update task data with Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
    When User send request put update task
    Then Should return 400 Bad Request
    Examples:
      | Title          | Description   | Images            | File              | Time        |
      | percobaan aja  | matematika    | testImageValid.PNG| testFileValid.pdf | 2022-11-05  |
  @positive
  Scenario Outline: Update Task with valId Id and  numeric title
    Given Mentor set update task data with Id <id>, Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
    When User send request put update task
    Then Should return 201 Created
    Examples:
      | id  | Title   | Description   | Images            | File              | Time        |
      | 9  | 214123  | matematika    | testImageValid.PNG| testFileValid.pdf | 2022-11-05  |
  @positive
  Scenario Outline: Update Task with valId Id and  Special Character title
    Given Mentor set update task data with Id <id>, Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
    When User send request put update task
    Then Should return 201 Created
    Examples:
      | id  | Title  | Description   | Images            | File              | Time        |
      | 9  | !@@##  | matematika    | testImageValid.PNG| testFileValid.pdf | 2022-11-05  |
  @negative
  Scenario Outline: Update Task with valId Id and  more than max character title
    Given Mentor set update task data with Id <id>, Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
    When User send request put update task
    Then Should return 400 Bad Request
    Examples:
      | id  | Description   | Images            | File              | Time        | Title          |
      | 9  | matematika    | testImageValid.PNG| testFileValid.pdf | 2022-11-05  | Fibonacci adalah putra seorang pengusaha Italia dari Italia. Ia dibesarkan di sebuah koloni perdagangan di Afrika Utara selama Abad Pertengahan. Di masa itu, orang Italia terkenal sebagai pedagang paling mahir di dunia barat selama Abad Pertengahan, dan mereka pun telah menggunakan aritmatika untuk melacak transaksi perdagangan yang dilakukannya |
  @positive
  Scenario Outline: Update Task with valId Id and  numeric description
    Given Mentor set update task data with Id <id>, Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
    When User send request put update task
    Then Should return 201 Created
    Examples:
      | id  | Title          | Description   | Images            | File              | Time        |
      | 9  | percobaan aja  | 1231241232    | testImageValid.PNG| testFileValid.pdf | 2022-11-05  |
  @positive
  Scenario Outline: Update Task with valId Id and  Special Character description
    Given Mentor set update task data with Id <id>, Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
    When User send request put update task
    Then Should return 201 Created
    Examples:
      | id  | Title          | Description   | Images            | File              | Time        |
      | 9  | percobaan aja  | !@@#@#@#@$    | testImageValid.PNG| testFileValid.pdf | 2022-11-05  |
  @negative
  Scenario Outline: Update Task with valId Id and  more than max character description
    Given Mentor set update task data with Id <id>, Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
    When User send request put update task
    Then Should return 400 Bad Request
    Examples:
      | id | Title          | Images            | File              | Time        | Description   |
      | 9 | percobaan aja  | testImageValid.PNG| testFileValid.pdf | 2022-11-05  |  Fibonacci adalah putra seorang pengusaha Italia dari Italia. Ia dibesarkan di sebuah koloni perdagangan di Afrika Utara selama Abad Pertengahan. Di masa itu, orang Italia terkenal sebagai pedagang paling mahir di dunia barat selama Abad Pertengahan, dan mereka pun telah menggunakan aritmatika untuk melacak transaksi perdagangan yang dilakukannya |
  @negative
#    BUG
  Scenario Outline: Update Task with valId Id and  invalid Images extension
    Given Mentor set update task data with Id <id>, Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
    When User send request put update task
    Then Should return 400 Bad Request
    Examples:
      | id | Title          | Description   | Images            | File              | Time        |
      | 9  | percobaan aja  | matematika    | testFileValid.pdf | testFileValid.pdf | 2022-11-05  |
  @negative
  Scenario Outline: Update Task with valId Id and  invalid file extension
    Given Mentor set update task data with Id <id>, Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
    When User send request put update task
    Then Should return 400 Bad Request
    Examples:
      | id | Title          | Description   | Images            | File              | Time        |
      | 9 | percobaan aja  | matematika    | testImageValid.PNG| testImageValid.PNG | 2022-11-05  |
  @negative
  Scenario Outline: Update Task with valId Id and  big file size
    Given Mentor set update task data with Id <id>, Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
    When User send request put update task
    Then Should return 400 Bad Request
    Examples:
      | id | Title          | Description   | Images              | File              | Time        |
      | 9 | percobaan aja  | matematika    | testImageInvalid.jpg| testFileValid.pdf | 2022-11-05  |
      | 9 | percobaan aja  | matematika    | testImageValid.PNG  | testFileInvalid.pdf | 2022-11-05  |
  @negative
#    BUG
  Scenario Outline: Update Task with valId Id and  invalid and  time format
    Given Mentor set update task data with Id <id>, Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
    When User send request put update task
    Then Should return 400 Bad Request
    Examples:
      |id | Title          | Description   | Images            | File              | Time        |
      | 9 | percobaan aja  | matematika    | testImageValid.PNG| testFileValid.pdf | 05-11-2023  |
      | 9 | percobaan aja  | matematika    | testImageValid.PNG| testFileValid.pdf | 2023/11/05  |
      | 9 | percobaan aja  | matematika    | testImageValid.PNG| testFileValid.pdf | 05-November-2023  |
  @negative
#    BUG
  Scenario Outline: Update task without Token
    Given Mentor set update task data with Id <id>, Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>" without token
    When User send request put update task
    Then Should return 400 Bad Request
    Examples:
      | id  | Title          | Description   | Images            | File              | Time        |
      | 9  | percobaan aja  | matematika    | testImageValid.PNG| testFileValid.pdf | 2022-11-05  |

#  Scenario Outline: Update task with Mentee Token
#    Given Mentor set update task data with Id <id>, Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
#    When User send request put update task
#    Then Should return 201 Created
#    Examples:
#      | id     | Title          | Description   | Images            | File              | Time        |
#      | 999999 | percobaan aja  | matematika    | testImageValid.PNG| testFileValid.pdf | 2022-11-05  |
#  Scenario Outline: Update task with Admin Token
#    Given Mentor set update task data with Id <id>, Title "<Title>", Description "<Description>",Images "<Images>",File "<File>", Time "<Time>"
#    When User send request put update task
#    Then Should return 201 Created
#    Examples:
#      | id     | Title          | Description   | Images            | File              | Time        |
#      | 999999 | percobaan aja  | matematika    | testImageValid.PNG| testFileValid.pdf | 2022-11-05  |
