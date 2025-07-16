class Player {
    private String name;
    private int health;

    public Player(String name) {
        this.name = name;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        if (damage < 0) return;
        health -= damage;
        if (health < 0) health = 0;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Player player = new Player("Ezio");

        System.out.println(player.getName() + " has " + player.getHealth() + " health.");
        player.takeDamage(30);
        System.out.println("After damage: " + player.getHealth() + " health.");
        // player.health = -100; // ❌ can't do this, it's private
    }
}
