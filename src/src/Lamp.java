// Lamp klassen repræsentere en lampe med watt og on/off status
public class Lamp {
    int watt;        // hvor mange watt lampen bruge
    boolean isOn;    // om lampen er tændt eller ej

    // Konstruktør modtager watt, isOn starte altid som false
    public Lamp(int watt) {
        this.watt = watt;
        this.isOn = false;
    }

    // tænder lampen
    public void turnOn() {
        isOn = true;
    }

    // slukker lampen
    public void turnOff() {
        isOn = false;
    }

    // returnere lampen som en streng
    public String toString() {
        return watt + "W";
    }
}