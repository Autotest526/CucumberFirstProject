Feature: Login

   #All the times backgorund sccenario will execute before execute the  scenario outline and that browser is not 
   #getting closed dis advantage should not execute
      
   Scenario: Succesfully login with valid credentails
      Given user lauch Chrome browsers "<browser>"
      When user open URL "https://practicetestautomation.com/practice-test-login/";
      And user enter username  as "student"
      And user enter password as "Password123"
      And click on Submit
      Then page title should be "Logged In Successfully | Practice Test Automation"
      When user click on logout link 
      Then page title should be "Test Login | Practice Test Automation"
      And close the browser
      
      Examples: 
      | browser |
      | chrome |
       #| edge |
      # | firefox |
      # | Headless |
      
   #Scenario Outline: Login Data Driven
     # Given user lauch Chrome browsers "<browser>"
     # When user open URL "https://practicetestautomation.com/practice-test-login/";
     # And user enter username  as "<email>"
     # And user enter password as "<password>"
     # And click on Submit
     # Then page title should be "Test Login | Practice Test Automation"
     # And close the browser
      
      #Examples:
        #| email | password 
        #| Avinash | Password123 |
        #| student | Avinash@123 |
        
       
        