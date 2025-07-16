# 🎭 Polymorphism in Java vs Go

Polymorphism means **many forms** — the ability for different types or method signatures to respond differently to the same operation.

There are two main types:

| Type                | Description                                        | Java Support | Go Support |
|---------------------|----------------------------------------------------|--------------|------------|
| Method Overriding   | Subclass overrides a method of superclass         | ✅           | ✅ (via struct + method) |
| Method Overloading  | Same method name, different parameters            | ✅           | ❌ (Go doesn’t support overloading) |

---

## 🧬 Method Overriding (Runtime Polymorphism)

This allows subclasses or types to provide their own implementation of a method defined in the parent class or interface.

📂 See:
- [`PolymorphismExample.java`](./PolymorphismExample.java)
- [`interfaces.go`](./interfaces.go)

---

## 🌀 Method Overloading (Compile-Time Polymorphism)

This allows multiple methods with the **same name** but different parameters.

📂 Only in Java:
- [`PolymorphismExample.java`](./PolymorphismExample.java)

---

## 🔍 Key Insight

- **Java** supports both overriding and overloading, giving you flexibility at both compile-time and runtime.
- **Go** keeps things minimal and only supports overriding behavior through **interfaces** and **method values** — no overloading allowed.

> 🚫 Go keeps it simple: one function name, one signature. If you need variations, use optional parameters via structs or variadic functions.
