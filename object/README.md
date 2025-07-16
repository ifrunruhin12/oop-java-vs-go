# 🧱 Object in Java vs Go

Objects are the core building blocks of OOP, bundling **data** and **behavior** together.

## 🧠 Concept Comparison

| Feature           | Java                         | Go                             |
|-------------------|------------------------------|--------------------------------|
| Class             | `class Person`               | `type Person struct`           |
| Object creation   | `new Person()`               | `Person{Name: ..., Age: ...}` |
| Method binding    | Inside class                 | Method with receiver           |
| OOP model         | Class-based                  | Struct + method                |

## 🔍 Key Insight

Both Java and Go allow you to create "objects" that encapsulate data and behavior, but Go does it through structs and methods without using the `class` keyword.

📂 See:
- [`ObjectExample.java`](./ObjectExample.java)
- [`object.go`](./object.go)
