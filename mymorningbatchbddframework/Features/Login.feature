Feature: To verify login functionality

  Scenario Outline: To verify valid and invalid credentials
    Given user enters URL and navigates to login screen
    And user enters Email as "<username>" and password as "<password>"
    And click on Login button.

    Examples: 
      | username   | password |
      | mngr493805 | ejyrybA  |
      | mngr493804 | ejyrybA  |
