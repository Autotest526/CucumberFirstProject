Feature: Blogs
  
  Background:
      Given user lauch Chrome browsers
      When user open URL "https://practicetestautomation.com/practice-test-login/";
      And user enter username  as "student"
      And user enter password as "Password123"
      And click on Submit
      Then page title should be "Logged In Successfully | Practice Test Automation"  
      And user click on blogs
      Then page title should be "Blog | Practice Test Automation"
      
   Scenario: Blogs layers of the pyramid
      And click on read more button for layer of the pyramid
      Then page title should be "Unlock the Potential: Mastering the Test Automation Pyramid | Practice Test Automation"
      And user click on blogs
      Then page title should be "Blog | Practice Test Automation"
      And close the browser
      
   Scenario: Blogs understanding the selenium 
      And click on read more button for understanding selenium
      Then page title should be "Starting with Selenium WebDriver and Java: An Overview for Beginners | Practice Test Automation"
      And user click on open source automation tools 
      Then open page in next tab and title should be "Selenium"
      And close the browser
      
   Scenario: Blogs Hard and soft Assertions 
      And click on read more button for hard and soft assertions
      Then page title should be "Hard and Soft Assertions in test automation | Practice Test Automation"
      And user click on pratice test link page
      Then open page in next tab and title should be "Test Login | Practice Test Automation"
      And close the browser
      
            
      
      
      