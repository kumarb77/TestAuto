$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ShoppingCartTest.feature");
formatter.feature({
  "line": 1,
  "name": "ShoppingCart",
  "description": "Description:The purpose of this feature is to test the Shopping cart",
  "id": "shoppingcart",
  "keyword": "Feature"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Open https://www.amazon.com",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I am on Signin page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.open_https_www_amazon_com()"
});
formatter.result({
  "duration": 10713608163,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_am_on_Signin_page()"
});
formatter.result({
  "duration": 1266313097,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Search product and add to basket",
  "description": "",
  "id": "shoppingcart;search-product-and-add-to-basket",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I enter username as \"kumarb8851@gmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I enter password as \"gymnospe\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should see home page header as \"Hello, kumar\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I search for \"Iphone x 64\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I choose to buy first item",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I add item to basket",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I validate item from basket",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I Signout",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I enter username as \"kumarb8851@gmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I enter password as \"gymnospe\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I should see item in basket",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I remove item from basket",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "kumarb8851@gmail.com",
      "offset": 21
    }
  ],
  "location": "Steps.i_enter_username_as(String)"
});
formatter.result({
  "duration": 1011063244,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "gymnospe",
      "offset": 21
    }
  ],
  "location": "Steps.i_enter_password_as(String)"
});
formatter.result({
  "duration": 2869337471,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello, kumar",
      "offset": 34
    }
  ],
  "location": "Steps.i_should_see_home_page_header_as(String)"
});
formatter.result({
  "duration": 47763840,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Iphone x 64",
      "offset": 14
    }
  ],
  "location": "Steps.i_search_for(String)"
});
formatter.result({
  "duration": 3251626093,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_choose_to_buy_first_item()"
});
formatter.result({
  "duration": 4122112311,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_add_item_to_basket()"
});
formatter.result({
  "duration": 1552436183,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_validate_item_from_basket()"
});
formatter.result({
  "duration": 2328475424,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_signout()"
});
formatter.result({
  "duration": 1049602139,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kumarb8851@gmail.com",
      "offset": 21
    }
  ],
  "location": "Steps.i_enter_username_as(String)"
});
formatter.result({
  "duration": 1519645204,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "gymnospe",
      "offset": 21
    }
  ],
  "location": "Steps.i_enter_password_as(String)"
});
formatter.result({
  "duration": 1825914312,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_should_see_item_in_basket()"
});
formatter.result({
  "duration": 166840449,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_remove_item_from_basket()"
});
formatter.result({
  "duration": 3618729362,
  "status": "passed"
});
});