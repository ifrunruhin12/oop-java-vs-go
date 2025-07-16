
# 🧠 Abstract Class vs Interface (Java vs Go)

This is one of the biggest design distinctions in OOP languages.

---

## 🧬 Core Difference

| Feature                       | Abstract Class (Java)       | Interface (Java)              | Go                         |
|-------------------------------|-----------------------------|-------------------------------|----------------------------|
| Implementation allowed?       | ✅ Yes (partial)            | ❌ (Until Java 8 default methods) | ❌                        |
| Fields allowed?               | ✅ Yes                      | ❌ (only constants)            | ❌ (interfaces only have method signatures) |
| Multiple inheritance support  | ❌                         | ✅                            | ✅                         |
| Constructors?                 | ✅ Yes                      | ❌                            | ❌                         |

---

## 🧠 In Go:

- No `abstract` keyword
- No abstract classes
- You compose behavior using **interfaces** + **embedding**
- You separate **what a type does** (interface) from **how it does it** (struct methods)

---

## 🔍 Key Insight

- **Java**: Use abstract classes when you want to share base logic + enforce method contracts.
- **Go**: Go all-in on interfaces + composition — flexible, minimal, and powerful.

📂 See:
- [`AbstractVsInterface.java`](./AbstractVsInterface.java)
- [`explanation.md`](./explanation.md)
