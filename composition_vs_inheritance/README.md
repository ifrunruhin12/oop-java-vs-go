# 🧬 Composition vs Inheritance (Java vs Go)

---

## 📜 Inheritance

Java lets you inherit fields and methods from a parent class.

```java
class Archer extends Character {
    void shoot() {}
}
```

- ✅ Easy code reuse  
- ❌ Can get messy with deep hierarchies  
- ❌ Not very flexible (tight coupling)  

---

## 🧩 Composition

Both Java and Go support **composition**, but Go makes it **the default way**.

```go
type Archer struct {
    Character
    Bow
}
```

- ✅ Super flexible  
- ✅ Promotes modular design  
- ✅ Avoids the “diamond problem”  
- ✅ You can replace parts like LEGO blocks  

---

## 🧠 Key Insight

| Feature              | Java                        | Go                            |
|----------------------|-----------------------------|-------------------------------|
| Inheritance          | ✅ Yes                       | ❌ No class-based inheritance |
| Composition          | ✅ Yes (via fields)          | ✅ Primary design pattern     |
| Embedded types       | ❌ (Java has no embedding)   | ✅ Struct embedding           |

> In Go, composition *feels like inheritance* but keeps things loose and maintainable.

📂 See:  
- [`CompositionVsInheritance.java`](./CompositionVsInheritance.java)  
- [`composition_example.go`](./composition_example.go)
