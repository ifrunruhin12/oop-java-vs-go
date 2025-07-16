# 🧬 Inheritance in Java vs Composition in Go

Java uses **classical inheritance** (`extends`) to share behavior. Go favors **composition**, embedding one struct inside another to reuse functionality.

## 🧠 Concept Comparison

| Feature              | Java (`extends`)            | Go (composition)               |
|----------------------|-----------------------------|-------------------------------|
| Inheritance method   | `class Mage extends Character` | `type Mage struct { Character }` |
| Method override      | `@Override` annotation       | Redefine method on outer struct |
| Multiple inheritance | ❌ Not allowed               | ✅ Via multiple embeddings     |

## 🔍 Key Insight

Go avoids deep inheritance trees and tight coupling. Instead, it promotes flexible design with composition, a cleaner, more scalable alternative.

📂 See:
- [`InheritanceExample.java`](./InheritanceExample.java)
- [`composition.go`](./composition.go)
