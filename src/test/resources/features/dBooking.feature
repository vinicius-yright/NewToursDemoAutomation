#Author: Vinicius Souza
#encoding: UTF-8

#teste
Feature: Book a flight on the Mercury Tours website

  @booking
  Scenario: Booking a flight for 2 people, from Sydney to San Francisco, using Economy Class on the Unified Airlines
    Given that i'm on Flight Finder page
    And i choose the trip preferences
    And i click on the Continue button
    And i choose the most expansive options
    And i click on the second Continue button
    And i fill all the input fields with valid information  
    When i click on the Secure Purchase button
    Then i see the message "Your itinerary has been booked!"


	
	

    
    
    
    
