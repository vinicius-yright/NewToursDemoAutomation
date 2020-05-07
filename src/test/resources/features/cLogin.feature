#Author: Vinicius Souza
#encoding: UTF-8

#teste
Feature: Login on the website

  @loginTest
  Scenario: Loggin in on the website using the previously created user
    Given that i'm on the home page
    And i click on the Sign-On button
    And i write the correct Username
    When i click on the Sign-In button
    Then i see the Flight Finder page


	
	

    