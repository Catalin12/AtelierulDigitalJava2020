package lab5.ch2;

public class ShoesDontMatch extends Exception {
    public ShoesDontMatch() {
        super("Wrong params, they must be of same color and size!");
    }
}
