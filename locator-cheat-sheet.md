# UI Automation Locator Strategy Cheat Sheet (Ultimate Edition)

## 1. Hierarchy of Locators (Best to Worst)
1. `id` (Fastest, unique)
2. `name`
3. `cssSelector` (Fast, native browser engine)
4. `xpath` (Slowest, but handles complex DOM traversal)
5. `className` / `tagName` / `linkText` / `partialLinkText` (Situational)

## 2. XPath Syntax & Operators
* **Exact Attribute:** `//tagname[@attribute='value']`
* **Contains Attribute:** `//tagname[contains(@attribute, 'partial_value')]`
* **Starts-With Attribute:** `//tagname[starts-with(@attribute, 'start_value')]`
* **Exact Text:** `//tagname[text()='Exact Visible Text']`
* **Contains Text:** `//tagname[contains(text(), 'Partial Text')]`
* **Multiple Conditions (AND):** `//tagname[@type='submit' and @name='login']`
* **Multiple Conditions (OR):** `//tagname[@type='submit' or @class='btn']`
* **Indexing (When multiple elements match):** `(//tagname[@class='input'])[1]` *(Note: XPath index starts at 1, not 0)*

## 3. XPath Traversing (Axes)
*Syntax rule: Start at a known element, then traverse.*
* **Parent:** `//stable_anchor_element/parent::tagname` (Moves UP exactly 1 level to the direct container)
* **Ancestor:** `//stable_anchor_element/ancestor::tagname` (Moves UP multiple levels, e.g., to the master `<form>`)
* **Following Sibling:** `//stable_anchor_element/following-sibling::tagname` (Moves FORWARD to an element sharing the same parent)
* **Preceding Sibling:** `//stable_anchor_element/preceding-sibling::tagname` (Moves BACKWARD to an element sharing the same parent)

## 4. CSS Selector Syntax & Operators
* **ID:** `tagname#idValue`
* **Class (Single):** `tagname.classValue`
* **Class (Multiple):** `tagname.class1.class2.class3` *(Replace all spaces in the HTML class attribute with dots)*
* **Attribute (Exact):** `tagname[attribute='value']`
* **Attribute (Contains):** `tagname[attribute*='value']`
* **Attribute (Starts-With):** `tagname[attribute^='value']`
* **Attribute (Ends-With):** `tagname[attribute$='value']`

## 5. CSS Selector Traversing (Downwards Only)
* **Direct Child:** `parentTag > childTag` (Moves down exactly 1 level)
* **Sub-element (Descendant):** `parentTag descendantTag` *(Uses a space. Moves down multiple levels)*
* **Indexing (nth-child):** `tagname:nth-child(2)` *(Selects the 2nd child of its parent)*