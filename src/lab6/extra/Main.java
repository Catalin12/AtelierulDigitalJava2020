package lab6.extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car(1990, 2000, "Car1"));
        cars.add(new Car(2019, 2000, "Car2"));
        cars.add(new Car(2016, 2000, "Car3"));
        cars.add(new Car(2016, 2003, "Car4"));
        System.out.println(cars);
        Collections.sort(cars);
        System.out.println(cars);
    }
}
