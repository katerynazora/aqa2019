Feature: Out base test for youtube

    Scenario: Load Youtube
        Given google page is loaded
        When I switch to "Youtube" page
        Then Youtube page loaded successfully

    Scenario: Search for Mammamia
        Given Youtube page is loaded
        When I search for "Mammamia"
        Then "Mammamia" is present in search results