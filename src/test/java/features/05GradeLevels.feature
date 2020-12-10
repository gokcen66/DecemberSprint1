Feature: User should be able to use Grade Levels Page functionality

  Scenario: User should be able to create a Grade Level
    Given user navigate to basqar
    And user loggin to basqar

    When user navigate to Grade Levels page
    Then user create a grade level
      | name      | sati |
      | shortName | st   |
      | order     | 05   |
      | nextGrade | 1    |
    Then  the new input should be created

  Scenario: User should be able to update an existant Grade Level
    Given user click to Dashboard
    When user navigate to Grade Levels page
    Then user update the grade level named as "sati" to "sati007"
    And the input should be updated

  Scenario: User should be able to delete an existant Grade Level
    Given user click to Dashboard
    When user navigate to Grade Levels page
    Then user delete the grade level named as "sati007"
    And the input should be deleted
    And user logged out

