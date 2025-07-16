package main

import "fmt"

type Character struct{}

func (c Character) Move() {
	fmt.Println("Character moves.")
}

type Bow struct{}

func (b Bow) Shoot() {
	fmt.Println("Bow shoots an arrow!")
}

type Archer struct {
	Character // embedded (inherits methods)
	Bow       // also embedded
}

func main() {
	archer := Archer{}
	archer.Move()  // from Character
	archer.Shoot() // from Bow
}
