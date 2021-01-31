package lab7.ch2;

public class TransactionThread extends Thread {
    private String name;
    private BankAccount from;
    private BankAccount to;
    private double amount;
    public TransactionThread(String name, BankAccount from, BankAccount to, double amount) {
        this.name = name;
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public void run() {
        transfer(from, to, amount);
    }

    private void transfer(BankAccount from, BankAccount to, double amount)  {
        try {
            from.withdraw(amount);
            to.deposit(amount);
        } catch (InsufficientFundsException e) {
            System.out.println(e);
        }
    }
}
