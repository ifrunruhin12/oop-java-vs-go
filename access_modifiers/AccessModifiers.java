class Character {
    public String name = "Default";
    private int health = 100;
    protected int stamina = 50;

    public int getHealth() {
        return health;
    }

    private void secretTechnique() {
        System.out.println("Hidden technique unleashed!");
    }

    protected void rest() {
        System.out.println(name + " regains stamina.");
    }
}

class Warrior extends Character {
    void printStats() {
        System.out.println(name);         // ✅ public
        // System.out.println(health);    // ❌ private
        System.out.println(stamina);      // ✅ protected
        rest();                            // ✅ protected method
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Warrior w = new Warrior();
        w.printStats();
        System.out.println("Health: " + w.getHealth());
        // w.secretTechnique(); // ❌ private method not accessible
    }
}
