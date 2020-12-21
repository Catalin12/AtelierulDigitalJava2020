package lab5.ch6;

import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws CheckException {
        Integer[] list = new Integer[] {1, 2, 1, 4, 5, 6, 7, 8, 9};
        Integer x = 9;
        
        BinarySearch<Integer> bn = new BinarySearch<>(list);
        //bn.search(x);
        if(bn.sorted() == false) System.out.println("The list isn't sorted!");
        else bn.search(x);
    }
}
