# QA Automation: OOP Interview Guide

## 1. Encapsulation (Data Hiding)
**Definition:** Restricting direct access to variables and using public getters/setters or methods to interact with them safely.
*   **Application 1 (Page Object Model):** We heavily utilize Encapsulation in our Page classes. We declare WebElements as `private` (e.g., `private By usernameInput`). Test scripts cannot manipulate them directly, bypassing synchronization. We expose them only through `public` methods (e.g., `enterUsername()`), which safely implement `WaitUtils`. This strictly separates page behavior from test script implementation.
*   **Application 2 (Utility Classes):** Classes like `ExpectedConditions` encapsulate complex polling loop mechanisms inside `static` methods. We just call `visibilityOf()`, abstracting the loop logic.

## 2. Inheritance (Reusability)
**Definition:** A child class inherits attributes and methods from a parent class.
*   **Application 1 (BaseTest Architecture):** We heavily utilize Inheritance in our test execution layer. We created a parent class `BaseTest` that handles WebDriver initialization via `@BeforeMethod` and teardown via `@AfterMethod`. Every specific test class (like `LoginTest`) uses `extends BaseTest`. This completely eliminates WebDriver setup duplication and ensures every test inherits a standardized execution state.

## 3. Polymorphism (Flexibility)
**Definition:** The ability of a method to do different things based on the object acting upon it, or the parameters passed (Overloading vs Overriding).
*   **Application 1 (Compile-Time / Overloading):** We use Method Overloading in Utility classes. For example, a `WaitHelper` class might have `click(WebElement)` and `click(WebElement, int timeout)`. The compiler knows which one to run based on the parameters provided.

## 4. Abstraction (Implementation Hiding)
**Definition:** Hiding the complex internal working mechanisms and showing only the essential features to the user (using Interfaces or Abstract classes).
*   **Application 1 (WebDriver):** `WebDriver driver = new ChromeDriver();` WebDriver is an interface. We call `driver.get()`, completely hiding the complex HTTP requests Selenium makes to the browser driver under the hood.
*   **Application 2 (Locators):** `By` is an abstract class. When we use `By.id()`, we define *what* we want, while the underlying Javascript DOM query is completely hidden from us.