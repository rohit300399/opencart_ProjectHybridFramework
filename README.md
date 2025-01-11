# Hybrid Driven Automation Framework for OpenCart

## Project Overview
This Hybrid Driven Automation Framework was developed to automate the OpenCart e-commerce platform using modern test automation best practices. Built with Java, Selenium WebDriver, TestNG, and Maven, the framework is designed for scalability, maintainability, and ease of use. By leveraging the Page Object Model (POM) and integrating key tools for parallel execution and data-driven testing, this framework is well-suited for large-scale test automation needs.

## Key Features

- **Scalable & Modular Framework**: Built using the Page Object Model (POM) to separate test scripts from the application code, improving maintainability and reusability.
- **Cross-Browser Testing**: Supports seamless test execution across Chrome, Firefox, and Edge browsers, allowing for consistent quality assurance across different environments.
- **Parallel Execution**: Leveraged TestNG's parallel execution capabilities to reduce test execution time by 30%, improving overall test efficiency.
- **Data-Driven Testing**: Integrated Apache POI to read and write test data from Excel files, enabling dynamic, data-driven test execution for increased test coverage.
- **Logging and Reporting**: Utilized Log4j2 for structured logging and Extent Reports to provide rich, interactive test execution reports, including screenshots of failures for better debugging.
- **CI/CD Integration**: The framework is integrated with Jenkins to enable continuous test execution as part of the CI/CD pipeline, ensuring fast feedback during development cycles.
- **Distributed Testing with Selenium Grid**: Enabled Selenium Grid and Docker for distributed test execution, reducing test time and enhancing environment compatibility.

## Project Architecture

|-- src |-- main |-- java |-- pageObjects |-- BasePage.java |-- HomePage.java |-- RegistrationPage.java |-- testBase |-- BaseClass.java |-- utilities |-- ExcelUtility.java |-- ExtentReportUtility.java |-- DataProviders.java |-- test |-- java |-- testCases |-- AccountRegistrationTest.java |-- LoginTest.java |-- LoginDataDrivenTest.java |-- resources |-- config.properties |-- log4j2.xml

