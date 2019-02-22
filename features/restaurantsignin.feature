@login
Feature: Signin

Scenario: positive

Given  logged in  homepage

When  i click signin button
And   i enter valid username
And   i enter valid password 
And   i click signin
Then  i succesfully signed in restaurant.com


