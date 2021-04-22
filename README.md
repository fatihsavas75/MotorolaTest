## Project
I have created this project with maven so I keep all dependencies in pom.xml file

I created configuration.properties file, which contains browser type and urls in key-value format.

My framework is Cucumber (BDD).

I built my framework using Java Programming Language.

I used maven as a build automation tool for my java project.

I used Cucumber-Junit and Cucumber runner to orchestrate tests.

Inside the Cucumber runner, I used glues to connect feature files to step definitions.

I added the report plugin to Cucumber Runner to generate Json and HTML report.

I am using Page Object Modelling to enhance test maintenance and reducing code duplication. This is one of the most famous Selenium approaches.

I use Page Object Classes to store and identify the elements that I work on.

I use the PageFactory class and initElements method to initialize them.

I am using Cucumber and Gherkin language for non-technical people to understand what is going on in testing.

To interact with browsers, I am utilizing Selenium WebDriver.

I used the Singleton pattern by declaring constructor of class as private so that no one instantiates class outside of it. And declared a static method with return type as object of class which should check if class is already instantiated once.

I have created my test cases in the feature files as-is.

In the Feature folder, I store my feature files separately, and it helps in the usability of the codes.

I use hook class as pre-and post-test implementations.

Step Definitions folder is the place where my actual test scripts are.

I added a screenshot interface; when the scenario fails, it takes a screenshot.

For assertions/verifications, to compare expected and actual results I utilize Junit assertions.

I also added info section in to the console section with logger class as you can see below.

# INFO: It is in Best Seller

# INFO: Has Kindle Edition

# utilities
-I created Driver utility, which is designed as singleton and it supports "chrome","chrome-headless","firefox","firefox-headless","internet explorer" for windows and "edge", "safari" for mac.

-I created ConfigurationReader utility to be able to get the values from configuration.properties file.

-I created BrowserUtility which contains static methods

# pages
I created abstract BasePage, which contains all common webelements and methods and other pages extends it.

I used PageFactory.initElements method to be able to initialize webelements by using @FindBy annotation without using findElement() method.

I created CreateAccountPage,ProductDetailPage,SearchPage and SignInPage classes for those specific pages which extends base page to be able to use common web elements and methods.


# tests
I created objects from the pages to be able to use its webelements and methods. 

Since I execute these tests on my local computer, I used 5 seconds implicit wait to avoid from synchronization issues because of internet and my computer`s speed.

I created Search.feature file under resources, that contains Scenerio which is written in Gherkin language

I created Step Definition class which executes steps from feature files

# How to run the tests?
Clone the project from github to your IDE (I prefer to use IntelliJ)

Runner is located under src/test/java/com/project/runners

Simply click on Run Test


- "mvn clean tests" to run all tests from command line

#browsers
You can change browser type from configuration.properties file

It supports "chrome","chrome-headless","firefox","firefox-headless","ie","edge" and "safari"

#report
It generates basic cucumber HTML report under target folder

#As a result:
My framework is easy to maintain since I have elements stored in one centralized place. 
If any changes happen on the application about the elements, 
I know where to go and how to fix it to run test scripts correctly.



