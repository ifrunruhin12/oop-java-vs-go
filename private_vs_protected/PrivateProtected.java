class Character {
    private int secretCode = 1234;  // Only this class can access
    protected int stamina = 100;    // Subclasses can access

    protected void recoverStamina() {
        System.out.println("Recovering stamina...");
    }

    private void hiddenTechnique() {
        System.out.println("Secret move: Shadow Clone!");
    }

    public void revealSecrets() {
        System.out.println("Secret Code: " + secretCode);
        hiddenTechnique();  // OK: inside the class
    }
}

class Warrior extends Character {
    public void useStamina() {
        System.out.println("Using stamina: " + stamina); // ✅ allowed (protected)
        recoverStamina();                                // ✅ allowed (protected)
        // System.out.println(secretCode);              // ❌ not allowed (private)
        // hiddenTechnique();                           // ❌ not allowed (private)
    }
}

public class PrivateProtected {
    public static void main(String[] args) {
        Warrior w = new Warrior();
        w.useStamina();
        w.revealSecrets(); // ✅ allowed (public method inside Character)
    }
}
