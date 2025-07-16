class Utils {
    public static int calculateDamage(int power, int multiplier) {
        return power * multiplier;
    }

    public static String gameVersion = "v1.2.0";
}

class Player {
    String name;

    Player(String name) {
        this.name = name;
    }

    void showVersion() {
        System.out.println("Game Version: " + Utils.gameVersion); // Accessing static field
    }
}

public class StaticExample {
    public static void main(String[] args) {
        int damage = Utils.calculateDamage(10, 3);
        System.out.println("Calculated Damage: " + damage);

        Player p = new Player("Ezio");
        p.showVersion();
    }
}
