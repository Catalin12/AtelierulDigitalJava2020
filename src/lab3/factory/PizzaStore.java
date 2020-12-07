package lab3.factory;

public abstract class PizzaStore {
    protected abstract Pizza createPizza(String type);
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.bake();
        pizza.slice();
        pizza.box();

        return pizza;
    }

}
