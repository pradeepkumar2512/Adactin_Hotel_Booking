Feature: Adactin Hotel Booking Application

Scenario: Login Page

Given Launch_the_Adactin_Hotel_URL_in_browser
When user Enter the username 
And user Enter the password
Then user Click on Login button

Scenario: Search Hotel Page

When user Select the preferred location
And user Select the preferred hotal
And user Select the type of room needed
And user Select the total number of rooms needed
And user Select the check in date
And user Select the check out date
And user Select the number of adults per room
And user Select the number of children per room
Then user Click on Search button

Scenario: Select Hotel Page

When user Click on radio button 
Then user Click on Continue button

Scenario: Book A Hotel Page

When user Enter the first name
And user Enter the last name
And user Enter the biling address
And user Enter the 16 digit credit Card number
And user Enter the credit card type
And user Enter the expiry date
And user Enter the CVV number
Then user Click on Book Now button

Scenario: Booking Confirmation Page

Then user Click on My Itinerary button

Scenario: Booked Itinerary Page

Then user Click on Logout button

