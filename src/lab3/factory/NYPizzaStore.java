package lab3.factory;

public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        Pizza pizza=null;
        if(type.equals("NYMargerita")) return new NYMargerita();
        if(type.equals("NYQuattro")) return new NYQuattro();
        return pizza;
    }
}
