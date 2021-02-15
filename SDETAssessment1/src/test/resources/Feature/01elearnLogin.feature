@tag
Feature: To validate the elearn login page

Background:
#Given Logged into the elearn page  
Given launch the login page

@loginandComposemail
Scenario: validate login with valid id

When Enter valid name "shanthi"
And Enter valid pwd "shanthi"
And click on login button
Then login success "Shanthi Lakshmanan"

#@composemail
#Scenario: this is to compose a mail
When Click on the compose link
When Enter the mail id 
When Enter the subject
When Enter the message content
When Click on the send button
Then Message sent successfully