class Item {
    String name;
    double weight;
    double value;

    public Item(String name, double weight, double value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
    }
}

class Weapon extends Item {
    int damage;
    int durability;

    public Weapon(String name, double weight, double value, int damage, int durability) {
        super(name, weight, value);
        this.damage = damage;
        this.durability = durability;
    }
}

class Armor extends Item {
    int defense;
    int durability;

    public Armor(String name, double weight, double value, int defense, int durability) {
        super(name, weight, value);
        this.defense = defense;
        this.durability = durability;
    }
}