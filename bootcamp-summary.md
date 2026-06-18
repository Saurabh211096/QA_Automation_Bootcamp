# 28-Day QA Automation Bootcamp Summary

## Day 1: Foundation
*   **Manual Testing:** Structured CSV test cases (ID, Steps, Expected, Actual, Status).
*   **Java OOP:** Implemented basic Encapsulation, Inheritance, Polymorphism, Abstraction.
*   **Collections:** Used `HashMap<String, String>` to map Test Case IDs to dummy test data (emails).
*   **Setup:** Used Maven `pom.xml`. Relied on Selenium 4.6+ built-in Selenium Manager to handle driver executables natively (obsoleting `WebDriverManager`).

## Day 2: Locators Deep Dive
*   **Hierarchy:** Prefer `id`, `name`, `cssSelector`, then `xpath`. 
*   **CSS vs XPath:** CSS is processed natively by the browser (faster). XPath is slower but allows navigating up the DOM tree and searching by visible text.
*   **XPath Axes (Traversing):** Mastered locating stable elements (like a label) and using `parent::`, `ancestor::`, `following-sibling::` to locate dynamic inputs.

## Day 3: Synchronization (Waits) & Utilities
*   **Implicit Wait:** Global timeout. Avoid in modern frameworks due to unpredictable execution delays.
*   **Explicit Wait:** `WebDriverWait` + `ExpectedConditions`. Pauses execution until a *specific condition* is met for a specific element. Safe and precise.
*   **Utility Classes:** Centralized wait logic into a `WaitUtils` class. Used a private constructor to prevent instantiation, forcing users to call the `static` methods directly, saving memory and adhering to enterprise design standards.

## Day 4: Page Object Model (POM) & Architecture
*   **POM Concept:** Separated the Page Layer (locators/methods) from the Test Layer (assertions/execution). If a UI element changes, we fix it in exactly one place.
*   **Architecture:** Created dedicated `pages` and `tests` packages.
*   **OOP Encapsulation in POM:** Locators are declared as `private By`. Test scripts cannot access them directly. They must use `public void` methods (like `enterUsername()`), ensuring synchronization and safety.
*   **Test Tracking:** Updated CSV test cases with actual execution results and Pass/Fail statuses.

## Day 5: TestNG Framework Base & Assertions
*   **TestNG:** Replaced Java `main()` method with `@Test` annotations. TestNG allows multiple independent test runs and tracks Pass/Fail metrics.
*   **Annotations:** Used `@BeforeMethod` (setup) and `@AfterMethod` (teardown) to guarantee a clean browser state (fresh login) for every single test.
*   **Assertions:** Used `Assert.assertTrue()` and `Assert.assertFalse()`. Unlike `System.out.println`, assertions physically pass or fail the test in the reporting pipeline. TestNG error messages are only printed if the assertion fails.