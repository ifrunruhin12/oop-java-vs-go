# 🛡️ Encapsulation in Java vs Go

Encapsulation is about **protecting the internal state** of an object and **exposing behavior safely** through controlled access methods.

---

## 🧠 Concept Comparison

| Feature                  | Java                                  | Go                                       |
|--------------------------|----------------------------------------|------------------------------------------|
| Private fields           | `private` keyword                      | lowercase field name (package-private)   |
| Getters/Setters          | Explicit `getX()` and `setX()` methods | Exported methods (capitalized)           |
| Enforcement              | Strict access modifiers                | Package-based visibility                 |

---

## 🔍 Key Insight

- In Java, access is controlled via **public/private/protected** modifiers.
- In Go, any identifier that **starts with a capital letter is exported** — everything else is package-private.
- Encapsulation is achieved in Go by keeping struct fields unexported and using exported methods for access.

📂 See:
- [`EncapsulationExample.java`](./EncapsulationExample.java)
- [`encapsulation.go`](./encapsulation.go)
