// ulve klassen - angriber med tilfældig skade
public class Wolf extends Animal {

    public Wolf(String name) {
        super(name, 90); // ulven har 90 energi
    }

    // random angreb mellom 5 og 20
    @Override
    public int attack() {
        int skade = (int)(Math.random() * 16) + 5;
        return skade;
    }
}