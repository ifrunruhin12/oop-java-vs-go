package main

import "fmt"

type Character struct {
	Name   string // exported
	health int    // unexported (private to package)
	Stamina int   // exported
}

func NewCharacter(name string) Character {
	return Character{
		Name:    name,
		health:  100,
		Stamina: 50,
	}
}

// Exported method
func (c Character) GetHealth() int {
	return c.health
}

// Unexported method
func (c Character) secretTechnique() {
	fmt.Println("Hidden technique unleashed!")
}

func main() {
	c := NewCharacter("Guts")
	fmt.Println("Name:", c.Name)        // ✅ exported
	fmt.Println("Health:", c.GetHealth()) // ✅ via getter
	// fmt.Println(c.health)           // ❌ can't access directly
}
