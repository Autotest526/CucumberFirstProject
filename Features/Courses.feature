Feature: Courses
  
  Background: 
    Given user lauch Chrome browsers
    When user open URL "https://practicetestautomation.com/practice-test-login/";
    And user enter username  as "student"
    And user enter password as "Password123"
    And click on Submit
    Then page title should be "Logged In Successfully | Practice Test Automation"
    And click on courses link
    Then page title should be "Courses | Practice Test Automation"
    
   Scenario: Selenium driver with monthly bundile
      When click on start a free trail now button
      Then open page in next tab and title should be "Practice Test Automation School"
      And close the browser
  
   Scenario: Selenium driver with java biggners 
      When click on enroll in this course on Udemy
      Then open page in next tab and title should be "Selenium WebDriver with Java for beginners | Udemy"
      And close the browser
  
   Scenario: Selenium driver with python for beginners	
      When click on enroll in this course  exclusive on Udemy
      Then open page in next tab and title should be "Selenium WebDriver: Selenium Automation Testing with Python | Udemy"
      And close the browser  