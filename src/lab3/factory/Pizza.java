package lab3.factory;

public class Pizza {
    private String name;
    private String dough;

    public Pizza(String name, String dough) {
        this.name = name;
        this.dough = dough;
    }

    public void bake() {
        System.out.println("bake");
    }
    public void slice() {
        System.out.println("slice");
    }
    public void box() {
        System.out.println("box");
    }
}
