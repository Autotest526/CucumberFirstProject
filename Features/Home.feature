Feature: Homepage
  
  Background: 
   Given user lauch Chrome browsers
   When user open URL "https://practicetestautomation.com/practice-test-login/";
   And user enter username  as "student"
   And user enter password as "Password123"
   And click on Submit
   #And page title should be "Logged In Successfully | Practice Test Automation"
   And click on homepage link
   Then page title should be "Practice Test Automation | Learn Selenium WebDriver"
   
  Scenario: Homepage validation with older posts
   And user enter first name "Arjun"
   And user enter the email "kavalan@yopmai.com"
   Then clik on xpath chat sheet 
   #Then Enter the robottextbox "Anil"
   #And clik on getxpath chat sheet1
   And clik on teturn to blog no older posts
   Then page title should be "Practice Test Automation | Learn Selenium WebDriver"
   And close the browser
   
  Scenario: Without filling the data
   Then clik on xpath chat sheet
   Then page title should be "Practice Test Automation | Learn Selenium WebDriver"
   And close the browser
    
  Scenario: Homepage validation with never posts
   And user enter first name "Dinesh"
   And user enter the email "santheee@yopmail.com"
   Then clik on xpath chat sheet 
   #Then Enter the robottextbox "Srinu"
   #And clik on getxpath chat sheet1
   And clik on teturn to blog no never posts
   Then page title should be "Practice Test Automation | Learn Selenium WebDriver"
   And close the browser
   