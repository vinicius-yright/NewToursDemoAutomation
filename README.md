# NewToursDemoAutomation
Small automation project on the website http://newtours.demoaut.com/. The program can create a new user using random data, login and book a flight. Written on Java, using Maven, Cucumber, Selenium and Junit.
Summary of available tags to be used on Runtest:

1: @get4dev - Opens the brazilian website https://www.4devs.com.br/gerador_de_pessoas that generates random valid data, such as names, phone numbers and emails. We use this data to register on the newtours website.

2: @register - Creates a new user on the http://newtours.demoaut.com/ website using the data previously gathered from the 4devs website. The username used is "Suiciniv" + randomNumber.

3: @login - Simply logs in using the previously created registeer.

4: @booking - Logs in on the http://newtours.demoaut.com/ website and then books a trip for 2 passengers, from Sydney to San Francisco, using the Economy Class on the Unified Airlines.
