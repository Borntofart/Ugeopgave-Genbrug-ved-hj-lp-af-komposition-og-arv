// løve klassen - angriber altid med et fast beløb
public class Lion extends Animal {

    public Lion(String name) {
        super(name, 100);
    }

    // løven angriber altid for 15
    @Override
    public int attack() {
        return 15;
    }
}