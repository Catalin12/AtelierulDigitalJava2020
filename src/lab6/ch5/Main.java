package lab6.ch5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static List<Integer> merge(List<Integer> list1, List<Integer>list2) {
        List<Integer> toReturn = new ArrayList<Integer>();

        Iterator<Integer> it1 = list1.iterator();
        Iterator<Integer> it2 = list2.iterator();
        Integer current1;
        Integer current2;
        current1 = it1.next();
        current2 = it2.next();
        while(it1.hasNext() && it2.hasNext()) {
            if(current1.compareTo(current2) < 0) {
                toReturn.add(current1);
                current1 = it1.next();
            } else {
                toReturn.add(current2);
                current2 = it2.next();
            }
            if(current1.compareTo(current2) < 0) {
                toReturn.add(current1);
                toReturn.add(current2);
            } else {
                toReturn.add(current2);
                toReturn.add(current1);
            }

            while(it1.hasNext()) {
                toReturn.add(it1.next());
            }
            while(it2.hasNext()) {
                toReturn.add(it2.next());
            }
        }
        return toReturn;
    }

    public static void main(String[] args) {
        List<Integer> result = merge(Arrays.asList(1,5,6,9,13,15,16), Arrays.asList(1,2,3,11,12,14,23,24));
        System.out.println(result);
    }
}
