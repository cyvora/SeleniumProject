Feature: HomePage Feature

  Scenario: Opening Home Page of the application
    Given user is on the home page
    When web agent maximize the browser
    When user clicks on skip sign in
    Then user types firstname and lastname
    When web agent waits sometime
    Then user types address
    When web agent waits sometime
    Then user types email address
    When web agent waits sometime
    Then user types phone number
    When web agent waits sometime
    Then user clicks on gender
    When web agent waits sometime
    And user clicks on hobbies
    When web agent waits sometime
    And user types languages
    When web agent waits sometime
    And user selects skills and countries
    When web agent waits sometime
    And user selects select country
    When web agent waits sometime
    And user selects date of birth
    When web agent waits sometime
    Then user types password and confirm password
    When web agent waits sometime
    When web agent quits the browser

  Scenario: Switching to alerts, windows and frames
    Given user is on the home page
    When web agent maximize the browser
    When user clicks on skip sign in
    Then web agent moves to switchTo and clicks alerts
    When web agent waits sometime
    Then web agent clicks on display alert box
    When web agent waits sometime
    Then web agent clicks on alert with ok and cancel
    When web agent waits sometime
    Then web agent clicks on alert with text box
    When web agent waits sometime
    Then web agent moves to switchTo and clicks windows
    When web agent waits sometime
    When web agent quits the browser

  Scenario: Switching to frames
    Given user is on the home page
    When web agent maximize the browser
    When user clicks on skip sign in
    Then web agent moves to switchTo and clicks frames
    When web agent waits sometime
    When web agent quits the browser


  Scenario: widgets, accordion, autocomplete, datepicker, slider
    Given user is on the home page
    When web agent maximize the browser
    When user clicks on skip sign in
    When web agent moves to widgets and clicks accordion
    When web agent waits sometime
    Then web agent moves to widgets and clicks datepicker
    When web agent waits sometime
    Then web agent moves to widgets and clicks slider
    When web agent waits sometime
    When web agent quits the browser

  Scenario: Interactions, drag and drop, selectable, resizeable
    Given user is on the home page
    When web agent maximize the browser
    When user clicks on skip sign in
    Then web agent hovers to interactions, clicks dragdrop and static
    When web agent waits sometime
    Then web agent hovers to interactions, clicks dragdrop and dynamic
    When web agent waits sometime
    Then web agent hovers to interactions and clicks selectable
    When web agent waits sometime
    Then web agent hovers to interactions and clicks resizeable
    When web agent waits sometime
    When web agent quits the browser

  Scenario: Video, youtube, vimeo
    Given user is on the home page
    When web agent maximize the browser
    When user clicks on skip sign in
    Then web agent hovers to video and clicks on youtube
    When web agent waits sometime
    Then web agent hovers to video and clicks on vimeo
    When web agent waits sometime
    When web agent quits the browser

  Scenario: WYSIWYG
    Given user is on the home page
    When web agent maximize the browser
    When user clicks on skip sign in
    Then web agent hovers to WYSIWYG and clicks on tinyMCE
    When web agent waits sometime
    Then web agent hovers to WYSIWYG and clicks on CKeditor
    When web agent waits sometime
    Then web agent hovers to WYSIWYG and clicks on SummerNote
    When web agent waits sometime
    Then web agent hovers to WYSIWYG and clicks on codemirror
    When web agent waits sometime
    When web agent quits the browser

  Scenario: More
    Given user is on the home page
    When web agent maximize the browser
    When user clicks on skip sign in
    Then web agent hovers to more and clicks on charts
    Then web agent scrolls down by 150 pixels
    When web agent waits sometime
    Then web agent hovers to more and clicks on dynamicdata
    When web agent waits sometime
    When web agent refresh the page
    Then web agent hovers to more and clicks on filedownload
    When web agent waits sometime
    When web agent refresh the page
    Then web agent hovers to more and clicks on fileupload
    When web agent refresh the page
    Then web agent hovers to more and clicks on jquery progressbar
    When web agent waits sometime
    When web agent refresh the page
    Then web agent hovers to more and clicks on loader
    When web agent refresh the page
    Then web agent hovers to more and clicks on modals
    When web agent waits sometime
    When web agent refresh the page
    Then web agent hovers to more and clicks on progressbar
    When web agent waits sometime
    When web agent quits the browser












