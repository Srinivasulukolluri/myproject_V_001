

  Scenario: add new customer
    Given user lauch chrome browser
    When user opens URL "http://admin-demo.nopcommerce.com/login"
    And user enters Email as "admin@yourstore.com"and password as "admin"
    And click on login
    Then user can view dashboard
    When user click on customers menu
    And click on add new button
    Then user can view add new customer page
    When user enter customer infor
    And click on save button
    Then user can view confirmation message "the new customer has been added successfullu"
    And close browser
    
    
