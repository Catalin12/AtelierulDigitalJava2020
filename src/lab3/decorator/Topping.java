package lab3.decorator;

public class Topping extends Beverage {
    private Beverage wrappedBeverage;

    public Topping(String name, int cost, Beverage wrappedBeverage) {
        super(name, cost);
        this.wrappedBeverage = wrappedBeverage;
    }

    public int getCost() {
        return super.getCost() + wrappedBeverage.getCost();
    }
    public String getDescription() {
        return wrappedBeverage.getDescription() + " " + name;
    }
}
