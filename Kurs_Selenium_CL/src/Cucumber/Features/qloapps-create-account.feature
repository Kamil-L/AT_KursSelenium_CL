Feature: create an account

  Scenario: create an account with new email
    Given user is on AUTHENTICATION page
    When user inputs email address into CREATE AN ACCOUNT section
    And user clicks Create an account button
    When user inputs name, surname and password
    And user click Register
    Then confirmation message appears