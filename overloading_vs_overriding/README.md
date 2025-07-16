# Chess Game: Overloading vs Overriding Examples

## Overview
This repository contains examples demonstrating **method overloading** and **method overriding** in the context of a chess game, showcasing polymorphism in object-oriented programming (OOP).

### Overloading
- **Definition**: Overloading allows multiple methods with the same name but different parameters within the same class, useful for flexible move definitions.
- **Polymorphism Type**: Compile-time (static) polymorphism.
- **Java Example**: In `ChessGame.java`, the `Knight` class has an overloaded `move` method with different parameter lists (e.g., with or without squares).
- **Go Note**: Go does not support method overloading; method names must be unique.

### Overriding
- **Definition**: Overriding occurs when a subclass provides a specific implementation of a method defined in its parent class or interface, reflecting unique piece movements.
- **Polymorphism Type**: Runtime (dynamic) polymorphism.
- **Java Example**: In `Example.java`, the `Knight` class overrides the `move` method from the `Piece` class.
- **Go Example**: In `example.go`, the `Knight` struct overrides the `Move` method from `BasePiece` via the `Piece` interface.

### Files
- [`Example.java`](./Example.java): Java code demonstrating overloading and overriding.
- [`example.go`](example.go): Go code demonstrating overriding (no overloading support).
- `README.md`: This file.

### Polymorphism Connection
- **Overloading** enables compile-time polymorphism, allowing the compiler to select the appropriate `move` method based on arguments (e.g., move with squares in Java).
- **Overriding** supports runtime polymorphism, where the specific piece's move behavior (e.g., Knight's L-shape) is determined at runtime based on the object type.