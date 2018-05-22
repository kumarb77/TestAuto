Feature: ShoppingCart
Description:The purpose of this feature is to test the Shopping cart


Background:
    Given Open https://www.amazon.com
    And I am on Signin page
 

        
Scenario: Search product and add to basket 
		When I enter username as "kumarb8851@gmail.com"
        And I enter password as "gymnospe"
        Then I should see home page header as "Hello, kumar" 
        Then I search for "Iphone x 64"
        Then I choose to buy first item
        Then I add item to basket
        Then I validate item from basket
        Then I Signout
        When I enter username as "kumarb8851@gmail.com"
        And I enter password as "gymnospe"
        Then I should see item in basket
        Then I remove item from basket
    

        