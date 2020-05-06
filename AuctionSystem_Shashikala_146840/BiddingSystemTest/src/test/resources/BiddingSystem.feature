Feature: Test BiddingUserLogin
 
  Scenario Outline: Login scenario test for BiddingSystem
    Given navigate to BiddingSystem
    When user logged in using username as "<username>" and password as "<pwd>" and product name as "<ProductName>" and price as "<Price>" and as Email "<Email>" and Address as "<Address>"
    Then Add the item should be displayed

	#The User Name Is Primary Key So Need to Change Every time
 Examples:
		|username			        |pwd					|ProductName  |Price  |Email   							|Address   |BidderName		|ProductName	|Bidding Price	|Email								|Address		|
		|RamyaDesai							|1234		|Book         |50000  |Komal@gmail.com			|Bangalore |RamyaDesai				|Book					|70000					|shashikala@gmail.com	|Bangalore	|
		