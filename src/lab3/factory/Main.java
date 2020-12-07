package lab3.factory;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PizzaStore chPizzaStore=new ChicagoPizzaStore();
        PizzaStore nyPizzaStore=new NYPizzaStore();

        Pizza p1=chPizzaStore.orderPizza("CHMargerita");
        Pizza p2=nyPizzaStore.orderPizza("NYMargerita");
        System.out.println(p1);
        System.out.println(p2);
    }
}
