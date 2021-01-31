package lab6.ch1;

import java.util.*;

public class Main {
    public static void displayLeaders(List<Integer> list) {
        Collections.reverse(list);
        Iterator<Integer> it = list.iterator();
        Integer currentElement = list.get(0);
        Integer max = list.get(0);
        while(it.hasNext()) {
            currentElement = it.next();
            if(currentElement > max) {
                System.out.print(currentElement + " ");
                max = currentElement;
            }
        }
    }

    public static void main(String[] args) {
        displayLeaders(Arrays.asList(1, 5, 11, 2, 9, 7, 2, 5, 4, 1));
    }


}
