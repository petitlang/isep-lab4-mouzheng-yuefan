Feature: Convert integers to Roman numerals
  As a user
  I want to convert integers to Roman numerals
  So that I can see their Roman representation

  Scenario Outline: Convert a given integer
    Given I have the integer <number>
    When I convert it to a Roman numeral
    Then the result should be "<roman>"

    Examples:
      | number | roman |
      | 1      | I     |
      | 2      | II    |
      | 3      | III   |
      | 4      | IV    |
      | 5      | V     |
      | 9      | IX    |
      | 10     | X     |
