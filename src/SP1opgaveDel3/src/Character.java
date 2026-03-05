public class Character {
    String name;
    int healthPoints;
    int maxHealth;
    int level;
    int experiencePoints;
    double gold;
    boolean isAlive;
    String classSpecialization;

    // konstrutør
    public Character(String name, String classSpecialization) {
        this.name = name;
        this.classSpecialization = classSpecialization;
        this.level = 1;
        this.healthPoints = 100;
        this.maxHealth = 100;
        this.experiencePoints = 0;
        this.gold = 0;
        this.isAlive = true;
    }

    void printCharacterSheet() {
        //kortet ned mine grafik for det ikke clutter så meget for hver combat roll, skal nok finde et bedre layout
        System.out.println("=== " + name + " (" + classSpecialization + ") ===");
        System.out.println("Level: " + level + " | Health: " + healthPoints + "/" + maxHealth + " | Gold: " + gold);
    }

    void damageTurn(int amount) {
        healthPoints -= amount;
        if (healthPoints <= 0) {
            healthPoints = 0;
            isAlive = false;
            System.out.println(name + " died.");
        }
        System.out.println(name + " takes " + amount + " damage!");
    }

    void attack(Character target) {
        int damage = 15;
        target.damageTurn(damage);
    }
}