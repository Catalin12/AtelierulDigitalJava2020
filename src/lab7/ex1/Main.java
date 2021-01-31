package lab7.ex1;

public class Main {
    public static int v=0;
    public static void main(String[] args) throws Exception {
        System.out.println("before:" + v);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                v++;
            }
        };
        for(int i=0; i<500; i++) {
            (new Thread(runnable)).start();
        }
        Thread.sleep(500);
        System.out.println("after:" + v);
    }
}
