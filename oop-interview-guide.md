# QA Automation: OOP Interview Guide

## 1. Encapsulation (Data Hiding)
**Definition:** Restricting direct access to variables and using public getters/setters or methods to interact with them safely.
*   **Application 1 (Page Object Model):** We declare WebElements as `private` in our Page classes so test scripts cannot manipulate them directly or incorrectly. We expose them only through `public` methods (e.g., `enterUsername()`).
*   **Application 2 (Utility Classes):** Classes like `ExpectedConditions` encapsulate complex polling loop mechanisms inside `static` methods. We just call `visibilityOf()`, abstracting the loop logic.

## 2. Inheritance (Reusability)
**Definition:** A child class inherits attributes and methods from a parent class.
*   **Application 1 (Base Tests & Pages):** We create a `BaseTest` or `BasePage` class containing common WebDriver initialization, teardown, and configuration code. Specific test classes (like `LoginTest`) `extend` this base class, eliminating code duplication.

## 3. Polymorphism (Flexibility)
**Definition:** The ability of a method to do different things based on the object acting upon it, or the parameters passed (Overloading vs Overriding).
*   **Application 1 (Compile-Time / Overloading):** We use Method Overloading in Utility classes. For example, a `WaitHelper` class might have `click(WebElement)` and `click(WebElement, int timeout)`. The compiler knows which one to run based on the parameters provided.

## 4. Abstraction (Implementation Hiding)
**Definition:** Hiding the complex internal working mechanisms and showing only the essential features to the user (using Interfaces or Abstract classes).
*   **Application 1 (WebDriver):** `WebDriver driver = new ChromeDriver();` WebDriver is an interface. We call `driver.get()`, completely hiding the complex HTTP requests Selenium makes to the browser driver under the hood.
*   **Application 2 (Locators):** `By` is an abstract class. When we use `By.id()`, we define *what* we want, while the underlying Javascript DOM query is completely hidden from us.