Feature: Out base test for google

    Scenario: Search for twitter
        Given google page is loaded
        When I search for "twitter"
        Then "Twitter" is present in search results
