$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Facebook.feature");
formatter.feature({
  "name": "To Create a New Account for Facbook Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To \tCreate a Account",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To Launch the Chrome Browser and maximize the Window",
  "keyword": "Given "
});
formatter.match({
  "location": "Fb_Registration.to_Launch_the_Chrome_Browser_and_maximize_the_Window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Launch the Facebook URL",
  "keyword": "Then "
});
formatter.match({
  "location": "Fb_Registration.to_Launch_the_Facebook_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Click Create New Account button",
  "keyword": "And "
});
formatter.match({
  "location": "Fb_Registration.to_Click_Create_New_Account_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Pass the First_Name in Firstname_Textfield",
  "rows": [
    {
      "cells": [
        "Selenium",
        "Java",
        "Manual",
        "MySql"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Fb_Registration.to_Pass_the_First_Name_in_Firstname_Textfield(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the Second_Name in Surname_Textfield",
  "rows": [
    {
      "cells": [
        "SecondName1",
        "Vijay"
      ]
    },
    {
      "cells": [
        "SecondName2",
        "Ajith"
      ]
    },
    {
      "cells": [
        "SecondName3",
        "Surya"
      ]
    },
    {
      "cells": [
        "SecondName4",
        "kamal"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Fb_Registration.to_pass_the_Second_Name_in_Surname_Textfield(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Pass the Number or Email in Num_Textfield",
  "rows": [
    {
      "cells": [
        "bala@gmail.com",
        "9443386878",
        "surya@gmail.com",
        "9698859978"
      ]
    },
    {
      "cells": [
        "selenium@gmail.com",
        "9443944457",
        "9443333867",
        "inmakes@gmail.com"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Fb_Registration.to_Pass_the_Number_or_Email_in_Num_Textfield(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the Password in Password_Textfield",
  "rows": [
    {
      "cells": [
        "Password1",
        "Password2"
      ]
    },
    {
      "cells": [
        "123456789",
        "987654321"
      ]
    },
    {
      "cells": [
        "1122334455",
        "66778899"
      ]
    },
    {
      "cells": [
        "5599887744",
        "22887744"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Fb_Registration.to_pass_the_Password_in_Password_Textfield(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Close the Entire Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Fb_Registration.to_Close_the_Entire_Browser()"
});
formatter.result({
  "status": "passed"
});
});