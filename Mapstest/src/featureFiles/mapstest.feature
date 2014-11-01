

    Feature: Testing Maps

    Scenario: Searching for DHBW Karlsruhe

    Given I am on Google
    And switch over to Maps

    When I search for DHBW Karlsruhe

    Then the adress is Erzbergerstrasse 121
    And the city is 76133 Karlsruhe
    
    Scenario: Searching for ZKM

    Given I am on Google
    And switch over to Maps

    When I search for ZKM

    Then the adress is Erzbergerstrasse 121
    And the city is 76133 Karlsruhe

    