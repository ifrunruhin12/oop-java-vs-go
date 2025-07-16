# 🧊 Abstraction in Java vs Go

Abstraction hides unnecessary details and exposes only what’s relevant. Think of it as defining **what** something should do, but not **how**.

---

## 🧠 Concept Comparison

| Feature                 | Java                             | Go                                |
|-------------------------|----------------------------------|------------------------------------|
| Abstract type           | `abstract class` or `interface`  | `interface`                       |
| Implementation required | Yes, via subclass                | Yes, via struct method receivers  |
| Partial implementation  | ✅ (abstract + concrete methods) | ❌ (Go interfaces can't have impl) |
| Multiple inheritance?   | ✅ via interfaces                 | ✅ via interfaces                  |

---

## 🔍 Key Insight

- Java uses `abstract` classes for shared logic + required methods.
- Go uses **interfaces** only pure abstraction.
- Go prefers **composition over inheritance**, so interfaces are more central.

📂 See:
- [`AbstractionExample.java`](./AbstractionExample.java)
- [`abstraction.go`](./abstraction.go)
