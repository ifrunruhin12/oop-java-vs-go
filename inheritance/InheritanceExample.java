// Base class
class Character {
    String name;
    int health;

    Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    void attack() {
        System.out.println(name + " performs a basic attack.");
    }
}

// Subclass: Warrior
class Warrior extends Character {
    Warrior(String name) {
        super(name, 150);
    }

    @Override
    void attack() {
        System.out.println(name + " swings a sword with brute force!");
    }
}

// Subclass: Mage
class Mage extends Character {
    Mage(String name) {
        super(name, 100);
    }

    @Override
    void attack() {
        System.out.println(name + " casts a fireball!");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Character aragorn = new Warrior("Aragorn");
        Character gandalf = new Mage("Gandalf");

        aragorn.attack(); // Aragorn swings a sword...
        gandalf.attack(); // Gandalf casts a fireball...
    }
}
