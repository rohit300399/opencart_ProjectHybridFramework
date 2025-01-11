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

The project follows a modular structure, separating different components based on their functionality. Below is an overview of the directory structure:

src/ ├── main/ │ └── java/ │ ├── pageObjects/ │ │ ├── BasePage.java # Base page class for common functionalities │ │ ├── HomePage.java # Page object for the Home page │ │ └── RegistrationPage.java # Page object for the Registration page │ ├── testBase/ │ │ └── BaseClass.java # Base class for common test setup and teardown │ ├── utilities/ │ │ ├── ExcelUtility.java # Utility class for reading/writing Excel files │ │ ├── ExtentReportUtility.java # Utility for generating Extent reports │ │ └── DataProviders.java # Class for providing data for data-driven tests ├── test/ │ └── java/ │ ├── testCases/ │ │ ├── AccountRegistrationTest.java # Test for user account registration │ │ ├── LoginTest.java # Test for user login functionality │ │ └── LoginDataDrivenTest.java # Data-driven test for login functionality │ ├── resources/ │ │ ├── config.properties # Configuration file for environment settings │ │ └── log4j2.xml # Logging configuration for Log4j2

## Key Highlights

- **Modular and Reusable Framework**: By following the Page Object Model (POM) design pattern, the framework encapsulates page interactions and validations into separate, reusable objects. This reduces duplication and promotes scalability for future test cases.
- **Improved Test Efficiency**: Parallel execution across multiple browsers drastically reduced the test execution time by 30%, enabling faster feedback and higher productivity in agile environments.
- **Data-Driven Approach**: The framework supports dynamic test execution by feeding input data from Excel files. This allows easy scaling of test cases and ensures comprehensive validation across various data sets.
- **Real-Time Test Reporting**: Extent Reports are generated with detailed logs, screenshots, and test status, providing stakeholders with clear visibility into test execution and immediate identification of issues.

## Setup & Execution

### Prerequisites
- Java (JDK 8 or higher)
- Maven (for dependency management)
- Selenium WebDriver (for browser automation)
- TestNG (for test execution)
- Docker and Selenium Grid (for distributed testing)
- Jenkins (for continuous integration)

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/rohit300399/opencart_ProjectHybridFramework.git

