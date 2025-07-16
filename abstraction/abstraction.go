package main

import "fmt"

// Interface defines the behavior
type Character interface {
	Attack()
	Rest()
}

// Concrete type: Archer
type Archer struct {
	Name string
}

func (a Archer) Attack() {
	fmt.Println(a.Name + " fires an arrow!")
}

func (a Archer) Rest() {
	fmt.Println(a.Name + " is resting to recover health.")
}

// Concrete type: Healer
type Healer struct {
	Name string
}

func (h Healer) Attack() {
	fmt.Println(h.Name + " casts a healing light (support attack).")
}

func (h Healer) Rest() {
	fmt.Println(h.Name + " is resting to recover health.")
}

func main() {
	var c1 Character = Archer{Name: "Legolas"}
	var c2 Character = Healer{Name: "Mercy"}

	c1.Attack()
	c2.Attack()
	c1.Rest()
	c2.Rest()
}
