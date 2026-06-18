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

## Day 3: Synchronization (Waits)
*   **Implicit Wait:** Global timeout. Avoid in modern frameworks due to unpredictable execution delays.
*   **Explicit Wait:** `WebDriverWait` combined with `ExpectedConditions`. Pauses execution until a *specific condition* (like `visibilityOfElementLocated` or `elementToBeClickable`) is met for a specific element. Safe and precise.