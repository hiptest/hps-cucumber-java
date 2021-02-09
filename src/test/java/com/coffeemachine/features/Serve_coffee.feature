Feature: Serve coffee
    As a coffee lover
    I can get coffee from the machine
    So I can enjoy the rest of the day

  Scenario: Simple use (uid:736322f1-49cb-480d-99a9-693448eefd51)
    Well, sometimes, you just get a coffee.
    Given the coffee machine is started
    When I take a coffee
    Then coffee should be served
