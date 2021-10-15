Feature: Login process

  Scenario Outline: We will login the given url successfully
    Given Go to "<url>" url
    When Click login button
    And Type "<eposta>" email and "<password>" password
    Then Click Oturum ac button
    And Close driver
    Examples:
      | url                             | eposta                       | password    |
      | https://www.euromsgexpress.com/ | test.testotomasyon@gmail.com | abcde12345. |

  Scenario Outline: Try to login without typing or incorrect username and password then get error message
    Given Go to "<url>" url
    When Click login button
    Then Click Oturum ac button
    And Get error message "<errorMessage>"
    And Close driver
    Examples:
      | url                             | errorMessage       |
      | https://www.euromsgexpress.com/ | Bu alan gereklidir |

  Scenario Outline: Try to login without typing or incorrect email then get error message
    Given Go to "<url>" url
    When Click login button
    And Type "" email and "<password>" password
    Then Click Oturum ac button
    And Get error message "<errorMessage>"
    And Close driver
    Examples:
      | url                             | password    | errorMessage       |
      | https://www.euromsgexpress.com/ | abcde12345. | Bu alan gereklidir |

  Scenario Outline: Try to login without typing password or incorrect then get error message
    Given Go to "<url>" url
    When Click login button
    And Type "<eposta>" email and "" password
    Then Click Oturum ac button
    And Get error message "<errorMessage>"
    And Close driver
    Examples:
      | url                             | eposta                       | errorMessage       |
      | https://www.euromsgexpress.com/ | test.testotomasyon@gmail.com | Bu alan gereklidir |