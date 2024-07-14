Feature: login features

Scenario: Verify Employee CTC is displayed on my Salary tab
	Given User is on Application login page
	When User enters the username and password on login page
	And User clicks on login button on login page
	Then User verify Dashboard page is displayed
	And user click on My info tab on Dashboard Page