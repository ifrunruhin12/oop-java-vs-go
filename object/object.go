package main

import "fmt"

// This is a struct — Go's version of a class
type Person struct {
	Name string
	Age  int
}

// Method attached to the struct
func (p Person) SayHello() {
	fmt.Printf("Hi, my name is %s and I am %d years old.\n", p.Name, p.Age)
}

func main() {
	// Creating an "object" (instance of Person)
	p1 := Person{Name: "Ruhin", Age: 21}
	p1.SayHello()
}

