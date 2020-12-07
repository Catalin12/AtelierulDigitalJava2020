package lab3.decorator;

public class Whip extends Topping {
    public Whip(Beverage wrappedBeverage) {
        super("Whip", 5, wrappedBeverage);
    }

}
