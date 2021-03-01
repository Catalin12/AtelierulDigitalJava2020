package quiz_help;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) {

    }
}
class ThreadWaitTEst {
    public static void main(String[] args) {
        System.out.println("1 ");
        synchronized (args) {
            System.out.println("2 ");
            try {
                args.wait();
            }catch (InterruptedException e) {

            }
        }
        System.out.println("3 ");
    }
}