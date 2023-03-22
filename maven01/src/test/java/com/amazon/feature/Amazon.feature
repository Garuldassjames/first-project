Feature: E-commerce website
Scenario: search and compare using the dropdown method
Given select "music" by using dropdown option
When send this key "cd" in the searchbox and compare with the reference and select
And get the product title and select the product and move to next page

Scenario: add to cart page
Given get the current page product title and compare with the homepage product title
When after comparison is matched select the add to cart button
And move to the next page

Scenario: after go to cart
Given select go to cart button
When take screenshot of the page after selecting the go to cart button
And fetch the go to cart product title and compare with the homepage product title
And select the proceed to buy button
And move to next page

Scenario: closing the current browsing page
When closing the current web page 
 

