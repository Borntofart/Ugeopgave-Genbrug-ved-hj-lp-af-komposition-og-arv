// contest klassen styrer en kamp mellom to dyr
public class Contest {
    Animal animal1;
    Animal animal2;
    int antalRunder;  // tæller runder

    public Contest(Animal a1, Animal a2) {
        this.animal1 = a1;
        this.animal2 = a2;
        antalRunder = 0;
    }

    // spiller en runde, begge dyr angriber
    public void playRound() {
        if (!animal1.isActive() || !animal2.isActive()) {
            System.out.println("kampen er slut allerede!");
            return;
        }

        antalRunder++;
        System.out.println("--- Runde " + antalRunder + " ---");

        // dyr1 angriber dyr2
        int skade1 = animal1.attack();
        animal2.tagSkade(skade1);
        System.out.println(animal1.getName() + " angriber " + animal2.getName() + " for " + skade1 +
                "! (" + animal2.getName() + " har " + animal2.getEnergy() + " energi tilbage)");

        // kun hvis dyr2 stadig lever
        if(animal2.isActive()){
            int skade2 = animal2.attack();
            animal1.tagSkade(skade2);
            System.out.println(animal2.getName() + " angriber " + animal1.getName() + " for " + skade2 +
                    "! (" + animal1.getName() + " har " + animal1.getEnergy() + " energi tilbage)");
        }
        System.out.println();
    }

    // returnere vinderen eller null hvis ingen er ude endnu
    public Animal getWinner() {
        if (!animal1.isActive() && animal2.isActive()) {
            return animal2;
        } else if(!animal2.isActive() && animal1.isActive()) {
            return animal1;
        }
        return null;
    }

    // kør kampen til en vinder
    public void playUntilWinner() {
        System.out.println("=== Kamp: " + animal1.getName() + " vs " + animal2.getName() + " ===");
        System.out.println();

        while (getWinner() == null && animal1.isActive() && animal2.isActive()) {
            playRound();
        }

        Animal vinder = getWinner();
        if (vinder != null) {
            System.out.println("Vinder: " + vinder);
        } else {
            System.out.println("uafgjort, begge er ude");
        }
        System.out.println();
    }
}