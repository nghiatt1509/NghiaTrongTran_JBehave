Narrative:
As a user
I want to make a search from Google Home page
So that I can get a result with expected result

Scenario: Scenario Google Search with JBehave keyword
Given User is on Google Home
When Make a search with '<keyword>'
Then Navigate to search Result Page with expected result as '<expectedResult>'

Examples:
    |keyword|expectedResult|
    |JBehave|What is JBehave?|