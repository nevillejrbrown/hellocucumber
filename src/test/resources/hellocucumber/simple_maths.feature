Feature: Do simple maths
do simple addition and subtraction

  Scenario: Add two numbers together
    When I add 2 and 2
    Then I get the answer 4

  Scenario: Add two other numbers together
    When I add 3 and 4
    Then I get the answer 7

    Scenario: Mulitply two numbers
      When I multiply 6 and 7
      Then I get the answer 42
