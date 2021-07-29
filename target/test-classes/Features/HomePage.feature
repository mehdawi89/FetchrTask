Feature: SignUp

  @Regression @smoke
  Scenario Outline: Signup for fetchr.us UAE
    Given i am on Fetchr Homepage
    When i click on GetStarted Button
    And fill the following details firstname<FirstName> lastname<LastName> email<Email> companyname<CompanyName> phonenumber<PhoneNumber>
    And Click on on Contact Me Button
    Then the Singup form should be Registered Successfully<ConfirmMessage>

    Examples: 
      | FirstName | LastName | Email                   | CompanyName | PhoneNumber | ConfirmMessage   |
      | Mohammad  | Auto     | moh.mehdawi89@gmail.com | Test Auto   |  0797265625 | Thank’s for your |

  @Regression
  Scenario Outline: Signup for fetchr.us KSA
    Given i am on Fetchr Homepage
    When i click on GetStarted Button
    And fill the following details firstname<FirstName> lastname<LastName> email<Email> companyname<CompanyName> phonenumber<PhoneNumber>
    And Select Country as KSA
    And Click on on Contact Me Button
    Then the Singup form should be Registered Successfully<ConfirmMessage>

    Examples: 
      | FirstName | LastName | Email                   | CompanyName | PhoneNumber | ConfirmMessage   |
      | Mohammad  | Salah    | moh.mehdawi89@gmail.com | Test Auto   |  0797265625 | Thank’s for your |

  @Regression
  Scenario Outline: Signup for fetchr.us EGYPT
    Given i am on Fetchr Homepage
    When i click on GetStarted Button
    And fill the following details firstname<FirstName> lastname<LastName> email<Email> companyname<CompanyName> phonenumber<PhoneNumber>
    And Select Country as egypt
    And Click on on Contact Me Button
    Then the Singup form should be Registered Successfully<ConfirmMessage>

    Examples: 
      | FirstName | LastName | Email                   | CompanyName | PhoneNumber | ConfirmMessage   |
      | Mohammad  | Salah    | moh.mehdawi89@gmail.com | Test Auto   |  0797265625 | Thank’s for your |

  @Regression
  Scenario Outline: Signup for fetchr.us OMAN
    Given i am on Fetchr Homepage
    When i click on GetStarted Button
    And fill the following details firstname<FirstName> lastname<LastName> email<Email> companyname<CompanyName> phonenumber<PhoneNumber>
    And Select Country as oman
    And Click on on Contact Me Button
    Then the Singup form should be Registered Successfully<ConfirmMessage>

    Examples: 
      | FirstName | LastName | Email                   | CompanyName | PhoneNumber | ConfirmMessage   |
      | Mohammad  | Salah    | moh.mehdawi89@gmail.com | Test Auto   |  0797265625 | Thank’s for your |

  @Regression
  Scenario Outline: Field Validation Signup for fetchr.us
    Given i am on Fetchr Homepage
    When i click on GetStarted Button
    And fill the following details firstname<FirstName> lastname<LastName> email<Email> companyname<CompanyName> phonenumber<PhoneNumber>
    And Click on on Contact Me Button
    Then the error message should be displayed<errormessage>

    Examples: 
      | FirstName | LastName | Email                   | CompanyName | PhoneNumber | errormessage            |
      | empty     | Salah    | moh.mehdawi89@gmail.com | Test Auto   |  0797265625 | This field is required. |
      | Mohammad  | empty    | moh.mehdawi89@gmail.com | Test Auto   |  0797365626 | This field is required. |
      | Mohammad  | Salah    | empty                   | Test Auto   |  0792334234 | This field is required. |
