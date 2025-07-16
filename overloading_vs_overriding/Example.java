// Parent class
class Piece {
    void move() {
        System.out.println("Piece moves generically");
    }
}

// Child class overriding the move method
class Knight extends Piece {
    @Override
    void move() {
        System.out.println("Knight moves in an L-shape");
    }

    // Method overloading
    void move(int squares) {
        System.out.println("Knight moves " + squares + " squares in an L-shape");
    }
}

public class ChessGame {
    public static void main(String[] args) {
        Piece myPiece = new Knight(); // Runtime polymorphism
        myPiece.move(); // Outputs: Knight moves in an L-shape (overriding)

        Knight myKnight = new Knight();
        myKnight.move(2); // Outputs: Knight moves 2 squares in an L-shape (overloading)
    }
}