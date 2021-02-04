Feature: Alert Button





  @sendKeys
  Scenario Outline: As a user, I want to enter credentials
    Given I am on the Facebook homepage
    When I enter text <firstname>
    When I enter credentials <lastname>
    Examples:
      | firstname | lastname |
      | John      | Muro     |
