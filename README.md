

```markdown
# 🧪 Scotiabank Help Centre Automation (Selenium + Cucumber)

This project automates the validation of the **Help Centre** page on the [Scotiabank](https://www.scotiabank.com) website using the **Selenium WebDriver** and **Cucumber BDD** framework in Java.

## 🌐 Scope

- 🔐 Logs into the Scotiabank website (if applicable)
- 📘 Navigates to the Help Centre section
- ✅ Validates that key Help Centre options are displayed and functioning as expected

---

## 🧰 Tech Stack

| Tool/Library       | Purpose                            |
|--------------------|-------------------------------------|
| Java               | Programming language                |
| Selenium WebDriver | Web automation                      |
| Cucumber           | BDD framework for feature files     |
| Maven              | Dependency and build management     |
| JUnit / TestNG     | Test runner                         |
| Page Object Model  | Test structure design pattern       |

---

## 📁 Project Structure

```

ScotiabankHelpCentreAutomation/
├── src/
│   └── test/java/
│       ├── stepdefinitions/   # Cucumber step definitions
│       ├── pages/             # Page classes (e.g., LoginPage, HelpCentrePage)
│       ├── runners/           # Test runners using JUnit/TestNG
│       └── utilities/         # Helpers (driver, waits, etc.)
├── src/test/resources/
│   └── features/
│       └── HelpCentre.feature # Cucumber feature files
├── pom.xml                   # Maven config
└── README.md                 # Project documentation

````

---

## 📝 Cucumber Feature Summary

### `HelpCentre.feature`

```gherkin
Feature: Scotiabank Help Centre Validation

  Scenario: Validate Help Centre options on Scotiabank website
    Given I navigate to the Scotiabank homepage
    When I click on the Help Centre link
    Then I should see all available Help Centre options
````

---

## 🚀 Getting Started

### Prerequisites

* Java JDK 8+
* Maven installed
* Chrome browser & compatible ChromeDriver

### Clone & Run

```bash
git clone https://github.com/yourusername/ScotiabankHelpCentreAutomation.git
cd ScotiabankHelpCentreAutomation
mvn clean test
```

### Run from IDE

* Open the project in IntelliJ or Eclipse
* Right-click the test runner class inside `runners/` → **Run**

---

## 📌 Key Features

* Modular Page Object Model
* Cucumber with Gherkin for BDD-style test cases
* Reusable browser and wait utilities
* Easy-to-read feature files for business stakeholders

---

## 📊 Reporting

* Cucumber default HTML reports generated after each run
* Advanced reports (Extent/Cucumber HTML plugin) can be added optionally

---

## 🤝 Contributing

Feel free to fork this repo and enhance it. Bug fixes, new scenarios, and refactors are welcome via pull requests.

---

## 📞 Contact

**Feona Donnal**
📍 Ontario, Canada
📧 [feonadonnal@gmail.com](mailto:feonadonnal@gmail.com)
🔗 [LinkedIn](https://www.linkedin.com/in/yourprofile)

---

> ⚠️ This project is built for **educational/demo purposes** and is not affiliated with or endorsed by Scotiabank.

```




