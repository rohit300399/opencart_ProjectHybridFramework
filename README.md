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

## Project Structure

The project follows a structured layout with Maven for dependency management. The key components include:

### `src/main`: Java source code
- **`pageObjects`**: Contains page objects representing different pages of the OpenCart application.
  - `BasePage.java`: Common functionalities for all pages.
  - `HomePage.java`: Represents the home page of the application.
  - `RegistrationPage.java`: Represents the registration page.
  - `LoginPage.java`: Represents the login page.
  - `MyAccountPage.java`: Represents the My Account page.
  - `SearchPage.java`: Represents the search functionality page.
  - `ShoppingCartPage.java`: Represents the shopping cart page.
  - `CheckoutPage.java`: Represents the checkout page.

- **`testBase`**: Contains base classes for common test setup.
  - `BaseClass.java`: Common setup and teardown functionalities for all tests.

### `src/test`: Test-related resources
- **`java/testCases`**: Contains the test scripts for various scenarios.
  - `AccountRegistrationTest.java`: Test for user account registration.
  - `LoginTest.java`: Test for user login functionality.
  - `LoginDataDrivenTest.java`: Data-driven test for user login.
  - `SearchProduct.java`: Test for searching products.
  - `AddProductToCart.java`: Test for adding products to the cart.
  - `EndToEndTest.java`: End-to-end test that covers the entire purchase process.

- **`resources`**: Contains configuration and logging files.
  - `log4j2.xml`: Configuration for logging via Log4j2.
  - `config.properties`: Stores environment and application settings.

- **`utilities`**: Contains utility classes used across the framework.
  - `ExtentReportUtility.java`: Generates Extent reports for test execution.
  - `ExcelUtility.java`: Handles reading and writing data to Excel files.
  - `DataProviders.java`: Provides data for data-driven tests.

- **`testData`**: Contains Excel files for test data.
  - `TestData.xlsx`: Excel file with test data used in data-driven tests.

### Other Configurations
- **`testng.xml`**: Configuration file for TestNG, specifying the test suite, test cases, and groups.
- **`grouping.xml`**: TestNG configuration for grouping test cases.
- **`pom.xml`**: Maven configuration for managing project dependencies and build lifecycle.
- **`run.bat`**: Batch file for running tests on Windows.

This organized structure ensures clarity, modularity, and ease of maintenance while facilitating efficient test automation development and execution.

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

