// Abstract class = can have some implementation
abstract class Character {
    String name;

    Character(String name) {
        this.name = name;
    }

    abstract void attack(); // must be implemented

    void rest() {
        System.out.println(name + " is resting.");
    }
}

// Interface = 100% abstract behavior (before Java 8)
interface Healer {
    void heal();
}

// Concrete class using both
class Paladin extends Character implements Healer {
    Paladin(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " smites the enemy with holy power!");
    }

    @Override
    public void heal() {
        System.out.println(name + " casts a healing spell.");
    }
}

public class AbstractVsInterface {
    public static void main(String[] args) {
        Paladin p = new Paladin("Tirion");
        p.attack();
        p.heal();
        p.rest();
    }
}
