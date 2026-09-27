# Selenium Test Automation Framework

A Java-based Selenium automation framework for testing web applications using a reusable and maintainable structure.

## 🛠️ Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- WebDriverManager

## ⚙️ How It Works

The framework uses **Page Object Model** to separate test cases from page elements and actions.

```text
Test Case → Page Object → Selenium WebDriver → Web Application → Assertion
```

TestNG manages execution and assertions, while Maven manages dependencies and test execution.

## ✨ Features

- Web UI automation
- Page Object Model
- Reusable page classes
- TestNG test execution
- Assertions and validations
- WebDriver management
- Maven dependency management
- Scalable framework structure

## 📂 Structure

```text
src/test/java/com/automation/
├── base/
├── driver/
├── pages/
└── tests/

pom.xml
testng.xml
```

## ▶️ Run

```bash
git clone https://github.com/YOUR_USERNAME/SeleniumTestAutomationFramework.git
cd SeleniumTestAutomationFramework
mvn clean test
```

## 👨‍💻 Author

**Lokesh Pande**

[GitHub](https://github.com/Lokesh-github07)
