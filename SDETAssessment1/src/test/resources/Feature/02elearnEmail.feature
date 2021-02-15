@composemail
Feature: This is to validate the compose mail

Background:
Given Logged into the elearn page  

Scenario: this is to compose a mail
When Click on the compose link
When Enter the mail id 
When Enter the subject
When Enter the message content
When Click on the send button
Then Message sent successfully