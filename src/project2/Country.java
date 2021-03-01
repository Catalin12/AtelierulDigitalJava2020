package project2;

public class Country {
    String name;
    Integer towns;
    Parliament parlament;
    public Country(String name, Integer towns) {
        this.name = name;
        parlament = new Parliament(name);
        this.towns=towns;
    }
    public Parliament getParlament() {
        return parlament;
    }
}
