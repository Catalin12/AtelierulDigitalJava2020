package lab7.ch1;

public class Main {
    public static void main(String[] args) {
        Thread t;
        for(int i=0; i<=10; i++) {
            if(i%2 == 0) {
                t = new Thread(new RabbitRunnable(i));
            }
            else {
                t = new RabbitThread(i);
            }
            t.start();
        }
    }
}
