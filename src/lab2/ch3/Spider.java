package lab2.ch3;

public class Spider extends Animal {
    public Spider() {
        super(8); //ne folosim de constructoru animalului din Class Animal
    }
    public void eat() {
        super.eat();
        System.out.println(" like a spider");
    }
}
