#Author: Vinicius Souza
#encoding: UTF-8

Feature: Save data from 4devs website
	
	@get4dev
	Scenario: Acess the 4devs website and get valid data to use on the cadastre
		Given that i'm on the 4devs website
		When i click on the Gerar Pessoa button
		Then i see multiple information and store it 
