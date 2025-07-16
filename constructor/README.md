# Chess Game: Constructor Examples

## Overview
This repository contains examples demonstrating **constructors** in object-oriented programming (OOP) within a chess game context. Constructors are special methods used to initialize objects with specific states.

### Constructors
- **Definition**: Constructors are methods called when an object is created, often used to set initial values. They can be default (no arguments) or parameterized.
- **Java Example**: In `Constructor.java`, the `Piece` class has a default constructor and a parameterized constructor, while `Knight` uses `super` to call the parent constructor.
- **Go Note**: Go lacks traditional constructors; instead, factory functions like `NewPiece` and `NewKnight` are used to initialize structs.

### Files
- [`Constructor.java`](./Constructor.java): Java code demonstrating constructors with inheritance.
- [`constructor.go`](constructor.go): Go code using factory functions to simulate constructors.
- `README.md`: This file.

### Polymorphism Connection
- Constructors themselves don’t directly implement polymorphism, but they support it by enabling flexible object initialization. In Java, the `super` call in `Knight`’s constructor ties into runtime polymorphism when objects are used polymorphically (e.g., `Piece` reference to `Knight` object).