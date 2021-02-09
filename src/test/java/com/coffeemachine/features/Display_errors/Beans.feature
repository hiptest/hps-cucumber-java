Feature: Beans
    As a coffee lover
    I have to put fresh beans from time to time
    So I can have coffee when I need it

  Background:
    Given the coffee machine is started
    And I handle everything except the beans

  Scenario: Message "Fill beans" is displayed after 38 coffees are taken (uid:a2e324c9-29a3-44b1-946d-edebba561b9b)
    When I take "38" coffees
    Then message "Fill beans" should be displayed

  Scenario: It is possible to take 40 coffees before there is really no more beans (uid:b1185f2a-db35-4b5f-b821-e48d070ac6eb)
    Given I take "40" coffees
    Then coffee should be served
    When I take a coffee
    Then coffee should not be served
    And message "Fill beans" should be displayed

  Scenario: After adding beans, the message "Fill beans" disappears (uid:1d0694f0-0438-412d-8cd2-c21ce23b6b27)
    Given I take "40" coffees
    When I fill the beans tank
    Then message "Ready" should be displayed
