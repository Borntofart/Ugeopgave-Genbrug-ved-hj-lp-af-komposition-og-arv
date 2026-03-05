public class iteration4 {

    void main(String[] args) {
        Character hero = new Character("Lucas", "Figther");
        Character enemy = new Character("Goblin", "Rogue");

        hero.printCharacterSheet();
        enemy.printCharacterSheet();

        // Attack tur, goblin vs lucas// enemy vs hero
        hero.attack(enemy);
        enemy.attack(hero);

        hero.printCharacterSheet();
        enemy.printCharacterSheet();
    }
}

//DEL 3 SVAR
//    Komposition (has-a):
//    Jeg bruger komposition mellem Character og Item klasserne (selvom det ikke
//    er helt implementeret endnu). En Character "has-a" Item/Weapon/Armor fordi
//    en karakter kan eje ting. Relationen er at Character ejer sine items,
//    hvis Character forsvinder giver det ikke mening at itemsne eksistere.
//
//    Et andet sted jeg kunne bruge komposition er at give Character et inventory
//    som fx en ArrayList<Item> så har Character "has-a" liste af items.
//
//    Nedarving (is-a):
//    Weapon og Armor ligner hinanden rigtig meget, begge har felterne
//    name, weight, value (fra Item) og begge har durability.
//    De arver allerede begge fra Item, det er faktisk nedarving jeg allerede bruger!
//
//    Item er superklassen, Weapon og Armor er subklasser.
//    Weapon "is-a" Item, og Armor "is-a" Item.
//
//    Man kunne også kigge på Character klassen, hvis man ville have flere
//    karakter typer som fx Fighter og Rogue som rigtige klasser, kunne de
//    begge arve fra Character. Fighter "is-a" Character osv.
//
