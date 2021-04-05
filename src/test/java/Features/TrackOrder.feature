Feature: Track Order
  @Regression @Smoke
  Scenario: Track your Order
    Given i am on Fetchr track page
    When i enter a valid tracking number
    Then the current status of order should be displayed

  @Regression
  Scenario: Where can i Find my Tracking number
    Given i am on Fetchr Homepage
    And i click on Track Button
    When i click on where can i find my tracking number
    Then Check your SMS from fetchr popup should be displayed
