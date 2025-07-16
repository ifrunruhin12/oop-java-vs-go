// Base class
class Character {
    String name;

    Character(String name) {
        this.name = name;
    }

    void attack() {
        System.out.println(name + " performs a basic attack.");
    }
}

// Subclasses
class Warrior extends Character {
    Warrior(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " swings a massive sword!");
    }
}

class Mage extends Character {
    Mage(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " casts a fireball!");
    }
}

//Overloading
class SpellCaster {
    void castSpell() {
        System.out.println("Casting a generic spell...");
    }

    void castSpell(String spellName) {
        System.out.println("Casting " + spellName + "!");
    }

    void castSpell(String spellName, int power) {
        System.out.println("Casting " + spellName + " with power level " + power + "!");
    }
}


public class PolymorphismExample {
    public static void main(String[] args) {
        Character[] party = {
            new Warrior("Aragorn"),
            new Mage("Gandalf"),
            new Character("Generic NPC")
        };

        for (Character c : party) {
            c.attack(); // Each one responds differently
        }
        SpellCaster caster = new SpellCaster();
        caster.castSpell();
        caster.castSpell("Fireball");
        caster.castSpell("Ice Storm", 5);
    }
}
