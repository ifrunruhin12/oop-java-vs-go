// Inheritance style
class Character {
    void move() {
        System.out.println("Character moves.");
    }
}

class Archer extends Character {
    void shoot() {
        System.out.println("Archer shoots an arrow!");
    }
}

// Composition style
class Bow {
    void shoot() {
        System.out.println("Bow shoots an arrow!");
    }
}

class ComposedArcher {
    Character character = new Character(); // Has-a Character
    Bow bow = new Bow();                   // Has-a Bow

    void move() {
        character.move();
    }

    void shoot() {
        bow.shoot();
    }
}

public class CompositionVsInheritance {
    public static void main(String[] args) {
        System.out.println("== Inheritance ==");
        Archer archer = new Archer();
        archer.move();
        archer.shoot();

        System.out.println("\n== Composition ==");
        ComposedArcher compArcher = new ComposedArcher();
        compArcher.move();
        compArcher.shoot();
    }
}
