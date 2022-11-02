@Outline
Feature:
  Scenario Outline: Demo
    Given user on web "http://aidar/talentlms.com./user/create"
    Then user should see header logo apple
    When user input field "<First name>" with following credentials First name
    And user input field "<Last name>" with following credentials Last name
    And user input field "<Email Address>" with following credentials Email
    And user input field "<Username>" with following credentials Username
    And user input field "<Password>" with following credentials Password
    And user input field "<BIO>" with following credentials BIO
    Examples:
      | First name | Last name      | Email Address  | Username  | Password | BIO                   |
      | Nooruzbek  | Taalaibek uulu | nooruz@mail.ru | nooruzbek | 123123   | this is bio nooruzbek |
      | Guldana    | Sultanova      | guldan@mail.ru | guldana   | 12456    | his is bio guldana    |
      | Baktygul   | jekshembieva   | baku@mail.ru   | baktygul  | 5348952  | his is bio baktygul   |
