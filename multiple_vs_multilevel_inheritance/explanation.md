# 🚫 No Inheritance in Go — Use Composition

Go doesn't support **class inheritance** at all, not even multilevel or multiple.

Instead, Go promotes:
- **Composition** (struct embedding)
- **Interfaces** (behavior sharing)

### Example: Composing a Paladin

```go
type Character struct{}
func (Character) Greet() { fmt.Println("I am a character.") }

type Warrior struct {
    Character
}
func (Warrior) Fight() { fmt.Println("Warrior slashes!") }

type Paladin struct {
    Warrior
}
func (Paladin) Heal() { fmt.Println("Paladin casts healing light.") }
```

Multiple Behavior? Use interfaces:
```go
type Healer interface {
    Heal()
}
type Mage interface {
    CastSpell()
}

type BattleMage struct{}
func (BattleMage) Heal(){
    fmt.Println("Healing with holy magic.")
}
func (BattleMage) CastSpell() {
    fmt.Println("Casting arcane missile!")
}
```
✅ Simple. Explicit. No diamond problem.