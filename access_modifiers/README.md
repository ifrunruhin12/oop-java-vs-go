# 🔐 Access Modifiers in Java vs Go

Access modifiers control **who can see or touch your code**, think of them as visibility rules or VIP passes.

---

## 🧠 Java Access Modifiers

| Modifier    | Access Level                    |
|-------------|----------------------------------|
| `public`    | Everyone                        |
| `protected` | This class + subclasses         |
| `private`   | Only inside this class          |
| _(default)_ | Package-level access            |

---

## 🐹 Go’s Access Strategy (Simplified)

Go doesn't use `public`, `private`, `protected` keywords.
Instead, it uses **capitalization**:

| Starts With | Visibility      |
|-------------|------------------|
| Uppercase   | Exported (public) |
| Lowercase   | Unexported (private to package) |

---

### 🔍 Key Insight

- Java is strict and detailed with access levels (class-level, subclass, package, etc.).
- Go is minimalist, if it’s **Capitalized**, it’s public; if not, it’s private *to the package*.

> ✅ Want access control in Go? Just split into packages and export only what matters.

📂 See:
- [`AccessModifiers.java`](./AccessModifiers.java)
- [`access_modifiers.go`](./access_modifiers.go)
