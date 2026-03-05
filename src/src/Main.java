import java.util.ArrayList;

// main klassen - del 1
public class Main {
    public static void main(String[] args) {

//        // opret bygningen
//        Building bygning = new Building("Kontorbygningen");
//
//        // mødelokale med 3 lamper og 2 vinduer
//        Room moedeRoom = new Room("Mødelokale");
//        moedeRoom.addLamp(new Lamp(60));
//        moedeRoom.addLamp(new Lamp(60));
//        moedeRoom.addLamp(new Lamp(100));
//        moedeRoom.addWindow(new Window(120, 90));
//        moedeRoom.addWindow(new Window(120, 90));
//
//        // køkken med 2 lamper og 1 vindue
//        Room koekken = new Room("Køkken");
//        koekken.addLamp(new Lamp(40));
//        koekken.addLamp(new Lamp(40));
//        koekken.addWindow(new Window(60, 60));
//
//        // toilet med 2 lamper og et vindue
//        Room toilet = new Room("Toilet");
//        toilet.addLamp(new Lamp(25));
//        toilet.addLamp(new Lamp(25));
//        toilet.addWindow(new Window(40, 50));
//
//        // tilføj rum til bygningen
//        bygning.addRoom(moedeRoom);
//        bygning.addRoom(koekken);
//        bygning.addRoom(toilet);
//
//        // print bygningen
//        bygning.printBuilding();
//
//        System.out.println("Antal lamper i bygningen: " + bygning.getTotalLampCount());
//        System.out.println("Samlet wattal: " + bygning.getTotalWatt() + "W");

        //Del 2 yeeeee
        // opretter dyrene og putter dem i en liste
        ArrayList<Animal> dyreListe = new ArrayList<Animal>();
        dyreListe.add(new Lion("Simba"));
        dyreListe.add(new Wolf("Shadow"));
        dyreListe.add(new Rabbit("Flops"));
        dyreListe.add(new Lion("Mufasa"));
        dyreListe.add(new Wolf("Grey"));

        // kamp 1 løve vs ulv
        Contest kamp1 = new Contest(dyreListe.get(0), dyreListe.get(1));
        kamp1.playUntilWinner();

        // kamp 2 kanin vs løve
        Contest kamp2 = new Contest(dyreListe.get(2), dyreListe.get(3));
        kamp2.playUntilWinner();

        // kamp 3 ulv vs løve (simba kan godt have mistet energi fra kamp 1)
        Contest kamp3 = new Contest(dyreListe.get(4), dyreListe.get(0));
        kamp3.playUntilWinner();
    }
}