
# 🔐 Private vs Protected (Java vs Go)

---

## 🧠 What's the Difference?

| Modifier     | Access Level                                    | Example                         |
|--------------|--------------------------------------------------|----------------------------------|
| `private`    | Only inside the class                            | A secret method, a pin code     |
| `protected`  | Class + subclasses (even in different packages) | Useful for inheritance chaining |

---

```lua
          +------------------------------+
          |         Public (everyone)    |
          |                              |
          |  +------------------------+  |
          |  |  Protected (family)    |  |
          |  |  - Subclasses          |  |
          |  |  - Same package        |  |
          |  |                        |  |
          |  |  +------------------+  |  |
          |  |  |  Private (self)  |  |  |
          |  |  +------------------+  |  |
          |  +------------------------+  |
          +------------------------------+
```

## 🐹 In Go?

Go doesn't have `protected`. It keeps things simple:

| Starts With | Visibility         |
|-------------|--------------------|
| Uppercase   | Exported (public)  |
| Lowercase   | Unexported (private to package) |

---

## 🧠 Key Insight

- In Java, `protected` lets child classes reuse & extend behavior without making it fully public.
- In Go, this is replaced by **composition** and **interface abstraction**, not inheritance.

📂 See:
- [`PrivateProtected.java`](./PrivateProtected.java)
- [`explanation.md`](./explanation.md)
