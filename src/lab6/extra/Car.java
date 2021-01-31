package lab6.extra;

public class Car implements Comparable<Car> {
    private int year;
    private float engineSize;
    private String name;

    public Car(int year, float engineSize, String name) {
        this.year = year;
        this.engineSize = engineSize;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", engineSize=" + engineSize +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        if(year > o.year) return 1;
        if(year < o.year) return -1;
        if(engineSize > o.engineSize) return 1;
        if(engineSize < o.engineSize) return -1;
        return 0;
    }
}
