Feature: Login Test cases for OrangeHRML

Scenario: Verify Login Test case using valid uname and password
	Given Open broswer and navigate to "https://opensource-demo.orangehrmlive.com/" 
	When Click on the login page
	When Enter the usename "Admin" and Password "Admin123"
	Then Login page should open 
	
Scenario: Verify Login Test case using Invalid uname and password
	Given Open broswer and navigate to "https://opensource-demo.orangehrmlive.com/" 
	When Click on the login page
	When Enter the usename "Admin123" and Password "Admin123"
	Then Login page should not open 
	
	Scenario: Verify Login Test case using valid uname and Invalid password
	Given Open broswer and navigate to "https://opensource-demo.orangehrmlive.com/" 
	When Click on the login page
	When Enter the usename "Admin" and Password "Admin123"
	Then Login page should not open 
	
	Scenario: Verify Login Test case using Invalid uname and Invalid password
	Given Open broswer and navigate to "https://opensource-demo.orangehrmlive.com/" 
	When Click on the login page
	When Enter the usename "Admin123" and Password "Admin123"
	Then Login page should not open 
	
	Scenario: Verify Login Test case using Blank uname and Invalid password
	Given Open broswer and navigate to "https://opensource-demo.orangehrmlive.com/" 
	When Click on the login page
	When Enter the usename "" and Password "Admin123"
	Then Login page should not open 
	
	
	Scenario: Verify Login Test case using  Valid uname and Blank password
	Given Open broswer and navigate to "https://opensource-demo.orangehrmlive.com/" 
	When Click on the login page
	When Enter the usename "Admin" and Password ""
	Then Login page should not open 
	
	Scenario: Verify Login Test case using  InValid uname and Blank password
	Given Open broswer and navigate to "https://opensource-demo.orangehrmlive.com/" 
	When Click on the login page
	When Enter the usename "Admin123" and Password ""
	Then Login page should not open 
	
	Scenario: Verify Login Test case using  Blank uname and Blank password
	Given Open broswer and navigate to "https://opensource-demo.orangehrmlive.com/" 
	When Click on the login page
	When Enter the usename "" and Password ""
	Then Login page should not open 
	
	