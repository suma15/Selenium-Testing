
@tag
Feature: Orangehrm Application logintest


  @tag2
  Scenario Outline:Validating login functionality
    Given Open chrome browser and navigate to ohrm Application
    When user enters "username" and "password" and click on login button 
    Then user shoulb be able to successfully login and close the application

    Examples: 
      | username | password | 
      | Admin | admin123 | 
      | testing | selenium | 
