package lab3.factory;

public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("CHMargerita")) return new CHMargerita();
        if(type.equals("CHQuattro")) return new CHQuattro();
        return pizza;
    }
}
