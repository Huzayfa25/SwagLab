Feature: Swag Labs Login

@Swag
Scenario: 1 Successful Login 
 Given Launch "<URL>"

 When I fill the account information for account StandardUser into the Username  field and the Password field 
 And I click the Login Button
 Then I am redirected to the Sauce Demo Main Page 
 And I verify the App Logo exists 
  
@Swag25
Scenario: 2 Failed Login 
Given Launch "<URL>"
 
 When I fill the account information for account LockedOutUser into the  Username field and the Password field 
 And I click the Login Button
 Then I verify the Error Message contains the text "Sorry, this user has been banned."

