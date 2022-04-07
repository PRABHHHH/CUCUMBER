#this is what done by BA and Provided to the developers and Tester
Feature: Test The Skillrary App
1)Valid case
2)Invalid Case

#i use backgroud when Given is common in each Scenario
Background:
Given  I should open the browser and navigate to Login page

@PositiveCase
Scenario: To test the Login with User Creddential
When Enter Username "<user>"
And Enter Password "<pass>"
And Click on Loginbutton
Then i should see the username as "<name>"

Examples:
|user|pass|name|
|user|user|Harry Den|
|user|user|Harry Den|
|admin|admin|SkillRary Admin|


#Scenario: To test the Login with Admin Creddential
#When Enter Username "admin"
#And Enter Password "admin"
#And Click on Loginbutton
#Then i should see the username as "SkillRary Admin"

#@NegativeCase
#Scenario: To test the Login with Invalid Creddential
#When Enter Username "prabh"
#And Enter Password "prabh"
#And Click on Loginbutton
#Then i should see the Page "Register"

