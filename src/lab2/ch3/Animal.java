package lab2.ch3;

public abstract class Animal {
    //# -  protected
    protected int legs;
    protected Animal(int legs) {
        this.legs=legs;
    }
    //+ public
    //- privat
    public void walk() {
        System.out.println("Walk was called.");
    }
    public void eat() {
        System.out.println("Eat was called.");
    }
}
