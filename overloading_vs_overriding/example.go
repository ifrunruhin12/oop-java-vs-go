package main

import "fmt"

// Interface defining the behavior
type Piece interface {
    Move() string
}

// Base struct
type BasePiece struct{}

func (b BasePiece) Move() string {
    return "Piece moves generically"
}

// Knight struct implementing the interface (overriding)
type Knight struct {
    BasePiece
}

func (k Knight) Move() string {
    return "Knight moves in an L-shape"
}

func main() {
    var p Piece = Knight{}
    println(p.Move()) // Outputs: Knight moves in an L-shape (overriding)

    // No overloading example in Go; methods must have unique names
}