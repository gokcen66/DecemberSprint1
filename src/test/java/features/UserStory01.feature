Feature: Citizenships functionality

  Scenario: User story 01, Test Case 01, User should be able to create new Citizenships
    Given user navigate to basqar
    And   user loggin to basqar

    When User navigate to Citizenships page
    Then User create a Citizenship name as "Turkey1" short name as "Tr"
    Then Citizenships successfully should be created


  Scenario: User story 01, Test Case 02, User should be able to update new Citizenships
    Given Navigate to dashboard
    And Navigate to Citizenships page
    Then User update  Citizenship name as "Turkey1" to "TurkeyCountry" short name as "TC"
    Then Citizenships successfully should be updated

  Scenario: User story 01, Test Case 03, User should be able to delete new Citizenships
    Given User Navigate to dashboard
    And User Navigate to Citizenships page
    Then User delete the "TurkeyCountry"
    Then Citizenships successfully should be deleted


