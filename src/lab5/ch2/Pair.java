package lab5.ch2;

public class Pair<T extends Shoe> {
    private T first;
    private T second;

    public Pair(T firstElem, T secondElement) throws ShoesDontMatch {
        if(!check(firstElem, secondElement)) {
            throw new ShoesDontMatch();
        }
        first = firstElem;
        second = secondElement;
    }
    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }
    private boolean check(T s1, T s2) {

        if(!s1.getColor().equals(s2.getColor())) return false;
        if(s2.getSize() != s1.getSize()) return false;
        return true;
    }
}
