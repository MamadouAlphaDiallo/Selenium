Feature: Google Search
  As a user, I want to test search function

  Scenario: Basic search
    Given I open google search page
    When I lookup the word "selenium for test"
    Then search results display the word "selenium for test"

