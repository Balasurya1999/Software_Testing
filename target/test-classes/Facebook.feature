
Feature: To Create a New Account for Facbook Application

Scenario: To 	Create a Account
Given To Launch the Chrome Browser and maximize the Window
Then To Launch the Facebook URL
And To Click Create New Account button
And To Pass the First_Name in Firstname_Textfield
|Selenium|Java|Manual|MySql|
And To pass the Second_Name in Surname_Textfield
|SecondName1|Vijay|
|SecondName2|Ajith|
|SecondName3|Surya|
|SecondName4|kamal|
And To Pass the Number or Email in Num_Textfield
|bala@gmail.com|9443386878|surya@gmail.com|9698859978|
|selenium@gmail.com|9443944457|9443333867|inmakes@gmail.com|
And To pass the Password in Password_Textfield
|Password1|Password2|
|123456789|987654321|
|1122334455|66778899|
|5599887744|22887744|
Then To Close the Entire Browser