# 🧬 Method Overriding vs Constructor Overriding (Java vs Go)

---

## ✅ Method Overriding

| Feature          | Java                          | Go                                |
|------------------|-------------------------------|------------------------------------|
| How it works     | Subclass overrides parent method | Struct defines same method         |
| Purpose          | Polymorphic behavior           | Interface satisfaction or shadowing |
| Supported?       | ✅                             | ✅ (via method receivers)           |

---

## ❌ Constructor Overriding

| Feature                   | Java                          | Go                          |
|---------------------------|-------------------------------|------------------------------|
| Inheritance of constructor | ❌ Not inherited              | ❌ Not a concept              |
| Can override?             | ❌ Nope, define your own       | ❌ Use custom init functions  |
| Purpose                   | Object setup only             | Struct initialization        |

---

## 🔍 Key Insight

- **Overriding methods** is core to polymorphism.
- **Constructors** are not polymorphic, they’re just for setting up objects.
- Go’s minimalist design avoids constructors and uses plain functions like `NewThing(...)`.

📂 See:
- [`MethodVsConstructor.java`](./MethodVsConstructor.java)
- [`explanation.md`](./explanation.md)
