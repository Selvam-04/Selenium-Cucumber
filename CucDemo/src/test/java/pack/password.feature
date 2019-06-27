@tag
Feature: Title of your feature
   
 @uat
  Scenario: change password
   Given  Users enters "sel"
    When   User enters password "123"
     And    Click on password1
    Then   Homepage is displayed1

    @smoke
    Scenario:logout
    When user clicks on logout button
    Then user is successfully loggedout 
      
      @reg
      Scenario:signin
      Given click on the register button
       