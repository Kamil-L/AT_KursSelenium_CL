Feature: User address creation

  Scenario Outline: Registered user can create new address
    Given an logged in user on the page https://prod-kurs.coderslab.pl/index.php
    When user info button is clicked
    And the field with ADDRESSES is clicked on the customer account view
    And the address link action Create new address is chosen
    And the Alias <alias> is entered in input field
    And the Address <address> is entered in input field
    And the City <city> is entered in input field
    And the Postal code <postalCode> is entered in input field
    And the Country is chosen in dropdown list
    And the Phone <phone> is entered in input field
    And the button SAVE is clicked
    Then the new user address is added
    And close browser

    Examples:
    |alias |address       |city   |postalCode  |phone         |
    |JDoes |New Bridge 12 |London |E1 6AN      |020 8564 2423 |
