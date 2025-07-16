
# Composition vs Aggregation in Java and Go

This guide explains the difference between **Composition** and **Aggregation** in Object-Oriented Programming, using both **Java** and **Go** examples.

---

## 🧱 Composition (Strong Ownership)

**Definition:**  
Composition represents a strong "has-a" relationship. The contained object is created and destroyed with the container object.

---

### ☕ Java - Composition Example

```java
class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine = new Engine(); // Composition

    void drive() {
        engine.start();
        System.out.println("Car is driving");
    }
}
```

---

### 🐹 Go - Composition Example

```go
package main

import "fmt"

type Engine struct{}

func (e Engine) Start() {
    fmt.Println("Engine started")
}

type Car struct {
    Engine // Composition via embedding
}

func (c Car) Drive() {
    c.Start()
    fmt.Println("Car is driving")
}

func main() {
    car := Car{}
    car.Drive()
}
```

---

## 🌐 Aggregation (Weak Ownership)

**Definition:**  
Aggregation is a weaker "has-a" relationship. The container object only holds a reference to the contained object. If the container is destroyed, the contained object can still exist.

---

### ☕ Java - Aggregation Example

```java
import java.util.*;

class Player {
    String name;

    Player(String name) {
        this.name = name;
    }
}

class Team {
    private List<Player> players;

    Team(List<Player> players) {
        this.players = players; // Aggregation
    }

    void showPlayers() {
        for (Player p : players) {
            System.out.println(p.name);
        }
    }
}
```

---

### 🐹 Go - Aggregation Example

```go
package main

import "fmt"

type Player struct {
    Name string
}

type Team struct {
    Players []Player // Aggregation
}

func (t Team) ShowPlayers() {
    for _, p := range t.Players {
        fmt.Println(p.Name)
    }
}

func main() {
    p1 := Player{Name: "Ash"}
    p2 := Player{Name: "Misty"}
    team := Team{Players: []Player{p1, p2}}
    team.ShowPlayers()
}
```

---

## 🧠 Visual Overview

```
[ Composition ]                  [ Aggregation ]
Car                              Team
 └─ Engine (owned, created)       └─ Players (external, passed-in)
   └─ Dies with Car                  └─ Live independently
```

---

## 📊 Summary Table

| Feature            | Composition 🧱                         | Aggregation 🌐                           |
|--------------------|----------------------------------------|------------------------------------------|
| Ownership          | Strong (whole owns part)              | Weak (just a reference)                  |
| Lifecycle          | Tied (part dies with whole)           | Independent (part can live on)           |
| Example            | Car → Engine                          | Team → Players                           |
| Coupling           | Tightly coupled                       | Loosely coupled                          |
| Created Inside?    | Usually yes (with `new`)              | Usually no (passed in)                   |
| Java               | `new` inside class                    | Reference passed to class                |
| Go                 | Struct embedding                      | Struct with slice of other structs       |

---

Happy OOPing! 🚀
