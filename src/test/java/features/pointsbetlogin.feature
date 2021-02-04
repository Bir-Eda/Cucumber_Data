Feature: Log in  Pointsbet
  @Pointsbet
  Scenario: As a user, I want to sign in by using credentials
    Given I am on the PointsBet homepage
    When I click on login button
    Then I verify the account login pop up
    When I enter credentials
      | email          | password |
      | birr01@gmail.com | 123098   |
    When I click on submit button
    And I should see a warning


