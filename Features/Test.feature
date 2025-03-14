Feature: Clicking the Help centre page

 Scenario: Successful clicking the page
 Given User able to lauch Chrome browser and the Bank URL "http://Scotiabank.com"
 When Clicking on Help centre button
 Then User should be navigating to Help centre page
 And Close the browser
