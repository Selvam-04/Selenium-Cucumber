 @tag
Feature: user login
@tag1
  Scenario Outline: Title of your scenario outline
    Given I wants to enter "<username>"
    When I entered "<password>"
    Then Logged in

    Examples: 
      | username  | password         | 
      | name1     |     agc@45       | 
      | name2     |     mnm@34       |
@tag2
     Scenario:Create Account
     Given I want to create an account
     When I enter my credentials
     | username  | password         | 
      | name11     |     aagc@45       | 
      | name21     |     smnm@34       |
      Then I verify the account