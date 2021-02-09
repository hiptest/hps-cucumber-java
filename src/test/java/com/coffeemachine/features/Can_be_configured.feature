Feature: Can be configured
    As this is a high quality product
    It is possible to configure it
    In order to get the best possible coffees

  Scenario: Display settings (uid:0a9c4e4d-e64a-4b2a-9f76-f75cdda74794)
    Given the coffee machine is started
    When I switch to settings mode
    Then displayed message is:
      """
      Settings:
       - 1: water hardness
       - 2: grinder
      """

  Scenario: Default settings (uid:a57fb326-7931-48df-84d3-565f28d5996b)
    Given the coffee machine is started
    When I switch to settings mode
    Then settings should be:
      | water hardness | 2      |
      | grinder        | medium |
