Feature: Contacts

 Background:  
      Given user lauch Chrome browsers
      When user open URL "https://practicetestautomation.com/practice-test-login/";
      And user enter username  as "student"
      And user enter password as "Password123"
      And click on Submit
      Then page title should be "Logged In Successfully | Practice Test Automation"
      And click on the contact link
      Then page title should be "Contact | Practice Test Automation | Selenium WebDriver"
      
  Scenario: Succfully submit the contact details
      When user enter first name one "Ravi"
      And user enter last name "Kumar"
      And user enter email "kumareeravi@yopmail.com"
      And user enter message "We are looking for job"
      When click on i am robot check box
      Then click on Submit button
      Then Succesfully submited message should display "Thanks for contacting us! We will be in touch with you shortly message should display"
      And close the browser
      
  Scenario: Click on submit without entering any details mandetroy field errors should display
      When user not enter first name one
      And user not enter last name
      And user  not enter email
      And user not enter message
      When click on i am robot check box
      Then click on Submit button
      Then firstname should display mandetroy field error message "This field is required."
      Then lastname should display mandetroy field error message "This field is required."
      Then email should display mandetroy field error message "This field is required."
      Then comment should display mandetroy field error message "This field is required."
      And close the browser
         
  Scenario: Click on  submit without robot check in contact details
      When user enter first name one "Havi"
      And user enter last name "Kumar3"
      And user enter email "kumareeraviHH@yopmail.com"
      And user enter message "We are looking for job error"
      And click on Submit button 
      Then Error message should display for robot check box "Google reCAPTCHA verification failed, please try again later."
      And close the browser    