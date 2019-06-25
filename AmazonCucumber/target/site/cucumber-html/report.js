$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/BookShopping.feature");
formatter.feature({
  "line": 1,
  "name": "Shopping at amzon",
  "description": "",
  "id": "shopping-at-amzon",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5710231925,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Add three book into cart and do cart operations",
  "description": "",
  "id": "shopping-at-amzon;add-three-book-into-cart-and-do-cart-operations",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Books_shopping"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on amazon page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user search Experiences of Test Automation: Case Studies of Software Test Automation book name",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on search icon",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click on book name",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click on add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user searched for Agile Testing: A Practical Guide for Testers and Agile Teams book name",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on search icon",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click on paperback option",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "click on add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user searched for Selenium WebDriver 3 Practical Guide: End-to-end automation testing for web and mobile browsers with Selenium WebDriver, 2nd Edition book name",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click on search icon",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "click on Selenium WebDriver 3 Practical Guide: End-to-end automation testing for web and mobile browsers with Selenium WebDriver, 2nd Edition book name",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "click on add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "click on cart icon",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "click on Save For Later option for Experiences of Test Automation: Case Studies of Software Test Automation book",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "click on Delete option for Agile Testing: A Practical Guide for Testers and Agile Teams book",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "increse the quantity to three for Selenium WebDriver 3 Practical Guide: End-to-end automation testing for web and mobile browsers with Selenium WebDriver, 2nd Edition book",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "click on gift checkox for Selenium WebDriver 3 Practical Guide: End-to-end automation testing for web and mobile browsers with Selenium WebDriver, 2nd Edition book",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user should be able to see the appropriate books added with selected quantity",
  "keyword": "Then "
});
formatter.match({
  "location": "BookShopping.user_is_on_amazon_page()"
});
formatter.result({
  "duration": 6054584185,
  "status": "passed"
});
formatter.match({
  "location": "BookShopping.user_search_Experiences_of_Test_Automation_Case_Studies_of_Software_Test_Automation_book_name()"
});
formatter.result({
  "duration": 481408017,
  "status": "passed"
});
formatter.match({
  "location": "BookShopping.click_on_search_icon()"
});
formatter.result({
  "duration": 1835956836,
  "status": "passed"
});
formatter.match({
  "location": "BookShopping.click_on_book_name()"
});
formatter.result({
  "duration": 264962734,
  "status": "passed"
});
formatter.match({
  "location": "BookShopping.click_on_add_to_cart_button()"
});
formatter.result({
  "duration": 2731789534,
  "status": "passed"
});
formatter.match({
  "location": "BookShopping.user_searched_for_Agile_Testing_A_Practical_Guide_for_Testers_and_Agile_Teams_book_name()"
});
formatter.result({
  "duration": 370686015,
  "status": "passed"
});
formatter.match({
  "location": "BookShopping.click_on_search_icon()"
});
formatter.result({
  "duration": 2224195852,
  "status": "passed"
});
formatter.match({
  "location": "BookShopping.click_on_paperback_option()"
});
formatter.result({
  "duration": 271215974,
  "status": "passed"
});
formatter.match({
  "location": "BookShopping.click_on_add_to_cart_button()"
});
formatter.result({
  "duration": 3031174415,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 37
    },
    {
      "val": "2",
      "offset": 139
    }
  ],
  "location": "BookShopping.user_searched_for_Selenium_WebDriver_Practical_Guide_End_to_end_automation_testing_for_web_and_mobile_browsers_with_Selenium_WebDriver_nd_Edition_book_name(int,int)"
});
formatter.result({
  "duration": 295893752,
  "status": "passed"
});
formatter.match({
  "location": "BookShopping.click_on_search_icon()"
});
formatter.result({
  "duration": 3181637220,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 28
    },
    {
      "val": "2",
      "offset": 130
    }
  ],
  "location": "BookShopping.click_on_Selenium_WebDriver_Practical_Guide_End_to_end_automation_testing_for_web_and_mobile_browsers_with_Selenium_WebDriver_nd_Edition_book_name(int,int)"
});
formatter.result({
  "duration": 306368311,
  "status": "passed"
});
formatter.match({
  "location": "BookShopping.click_on_add_to_cart_button()"
});
formatter.result({
  "duration": 2915457797,
  "status": "passed"
});
formatter.match({
  "location": "BookShopping.click_on_cart_icon()"
});
formatter.result({
  "duration": 1786355244,
  "status": "passed"
});
formatter.match({
  "location": "BookShopping.click_on_Save_For_Later_option_for_Experiences_of_Test_Automation_Case_Studies_of_Software_Test_Automation_book()"
});
formatter.result({
  "duration": 353176707,
  "status": "passed"
});
formatter.match({
  "location": "BookShopping.click_on_Delete_option_for_Agile_Testing_A_Practical_Guide_for_Testers_and_Agile_Teams_book()"
});
formatter.result({
  "duration": 5367368490,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 53
    },
    {
      "val": "2",
      "offset": 155
    }
  ],
  "location": "BookShopping.increse_the_quantity_to_three_for_Selenium_WebDriver_Practical_Guide_End_to_end_automation_testing_for_web_and_mobile_browsers_with_Selenium_WebDriver_nd_Edition_book(int,int)"
});
formatter.result({
  "duration": 8614758281,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 45
    },
    {
      "val": "2",
      "offset": 147
    }
  ],
  "location": "BookShopping.click_on_gift_checkox_for_Selenium_WebDriver_Practical_Guide_End_to_end_automation_testing_for_web_and_mobile_browsers_with_Selenium_WebDriver_nd_Edition_book(int,int)"
});
formatter.result({
  "duration": 8334014648,
  "status": "passed"
});
formatter.match({
  "location": "BookShopping.user_should_be_able_to_see_the_appropriate_books_added_with_selected_quantity()"
});
formatter.result({
  "duration": 42134301,
  "status": "passed"
});
formatter.after({
  "duration": 2228430661,
  "status": "passed"
});
});