Feature: flipkart product purchase

Scenario: Homepage
Given after launching the browser pass the "https://www.flipkart.com/"
And  on the search bar serach "iphone 12 red"
And click the searched product
And click the first product 
Then page will be moved to selected product page
And click add to cart option
And login with contact number "9566220866"
And enter the OTP
And place the order on cash on delivery
But remove the products from the cart page 