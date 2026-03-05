import java.util.ArrayList;

// Building klassen repræsentere en bygning der indeholder rum
public class Building {
    String name;
    ArrayList<Room> rooms;

    public Building(String name) {
        this.name = name;
        rooms = new ArrayList<Room>();
    }

    // tilføjer et rum til bygningen
    public void addRoom(Room room) {
        rooms.add(room);
    }

    // tæller alle lamper på tværs af rum
    public int getTotalLampCount() {
        int count = 0;
        for (Room r : rooms) {
            count += r.getLampCount();
        }
        return count;
    }

    // summer alt watt i hele bygningen
    public int getTotalWatt() {
        int totalWatt = 0;
        for(Room r : rooms){
            totalWatt += r.getTotalWatt();
        }
        return totalWatt;
    }

    // printer hele bygningen med alle rum og en total til sidst
    public void printBuilding() {
        System.out.println("=== " + name + " ===");
        System.out.println();

        for (Room r : rooms) {
            r.printRoom();
            System.out.println();
        }

        System.out.println("Total: " + getTotalLampCount() + " lamper, " + getTotalWatt() + "W");
    }
}