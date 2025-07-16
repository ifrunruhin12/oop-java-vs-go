package main

import "fmt"

// Struct representing a base piece
type Piece struct {
    Name string
}

// Factory function as a constructor
func NewPiece(name string) *Piece {
    return &Piece{Name: name}
}

// Struct representing a knight
type Knight struct {
    Piece
    Moves int
}

// Factory function as a constructor for Knight
func NewKnight(name string, moves int) *Knight {
    return &Knight{Piece: Piece{Name: name}, Moves: moves}
}

func (p *Piece) Display() string {
    return "Piece: " + p.Name
}

func (k *Knight) Display() string {
    return "Knight: " + k.Name + ", Moves: " + fmt.Sprint(k.Moves)
}

func main() {
    genericPiece := NewPiece("Generic Piece")
    fmt.Println(genericPiece.Display()) // Outputs: Piece: Generic Piece

    knight := NewKnight("White Knight", 2)
    fmt.Println(knight.Display()) // Outputs: Knight: White Knight, Moves: 2
}