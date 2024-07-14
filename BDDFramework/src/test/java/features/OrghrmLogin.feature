Feature: Orangehrm login features

Scenario: Verify user able to log in successfully
	Given User launches the browser and hit thr url
	When User displays login page and verifies logoes, login panel
	And User enters username, password and clicks on login button
	Then User should be able to display URL endsWith dashboard
	And User closes browser