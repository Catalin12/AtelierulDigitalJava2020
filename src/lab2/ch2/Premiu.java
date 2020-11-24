package lab2.ch2;

public class Premiu {
    public String name;
    public int an;

    public Premiu(String name, int an) {
        this.name = name;
        this.an=an;
    }

    public void print() {
        System.out.println(name + " " + an);
    }

}
