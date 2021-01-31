package lab7.ch2;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Not enoughmoney in your account!");
    }
}
