@Smoke
Feature: My First Feature

  Scenario: Buy iPhone 14 Pro Max
    Given user on web "https://www.apple.com/"
    Then user should see header logo apple
    When user clicked "Buy" button
    Then user should see "Buy iPhone 14 Pro" text
    And user clicked "iPhone 14 Pro Max" buttons
    Then appear colors
    When user clicked on Deep Purple Colors
    Then user should see memory of Iphone
    And user chosen 1TB memory of Iphone
    Then appear payment options
    And user should pay