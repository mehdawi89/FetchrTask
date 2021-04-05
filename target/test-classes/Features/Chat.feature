Feature: Chat
 
  @Regression @smoke
  Scenario Outline: Send a message Using Chat to Support in different languages Arabic and English
    Given i am on Fetchr Homepage
    And click on Chat support icon
    When i enter a message in English or Arabic<Language>
    Then the message should be sent Successfully<Language>

    Examples: 
      | Language                                         |
      | Hi i want to ask about my order Number 100213123 |
      | مرحبا اريد السؤال عن الطلب رقم 123332123         |

  @Regression
  Scenario Outline: Send a message Using Chat to Support team with Random Text and Emojis
    Given i am on Fetchr Homepage
    And click on Chat support icon
    When i send a message using Random Text with emojis<Language>
    Then the message should be sent Successfully<Language>

    Examples: 
      | Language                                         |
      | Hi i want to ask about my order Number 100213123 |
