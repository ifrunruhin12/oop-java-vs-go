# ⚡ Static in Java vs Go

---

## 🧠 What Is `static`?

`static` means:
> "This variable or method belongs to the **class**, not an object."

So:
- You don’t need to create an object to use it
- It’s shared across all instances
- Great for utility functions, constants, global counters, etc.

---

## 🔥 Java

| Use                          | Syntax                        |
|------------------------------|-------------------------------|
| Static method                | `public static void foo()`    |
| Static variable              | `public static int count`     |
| Accessing without object     | `ClassName.method()`          |

---

## 🐹 Go Equivalent

| Java Concept         | Go Equivalent                |
|----------------------|------------------------------|
| `static int count`   | `var Count int` at top level |
| `static void foo()`  | `func Foo()` at top level    |
| No object required   | Just import the package      |

---

## 🧠 Key Insight

- Java needs `static` because it’s class-centric.
- Go is **package-centric** — everything defined at the package level behaves like `static`.

📂 See:
- [`StaticExample.java`](./StaticExample.java)
- [`explanation.md`](./explanation.md)
