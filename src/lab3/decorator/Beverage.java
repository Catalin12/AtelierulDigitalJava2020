package lab3.decorator;

public abstract class Beverage {
    protected String name;
    private int cost;
    public Beverage(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
    public int getCost() {
        return cost;
    }


    public String getDescription() {
        return "Beverage " + name + ": ";
    }
}
