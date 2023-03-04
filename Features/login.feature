Feature: Login

  Scenario: successful loginwith valid credentials
    Given user launch chrome webbrowser
    When user openes Url "https://www.demoblaze.com/"
    And Click on the login  
    And user enters user name as <username> and  password as  <password> 
    Then page title should be "product store"
    When  user click on log out link
    Then page title should be "product store"
    And close browser
    
    
     Scenario: successful loginwith valid credentials
    Given user launch chrome webbrowser
    When user openes Url "https://www.demoblaze.com/"
    And Click on the login
    And user enters user name as srinivas123 and  password as mynameissrinivas  
    Then page title should be "product store"
    When  user click on log out link
    Then page title should be "product store"
    And close browser
    
    
      |           username	     |             password         | 
      |         srinivas123      |          mynameissrinivas    | 
      |	       srinivas          |						123									|