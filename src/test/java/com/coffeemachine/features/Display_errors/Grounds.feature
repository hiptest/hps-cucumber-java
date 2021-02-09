Feature: Grounds
    As a coffee lover
    I have to empty the grounds
    So I don't end up with a total mess around the coffee machine

  Background:
    Given the coffee machine is started
    And I handle everything except the grounds

  Scenario: Message "Empty grounds" is displayed after 30 coffees are taken (uid:455ac442-af07-459a-a3c6-07f563004783)
    When I take "30" coffees
    Then message "Empty grounds" should be displayed

  Scenario: When the grounds are emptied, message is removed (uid:7cb7a378-e35c-4270-b4f6-a24799b09eb9)
    Given I take "30" coffees
    When I empty the coffee grounds
    Then message "Ready" should be displayed
