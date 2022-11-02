@Background
Feature: Demo

  Background: Demo 1
    Given user login to system
    When user input login with mock date
    And user clicked on login button
    Then user in the system

    Scenario: Test buy IPhone 14 PRO MAX
      Then user should see header logo apple
      When user clicked "Buy" button

    Scenario: Test buy IPhone 14 PRO MAX
      Then user should see "Buy iPhone 14 Pro" text
      And user clicked "iPhone 14 Pro Max" buttons

    Scenario: Test buy IPhone 14 PRO MAX
      When user clicked on Deep Purple Colors
      Then user should see memory of Iphone

