package lab2.ch3;

public class Fish extends Animal implements Pet {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Play like a fish");
    }

    @Override
    public void walk() {
        super.walk;
        System.out.println(" like a fish.");
    }
    @Override
    public void eat() {
        super.walk;
        System.out.println(" eat a fish.");
    }
}
