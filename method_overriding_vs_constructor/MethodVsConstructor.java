class Character {
    String name;

    Character(String name) {
        this.name = name;
        System.out.println(name + " has entered the game.");
    }

    void attack() {
        System.out.println(name + " performs a basic attack.");
    }
}

class Warrior extends Character {
    Warrior(String name) {
        super(name); // You can’t override this, just call it
        System.out.println(name + " is ready for battle!");
    }

    @Override
    void attack() {
        System.out.println(name + " swings a sword with great strength!");
    }
}

public class MethodVsConstructor {
    public static void main(String[] args) {
        Character generic = new Character("NPC");
        Warrior aragorn = new Warrior("Aragorn");

        generic.attack();
        aragorn.attack();
    }
}
