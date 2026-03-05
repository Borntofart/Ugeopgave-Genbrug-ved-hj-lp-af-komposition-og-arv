import java.util.ArrayList;

// Room klassen er et rum der kan have lamper og vinduer
public class Room {
    String name;
    ArrayList<Lamp> lamps;        // ler
    ArrayList<Window> windows;    //

    // konstruktør initialisere listerne så de er klar
    public Room(String name) {
        this.name = name;
        lamps = new ArrayList<Lamp>();
        windows = new ArrayList<Window>();
    }

    // tilføjer en lampe til rummet
    public void addLamp(Lamp lamp) {
        lamps.add(lamp);
    }

    // tilføjer et vindue til rummet
    public void addWindow(Window window) {
        windows.add(window);
    }

    // returnere antal lamper i rummet
    public int getLampCount() {
        return lamps.size();
    }

    // summer alle lampernes watt og returnere totalen
    public int getTotalWatt() {
        int total = 0;
        for (Lamp l : lamps) {
            total += l.watt;
        }
        return total;
    }

    // summer arealet af alle vinduer
    public int getTotalWindowArea() {
        int area = 0;
        for (Window w : windows) {
            area = area + w.getAreaCm2();
        }
        return area;
    }

    // printer rummet med lamper og vinduer
    public void printRoom() {
        System.out.println(name + " (" + getLampCount() + " lamper, " + windows.size() + " vinduer)");

        // printer alle lamper
        System.out.print("  Lamper: ");
        for (int i = 0; i < lamps.size(); i++) {
            System.out.print(lamps.get(i));
            if (i < lamps.size() - 1) System.out.print(", ");
        }
        System.out.println(" (total: " + getTotalWatt() + "W)");

        // printer alle vinduer
        System.out.print("  Vinduer: ");
        for (int i = 0; i < windows.size(); i++) {
            System.out.print(windows.get(i));
            if(i < windows.size()-1) System.out.print(", ");
        }
        System.out.println();
    }
}