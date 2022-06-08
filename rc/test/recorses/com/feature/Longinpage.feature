Feature:  nopcommerce Longin Feature

Scenario: validet nopcommerce longin 
    
   Given  user is on longin page
   When user get title of the page
   Then Loginpage title should be "Your store. Login"
   When  user enter the Email  " admin@yourstore.com" 
   And   user enter the Password "admin"
   And user click longin button
   Then homePage title should be "Dashboard / nopCommerce administration"
   When user click on Log out button
   And close browser


  
