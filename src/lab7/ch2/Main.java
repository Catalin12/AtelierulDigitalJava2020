package lab7.ch2;

public class Main {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(2000,"ba1");
        BankAccount ba2 = new BankAccount(4000,"ba2");
        BankAccount ba3 = new BankAccount(2500,"ba3");

        TransactionThread tt1 = new TransactionThread("tt1", ba1, ba2, 2000);
        TransactionThread tt2 = new TransactionThread("tt2", ba1, ba3, 1900);

        tt1.start();
        tt2.start();
    }
}
