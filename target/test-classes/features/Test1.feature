Feature: Elements

  @test1
  Scenario: Get test Full name
    Given user is on "https://demoqa.com/" web page
    And user clicks button on Element button
    And user clicks on Text Box button
    Then user should see text "Full Name"

