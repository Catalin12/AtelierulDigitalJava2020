package lab5.ch6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class BinarySearch<T extends Comparable<T>>  {
    protected T[] arr;

    public BinarySearch(T[] arr) {
        this.arr = arr;
    }
    //1, 2, 3, 5, 2, 2, 4, 3,
    public boolean sorted() {
        boolean growing = false;
        boolean descending = false;
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i].compareTo(arr[i+1]) < 0) growing=true;
            else if(arr[i].compareTo(arr[i+1]) > 0) descending=true;
            if(growing && descending) return false;
        }
        return true;
    }


    public void search(T value) {

        int l = 0, r = arr.length - 1;
        boolean founded = false;
        while(l <= r && founded == false) {
            int m = l + (r - l) / 2;
            if (arr[m].equals(value)) {
                founded = true;
                break;
            }
            if(arr[m].compareTo(value) < 0) l = m+1;
            else r = m-1;
        }
        if(founded) System.out.println(value);
        else System.out.println("Fail to search value in array.");
        /*

        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        */


    }
}
