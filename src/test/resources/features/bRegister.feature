#Author: Vinicius Souza
#encoding: UTF-8

Feature: Register a new user on the Mercury Tours website

  @register
  Scenario: Ensure that the "Register a new user" feature on the Mercury Tour website works
  	Given that i click on the Register here button
    When i fill all the input fields with the data from 4devs
    And click on the Submit button
    Then i visualize the text "Thank you for registering. You may now sign-in using the user name and password you've just entered."


