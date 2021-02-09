Feature: Support internationalisation
    As a polyglot coffee lover
    I can select the language on the coffee machine
    So I can practice my use of greetings in several languages

  Scenario: No messages are displayed when machine is shut down (uid:f603873d-2d98-4a9a-8846-7d4bb8462e18)
    Given the coffee machine is started
    When I shutdown the coffee machine
    Then message "" should be displayed

  Scenario Outline: Messages are based on language (<hiptest-uid>)
    Well, sometimes, you just get a coffee.
    When I start the coffee machine using language "<language>"
    Then message "<ready_message>" should be displayed

    Examples:
      | language | ready_message | hiptest-uid |
      | en | Ready | uid:3f7ec705-4a8e-48bb-b589-b643d9bb4413 |
      | fr | Pret | uid:7636b949-8015-4002-af66-d5be3cd4dd6a |
