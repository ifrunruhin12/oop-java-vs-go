# 🧬 Multiple vs Multilevel Inheritance (Java vs Go)

---

## 🧱 Multilevel Inheritance

> "A → B → C" chain

| Java                          | Go                                |
|------------------------------|------------------------------------|
| Supported via classes        | Simulated via struct embedding     |
| Useful for building hierarchies | ✅ Yes, but deep trees are discouraged |

---

## ⚠️ Multiple Inheritance

> "C inherits from A and B"

| Java                          | Go                                |
|------------------------------|------------------------------------|
| ❌ Not allowed for classes   | ❌ No inheritance at all           |
| ✅ Supported via interfaces | ✅ Supported via interfaces         |

---

## 🧠 Key Insight

- Java supports **multilevel**, not **multiple inheritance** (unless via interfaces).
- Go avoids both, focusing on **composition** and **interfaces** for cleaner, simpler code reuse.

📂 See:
- [`MultipleVsMultilevel.java`](./MultipleVsMultilevel.java)
- [`explanation.md`](./explanation.md)
