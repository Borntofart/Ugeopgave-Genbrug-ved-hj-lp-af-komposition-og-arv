// Window klassen repræsentere et vindue med bredde og højde i cm
public class Window {
    int widthCm;
    int heightCm;

    // konstruktør tager bredde og højde som parametre
    public Window(int widthCm, int heightCm) {
        this.widthCm = widthCm;
        this.heightCm = heightCm;
    }

    // beregner areal af vinduet
    public int getAreaCm2() {
        return widthCm * heightCm;
    }

    // returnere vinduet som streng
    public String toString() {
        return widthCm + "x" + heightCm + "cm";
    }
}