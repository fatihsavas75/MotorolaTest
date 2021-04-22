@search
Feature: Search

  Background:
    Given I open the amazon`s webpage

  Scenario Outline:  Users should be able to select "Books" options from drop down and search for the book named Harry Potter and the Philosopher's Stone
    When I select "Books" option from drop down
    And  Search for the book named "Harry Potter and the Philosopher's Stone"
    Then Check if Book is a Best Seller or Not
    Then Verify that author name is "<author>" and published on "<date>"
    Then Check if Book is available in the format of an Kindle Edition
    Then Select the book and proceed towards Check Out
    Then Select Create Your Amazon Account if user do not have an account
    And  Verify all fields available on Create Your Amazon Account page
    Examples:
      | author       | date       |
      | J.K. Rowling | 1 Sep 2014 |