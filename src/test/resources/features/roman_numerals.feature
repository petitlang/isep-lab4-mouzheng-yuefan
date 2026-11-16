Feature: See a number written in Roman numerals
  Roman numerals appear in headings and labels. When I ask for a number
  from 1 to 1000, I should see its familiar Roman form.

  Scenario Outline: Familiar numbers use recognizable symbols
    Given I have the number <number>
    When I ask for its Roman numeral
    Then I should see "<roman>"

    Examples:
      | number | roman        |
      | 1      | I            |
      | 2      | II           |
      | 3      | III          |
      | 5      | V            |
      | 10     | X            |
      | 50     | L            |
      | 100    | C            |
      | 500    | D            |
      | 1000   | M            |

  Scenario Outline: Four, nine, and related numbers use shorter forms
    Given I have the number <number>
    When I ask for its Roman numeral
    Then I should see "<roman>"

    Examples:
      | number | roman        |
      | 4      | IV           |
      | 9      | IX           |
      | 40     | XL           |
      | 90     | XC           |
      | 400    | CD           |
      | 900    | CM           |

  Scenario Outline: Mixed numbers still have one readable numeral
    Given I have the number <number>
    When I ask for its Roman numeral
    Then I should see "<roman>"

    Examples:
      | number | roman        |
      | 6      | VI           |
      | 14     | XIV          |
      | 49     | XLIX         |
      | 99     | XCIX         |
      | 944    | CMXLIV       |
      | 999    | CMXCIX       |
