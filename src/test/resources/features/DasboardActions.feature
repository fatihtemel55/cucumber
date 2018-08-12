@f&f
Feature: Note on Dashboard 

Scenario: Post a note on Dasboard 
	Given I logged into suiteCRM 
	When I post "Hello Everyone" 
	Then Post should be displayed 
	Then logout from application
	