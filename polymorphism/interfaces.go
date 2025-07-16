package main

import "fmt"

// Define interface
type Attacker interface {
	Attack()
}

// Base type
type Character struct {
	Name string
}

func (c Character) Attack() {
	fmt.Println(c.Name + " performs a basic attack.")
}

type Warrior struct {
	Character
}

func (w Warrior) Attack() {
	fmt.Println(w.Name + " swings a massive sword!")
}

type Mage struct {
	Character
}

func (m Mage) Attack() {
	fmt.Println(m.Name + " casts a fireball!")
}

func main() {
	party := []Attacker{
		Warrior{Character: Character{Name: "Aragorn"}},
		Mage{Character: Character{Name: "Gandalf"}},
		Character{Name: "Generic NPC"},
	}

	for _, member := range party {
		member.Attack() // Different types, same interface
	}
}
