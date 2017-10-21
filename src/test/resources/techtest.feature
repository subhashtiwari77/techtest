Feature: Test

@runThis
Scenario: Search for a book and add to basket
Given navigate to Amazon UK website
When change the search filter to books and search for the book
   And add the book to the basket
Then the searched book is added to the checkout
