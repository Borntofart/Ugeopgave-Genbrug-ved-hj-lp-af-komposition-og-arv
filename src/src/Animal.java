// super klassen for alle dyr, hvert dyr har et navn og energi
public abstract class Animal {
    String name;    // dyrets navn
    int energy;     // energi

    // konstruktør
    public Animal(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    // returnere true hvis dyret har energi tilbage
    public boolean isActive() {
        return energy > 0;
    }

    // abstract fordi alle dyr angriber forskellig
    public abstract int attack();

    // trækker skade fra energien
    public void tagSkade(int skade) {
        energy -= skade;
        if (energy < 0) {
            energy = 0;
        }
    }

    public String toString() {
        return getClass().getSimpleName() + " \"" + name + "\" (energi: " + energy + ")";
    }
}