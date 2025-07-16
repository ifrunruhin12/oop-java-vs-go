# 🚫 No Abstract Classes in Go

Go doesn't support **abstract classes** instead, it uses **interfaces** + **composition**.

- Interfaces define behavior contracts
- Structs implement behavior via method receivers
- Shared logic is handled via composition or embedding

🔍 Example:

```go
type Healer interface {
    Heal()
}

type Paladin struct {
    Name string
}

func (p Paladin) Heal() {
    fmt.Println(p.Name + " casts a healing spell.")
}
```
If you want to share common methods, you embed another struct and reuse its methods.

```go
type Character struct {
    Name string
}

func (c Character) Rest() {
    fmt.Println(c.Name + " is resting.")
}

type Paladin struct {
    Character
}

func (p Paladin) Heal() {
    fmt.Println(p.Name + " casts a healing spell.")
}
```