// kanin klassen - svagt angreb men meget energi
public class Rabbit extends Animal {

    public Rabbit(String name) {
        super(name, 150); // kaninen har 150 energi, meget mere end de andre
    }

    // kaninen angriber kun for 4, ikke super farlig
    @Override
    public int attack() {
        return 4;
    }
}