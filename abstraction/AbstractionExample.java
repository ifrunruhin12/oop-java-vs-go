// Abstract base class
abstract class Character {
    String name;

    Character(String name) {
        this.name = name;
    }

    // Abstract method (must be implemented)
    abstract void attack();

    // Concrete method (shared logic)
    void rest() {
        System.out.println(name + " is resting to recover health.");
    }
}

// Concrete subclasses
class Archer extends Character {
    Archer(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " fires an arrow!");
    }
}

class Healer extends Character {
    Healer(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " casts a healing light (support attack).");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Character legolas = new Archer("Legolas");
        Character mercy = new Healer("Mercy");

        legolas.attack();
        mercy.attack();

        legolas.rest();
        mercy.rest();
    }
}
