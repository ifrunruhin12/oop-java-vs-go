package main

import "fmt"

// Base "class"
type Character struct {
	Name   string
	Health int
}

func (c Character) Attack() {
	fmt.Println(c.Name + " performs a basic attack.")
}

// Warrior struct embeds Character
type Warrior struct {
	Character
}

func (w Warrior) Attack() {
	fmt.Println(w.Name + " swings a sword with brute force!")
}

// Mage struct embeds Character
type Mage struct {
	Character
}

func (m Mage) Attack() {
	fmt.Println(m.Name + " casts a fireball!")
}

func main() {
	aragorn := Warrior{Character: Character{Name: "Aragorn", Health: 150}}
	gandalf := Mage{Character: Character{Name: "Gandalf", Health: 100}}

	aragorn.Attack() // Aragorn swings a sword...
	gandalf.Attack() // Gandalf casts a fireball...
}
