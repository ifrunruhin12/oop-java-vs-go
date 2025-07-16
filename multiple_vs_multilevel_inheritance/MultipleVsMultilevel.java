// MULTILEVEL INHERITANCE
class Character {
    void greet() {
        System.out.println("I am a character.");
    }
}

class Warrior extends Character {
    void fight() {
        System.out.println("Warrior slashes!");
    }
}

class Paladin extends Warrior {
    void heal() {
        System.out.println("Paladin casts healing light.");
    }
}

// MULTIPLE INHERITANCE (via interfaces)
interface Healer {
    void heal();
}

interface Mage {
    void castSpell();
}

class BattleMage implements Healer, Mage {
    public void heal() {
        System.out.println("Healing with holy magic.");
    }

    public void castSpell() {
        System.out.println("Casting arcane missile!");
    }
}

public class MultipleVsMultilevel {
    public static void main(String[] args) {
        Paladin p = new Paladin();
        p.greet();
        p.fight();
        p.heal();

        BattleMage bm = new BattleMage();
        bm.heal();
        bm.castSpell();
    }
}
