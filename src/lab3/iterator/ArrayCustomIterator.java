package lab3.iterator;

import java.util.Iterator;

public class ArrayCustomIterator {
    protected int[] arr;
    protected int index;

    public ArrayCustomIterator(int[] arr) {
        this.arr = arr;
        this.index = 0;
    }

    public boolean hasNext() {
        if(this.index < arr.length) return true;
        return false;
    }
    public int next() {
        return arr[index++];
    }
}
