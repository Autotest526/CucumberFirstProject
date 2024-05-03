Feature: Pratice
   
   Background: 
     Given user lauch Chrome browsers
     When user open URL "https://practicetestautomation.com/practice-test-login/";
     And user enter username  as "student"
     And user enter password as "Password123"
     And click on Submit
     Then page title should be "Logged In Successfully | Practice Test Automation"
     And click on pratice link
     Then page title should be "Practice | Practice Test Automation"
     
 Scenario: Pratice page validation with test login page  
     Then click on Test login page
     Then page title should be "Test Login | Practice Test Automation"
     And close the browser
  
 Scenario:  Pratice page validation with Test exception
     Then click on Test exceptions link
     Then page title should be "Test Exceptions | Practice Test Automation"
     And click on edit button and user enter the update text
     Then click on Add button and update the text 
     Then click on save button
     And click on remove button
     Then row two should be deleted
     And close the browser
  
  
 
  
  
  