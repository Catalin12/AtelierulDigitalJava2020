package lab5.ch4;

public class ArrayIterator<T> implements IArrayIterator<T> {
    protected T[] arr;
    protected int index;

    public ArrayIterator(T[] arr) {
        this.arr = arr;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if(this.index < arr.length) return true;
        return false;
    }

    @Override
    public T next() {
        return arr[index++];
    }
}
