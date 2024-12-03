Feature: Contact us Function
  Going to verify the Contact us page of the application
Background:
		Given I navigate to protrainingtech.com
    When I click on contact us link
    Then The Join us form displays
@Adhoc
		Scenario Outline: 
    Verify if the user clicks the register button without entering valid fields it shows validation error
		When I click on register button
    Then I am able to see the validation error
    When I enter name "<Name>"
    Then I will see the "<id>"

    Examples: 
      | Name    | Id |
      | Rizwan  | 90 |
      | Shahbaz | 80 |
      | Asim    | 60 |
@Function
Scenario Outline: 
    Verify if the user clicks the register button without entering valid fields it shows validation error
		When I click on register button
    Then I am able to see the validation error
    When I enter name "<Name>"
    Then I will see the "<id>"

    Examples: 
      | Name    | Id |
      | Rizwan  | 90 |
      | Shahbaz | 80 |
      | Asim    | 60 |
      