// Parent class with constructor
class Piece {
    String name;

    // Default constructor
    Piece() {
        this.name = "Generic Piece";
    }

    // Parameterized constructor
    Piece(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Piece: " + name);
    }
}

// Child class with constructor and inheritance
class Knight extends Piece {
    int moves;

    // Constructor with super call
    Knight(String name, int moves) {
        super(name); // Calls parent constructor
        this.moves = moves;
    }

    void display() {
        System.out.println("Knight: " + name + ", Moves: " + moves);
    }
}

public class ChessGame {
    public static void main(String[] args) {
        Piece genericPiece = new Piece(); // Default constructor
        genericPiece.display(); // Outputs: Piece: Generic Piece

        Knight knight = new Knight("White Knight", 2); // Parameterized constructor
        knight.display(); // Outputs: Knight: White Knight, Moves: 2
    }
}