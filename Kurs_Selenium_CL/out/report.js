$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Cucumber/Features/user-address-creation.feature");
formatter.feature({
  "line": 1,
  "name": "User address creation",
  "description": "",
  "id": "user-address-creation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Registered user can create new address",
  "description": "",
  "id": "user-address-creation;registered-user-can-create-new-address",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "an logged in user on the page https://prod-kurs.coderslab.pl/index.php",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user info button is clicked",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the field with ADDRESSES is clicked on the customer account view",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the address link action Create new address is chosen",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the Alias \u003calias\u003e is entered in input field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the Address \u003caddress\u003e is entered in input field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the City \u003ccity\u003e is entered in input field",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the Postal code \u003cpostalCode\u003e is entered in input field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the Country is chosen in dropdown list",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "the Phone \u003cphone\u003e is entered in input field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "the button SAVE is clicked",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "the new user address is added",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "close browser",
  "keyword": "And "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "user-address-creation;registered-user-can-create-new-address;",
  "rows": [
    {
      "cells": [
        "alias",
        "address",
        "city",
        "postalCode",
        "phone"
      ],
      "line": 19,
      "id": "user-address-creation;registered-user-can-create-new-address;;1"
    },
    {
      "cells": [
        "JDoes",
        "New Bridge 12",
        "London",
        "E1 6AN",
        "020 8564 2423"
      ],
      "line": 20,
      "id": "user-address-creation;registered-user-can-create-new-address;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 20,
  "name": "Registered user can create new address",
  "description": "",
  "id": "user-address-creation;registered-user-can-create-new-address;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "an logged in user on the page https://prod-kurs.coderslab.pl/index.php",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user info button is clicked",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the field with ADDRESSES is clicked on the customer account view",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the address link action Create new address is chosen",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the Alias JDoes is entered in input field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the Address New Bridge 12 is entered in input field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the City London is entered in input field",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the Postal code E1 6AN is entered in input field",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the Country is chosen in dropdown list",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "the Phone 020 8564 2423 is entered in input field",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "the button SAVE is clicked",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "the new user address is added",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "NewAddressCreation.anLoggedInUserOnThePageHttpsProdKursCoderslabPlIndexPhp()"
});
formatter.result({
  "duration": 8125323030,
  "status": "passed"
});
formatter.match({
  "location": "NewAddressCreation.userInfoButtonIsClicked()"
});
formatter.result({
  "duration": 350230918,
  "status": "passed"
});
formatter.match({
  "location": "NewAddressCreation.theFieldWithADDRESSESIsClickedOnTheCustomerAccountView()"
});
formatter.result({
  "duration": 356099839,
  "status": "passed"
});
formatter.match({
  "location": "NewAddressCreation.theAddressLinkActionCreateNewAddressIsChosen()"
});
formatter.result({
  "duration": 5316295144,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using xpath\u003d//*[@id\u003d\"content\"]/div[3]/a\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027KAMIL-HP\u0027, ip: \u002710.7.243.19\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u002715.0.2\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat ZadZaliczeniowe1.NewAddressCreation.theAddressLinkActionCreateNewAddressIsChosen(NewAddressCreation.java:67)\r\n\tat ✽.And the address link action Create new address is chosen(src/Cucumber/Features/user-address-creation.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "JDoes",
      "offset": 10
    }
  ],
  "location": "NewAddressCreation.theAliasAliasIsEnteredInInputField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "New Bridge 12",
      "offset": 12
    }
  ],
  "location": "NewAddressCreation.theAddressAddressIsEnteredInInputField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "London",
      "offset": 9
    }
  ],
  "location": "NewAddressCreation.theCityCityIsEnteredInInputField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "E1 6AN",
      "offset": 16
    }
  ],
  "location": "NewAddressCreation.thePostalCodePostalCodeIsEnteredInInputField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewAddressCreation.theCountryCountryIsEnteredInInputField()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "020 8564 2423",
      "offset": 10
    }
  ],
  "location": "NewAddressCreation.thePhonePhoneIsEnteredInInputField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewAddressCreation.theButtonSAVEIsClicked()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewAddressCreation.theNewUserAddressIsAdded()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewAddressCreation.cLoseBrowser()"
});
formatter.result({
  "status": "skipped"
});
});